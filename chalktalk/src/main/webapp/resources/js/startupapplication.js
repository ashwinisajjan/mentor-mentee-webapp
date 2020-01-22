$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
	$.ajax(
			 {
				 url:baseUrl+"/getCompanyStages",
				 type: 'GET',
				 success : function(result) {
					 var stringified = JSON.stringify(result);
					 var parsedObj = JSON.parse(stringified);
					 var select = $('.companystage');
					 for (var i in parsedObj) {
						 var item =parsedObj[i];
						 $('#companystage').append( '<option value="'+item.stage+'">'+item.stage.toUpperCase()+'</option>' );
					 }
				 },
				 error : function(error) {
					 console.log('Error ${error}')
				 }
			 }
	)
	$('#applicantEmailId').on('change', function(e) {
		
		 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(e.currentTarget.value))
		  {
		    return (true)
		  }
		    alert("You have entered an invalid email address!")
		    return (false)
	});
	
	$('#applicantPhoneNo').on('change', function(e) {
		
		if (/^[0-9]*$/.test(e.currentTarget.value))
		  {
		    return (true)
		  }
		    alert("You have entered an invalid contact number!")
		    return (false)
	});
	
	$('#businessPlan, #pitchDeck, #otherDocs').on('change', function(e) {
		var fileuploaded;
		if ((file = this.files[0])) {
			fileuploaded = $( this ).val();
			var ext = fileuploaded.split('.').pop();
			   if(ext=="pdf"){
				   alert("valid type");
			   } else {
				   this.value = null;
				   alert("Invalid type");
				   return false;
			   }
		}	
	});
	
	$('#submit').on('click', function(e) {
		e.preventDefault();
		var uploadUrl = baseUrl+"/savestartupapplication/uploadFiles";
		var object = {};
		var form = $('#startupapplicationform')[0];
		var formData = new FormData(form);
        
		var businessPlanVal = $('#businessPlan')[0].value; 
		var pitchDeckVal = $('#pitchDeck')[0].value; 
        if(businessPlanVal=='' || pitchDeckVal=='') 
        { 
            alert("Please upload the company's business Plan and pitch deck document"); 
            return false; 
        } 
		
		formData.forEach(function(value, key){
			if ((key.toLowerCase() === 'pitchdeck') || (key.toLowerCase() === 'otherdocs') || (key.toLowerCase() === 'businessplan')) {
			
			} else {
				 object[key] = value;
			}
		});
		if($('#mentoringsession')[0].value == 'yes') {
			object[$('#mentoringsession')[0].name] = true;
		} else  {
			object[$('#mentoringsession')[0].name] = false;
		}
		if($('#priorExperience')[0].value == 'yes') {
			object[$('#priorExperience')[0].name] = true;
		} else  {
			object[$('#priorExperience')[0].name] = false;
		}
		
		var json = JSON.stringify(object);
		$.ajax( {
			url:baseUrl+"/savestartupapplication",
			type: 'POST',
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			data : json,
			success : function(result) {
				alert("success");
				var businessplandoc = $('#businessPlan')[0].files[0];
				var pitchDeckdoc = $('#pitchDeck')[0].files[0];
				var otherDocs = $('#otherDocs')[0].files[0];
			    var fd = new FormData();
		        fd.append('businessplandoc', businessplandoc);
		        fd.append('pitchDeck', pitchDeckdoc);
		        fd.append('otherDocs', otherDocs);
		        fd.append('startupapplicationid', result);
			    var xhr = new XMLHttpRequest();
			    xhr.onreadystatechange = function() {
			        if (this.readyState == 4 && this.status == 200) {
			        	 alert("your application submitted successfully");
			        	 window.location.replace(baseUrl+"/menu");
			        }
			      };
		        xhr.open("POST", uploadUrl);
		        xhr.send(fd);
			},
			error : function(result) {
				alert("error");
			}
		}
		)
	});
});
