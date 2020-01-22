$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	var mentorSpecializations;
	$.ajax(
	 {
		 url:baseUrl+"/getAllCounties",
		 type: 'GET',
		 success : function(result) {
			 var stringified = JSON.stringify(result);
			 var parsedObj = JSON.parse(stringified);
			 var select = $('.county');
			 for (var i in parsedObj) {
				 var item =parsedObj[i];
				 $('#county').append( '<option value="'+item.county+'">'+item.county.toUpperCase()+'</option>' );
			 }
		 },
		 error : function(error) {
			 console.log('Error ${error}')
		 }
	 }
	)
	
	$.ajax(
	 {
		 url:baseUrl+"/getAllStates",
		 type: 'GET',
		 success : function(result) {
			 var stringified = JSON.stringify(result);
			 var parsedObj = JSON.parse(stringified);
			 for (var i in parsedObj) {
				 var item =parsedObj[i];
				 if (item.state.toUpperCase() === 'CONNECTICUT') {
					 $('#state').append( '<option value="'+item.state+'">'+item.state.toUpperCase()+'</option>' );
				 } else {
					 $('#state').append( '<option value="'+item.state+'" disabled>'+item.state.toUpperCase()+'</option>' );
				 }
			 }
		 },
		 error : function(error) {
			 console.log('Error ${error}')
		 }
	 }
	)
	
	$.ajax(
	 {
		 url:baseUrl+"/getMentorSpecilizations",
		 type: 'GET',
		 success : function(result) {
			 var stringified = JSON.stringify(result);
			 mentorSpecializations = JSON.parse(stringified);
			 for (var i in mentorSpecializations) {
				 var item =mentorSpecializations[i];
			     $('#primary-service-industry').append( '<option value="'+item.aPSIndustry+'">'+item.aPSIndustry.toUpperCase()+'</option>' );
				 
			 }
			 //removes duplicates
			 var opt = {};
			 $("#primary-service-industry > option").each(function () {
			     if(opt[$(this).text()]) {
			         $(this).remove();
			     } else {
			         opt[$(this).text()] = $(this).val();
			     }
			 });
		 },
		 error : function(error) {
			 console.log('Error ${error}')
		 }
	 }
	)	
	
	$('#primary-service-industry').on('click', function() {
		  var value = $(this).val();
		  $("#areasOfExpertise").empty();
		  for (var i in mentorSpecializations) {
				 var item =mentorSpecializations[i];
				 if (item.aPSIndustry.toUpperCase() === value.toUpperCase()) {
					 $('#areasOfExpertise').append( '<option value="'+item.specialization+'">'+item.specialization.toUpperCase()+'</option>' );
				 }
			 }
	});
	
	$('#emailId').on('change', function(e) {
		
		 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(e.currentTarget.value))
		  {
		    return (true)
		  }
		    alert("You have entered an invalid email address!")
		    return (false)
	});
	
	$('#phoneNo').on('change', function(e) {
		
		if (/^[0-9]*$/.test(e.currentTarget.value))
		  {
		    return (true)
		  }
		    alert("You have entered an invalid contact number!")
		    return (false)
	});
	
	$('#resume').on('change', function(e) {
		var fileuploaded;
		if ((file = this.files[0])) {
			fileuploaded = $( this ).val();
			var ext = fileuploaded.split('.').pop();
			   if(ext=="pdf"){
				   alert("valid type");
			   } else {
				   this.value = null;
				   alert("Invalid type");
			   }
		}	
	});
	
	$('#certificate').on('change', function(e) {
		var fileuploaded;
		if ((file = this.files[0])) {
			fileuploaded = $( this ).val();
			var ext = fileuploaded.split('.').pop();
			   if(ext=="pdf"){
				   alert("valid type");
			   } else {
				   this.value = null;
				   alert("Invalid type");
			   }
		}	
	});
	
	$('#profilePic').on('change', function(e) {
		var _URL = window.URL || window.webkitURL;
		var file, image;
		if ((file = this.files[0])) {
			if (this.files[0].type.indexOf("image")==-1) {
				this.value = null;
				alert("Invalid type");
			} else {
				image = new Image();
				image.onload = function () {
			 		  var height = this.height;
			 		  var width = this.width;
			 		  if (height > 389 || width > 305) {
			 		    alert("The dimension of the image should be 389x305 i.e height must not exceed 389 " +
			 		    		"and width must not exceed 305");
			 		    return false;
			 		  }
			 		  alert("Uploaded image has valid Height and Width.");
			 		  return true;
			 	};
			 	image.onerror = function() {
		            alert( "not a valid file: " + file.type);
		        };
		        image.src = _URL.createObjectURL(file);
		   }
		}
	});
	
	$('#submit').on('click', function(e) {
		e.preventDefault();
		var uploadUrl = baseUrl+"/uploadFiles";
		var object = {};
		var form = $('#mentorapplicationform')[0];
		var formData = new FormData(form);
        
		var resumeVal = $('#resume')[0].value; 
		var profilepicVal = $('#profilePic')[0].value; 
        if(resumeVal=='' || profilepicVal=='') 
        { 
            alert("Please upload your resume and profilepic"); 
            return false; 
        } 
		
		formData.forEach(function(value, key){
			if ((key.toLowerCase() === 'resumedoc') || (key.toLowerCase() === 'certificate') || (key.toLowerCase() === 'profilePic')) {
			
			} else {
				 object[key] = value;
			}
		});
		object[$('#county')[0].name] = $('#county')[0].value;
		object[$('#state')[0].name] = $('#state')[0].value;
		object[$('#primary-service-industry')[0].name] = $('#primary-service-industry')[0].value;
		if($('#areasOfExpertise')[0].multiple) {
			var arr = [];
			for (var i=0; i< $('#areasOfExpertise')[0].selectedOptions.length; i++) {
				var option = $('#areasOfExpertise')[0].selectedOptions[i];
				arr.push(option.value);
			}
			object[$('#areasOfExpertise')[0].name] = arr;
		} else {
			object[$('#areasOfExpertise')[0].name] = $('#areasOfExpertise')[0].value;
		}
		
		var json = JSON.stringify(object);
		$.ajax( {
			url:baseUrl+"/applyToBeMentor",
			type: 'POST',
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			data : json,
			success : function(result) {
				alert("success");
				var resume = $('#resume')[0].files[0];
				var certificate = $('#certificate')[0].files[0];
				var profilePic = $('#profilePic')[0].files[0];
			    var fd = new FormData();
		        fd.append('resume', resume);
		        fd.append('certificate', certificate);
		        fd.append('profilePic', profilePic);
		        fd.append('mentorId', result);
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
