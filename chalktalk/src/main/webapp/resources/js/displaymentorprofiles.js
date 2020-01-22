$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
	$.ajax({
		url : baseUrl + "/getAllMentorProfiles",
		type : 'GET',
		success : function(result) {
			var stringified = JSON.stringify(result);
			var parsedObj = JSON.parse(stringified);
			for (var i in parsedObj) {
			 var item =parsedObj[i];
			 var figureTag = document.createElement('figure');
			 var imgTag = document.createElement('img');
			 imgTag.imageindex = i;
			 imgTag.class = "column";
			 imgTag.src = "data:image/jpg;base64,"+item.profilePic;
			 imgTag.width = "289";
			 imgTag.height = "305";
			 imgTag.onclick = function image(img) {
				 var currentItem = parsedObj[img.srcElement.imageindex];
				 var divTag = document.createElement('div');
				 var lineBreak = document.createElement("BR");
				 
				 var pTagName = document.createElement('p');
				 var pTagNameNode = document.createTextNode("Name : "+currentItem.mentorName);
				 pTagName.appendChild(pTagNameNode);
				 divTag.appendChild(pTagName);
				 
				 var pTagPSI = document.createElement('p');
				 var pTagPSINode = document.createTextNode("Primary Service Industry : "+currentItem.primaryserviceindustry);
				 pTagName.appendChild(pTagPSINode);
				 divTag.appendChild(pTagPSI);
				 if(currentItem.areasOfExpertise.length>0) {
					 var pTagAOE = document.createElement('p');
					 var pTagAOENode = document.createTextNode("Areas of Expertise : "+currentItem.areasOfExpertise);
					 pTagName.appendChild(pTagAOENode);
					 divTag.appendChild(pTagAOE);
				 }
			 swal({
					  title: "Mentor Profile",
					  content:divTag,
					  button: "close",
			 });
			 }
			 imgTag.style.padding = "10px";
			 var figCaptionNameTag = document.createElement("FIGCAPTION");
			 var figCaptionNameNode = document.createTextNode("Name : "+item.mentorName);
			 figCaptionNameTag.appendChild(figCaptionNameNode);
			 figureTag.style.display = "inline-block";
			 figureTag.style.alignContent = "center";
			 figureTag.appendChild(imgTag);
			 figureTag.appendChild(figCaptionNameTag);
			 document.getElementById('column').appendChild(figureTag);
			}
		},
		error : function(error) {
			console.log('Error ${error}')
		}
	})
	
	$('#myInput').on('change', function(e) {
		var object = {};
		object[$('#searchCriteria')[0].name] = $('#searchCriteria')[0].value;
		object[$('#myInput')[0].name] = $('#myInput')[0].value;
		var json = JSON.stringify(object);
		$.ajax( {
			url:baseUrl+"/getSearchResults",
			type: 'POST',
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			data : json,
			success : function(result) {
				var element =  document.getElementById('column');
				if(element!=null) {
					while (element.firstChild) {
						element.removeChild(element.firstChild);
					}
				}
				$('#column').append('<h2 id="message">Search results</h2>');
				var stringified = JSON.stringify(result);
				var parsedObj = JSON.parse(stringified);
				for (var i in parsedObj) {
				 var item =parsedObj[i];
				 var figureTag = document.createElement('figure');
				 var imgTag = document.createElement('img');
				 imgTag.imageindex = i;
				 imgTag.class = "column";
				 imgTag.src = "data:image/jpg;base64,"+item.profilePic;
				 imgTag.width = "289";
				 imgTag.height = "305";
				 imgTag.onclick = function image(img) {
					 var currentItem = parsedObj[img.srcElement.imageindex];
					 var divTag = document.createElement('div');
					 var lineBreak = document.createElement("BR");
					 
					 var pTagName = document.createElement('p');
					 var pTagNameNode = document.createTextNode("Name : "+currentItem.mentorName);
					 pTagName.appendChild(pTagNameNode);
					 divTag.appendChild(pTagName);
					 
					 var pTagPSI = document.createElement('p');
					 var pTagPSINode = document.createTextNode("Primary Service Industry : "+currentItem.primaryserviceindustry);
					 pTagName.appendChild(pTagPSINode);
					 divTag.appendChild(pTagPSI);
					 if(currentItem.areasOfExpertise.length>0) {
						 var pTagAOE = document.createElement('p');
						 var pTagAOENode = document.createTextNode("Areas of Expertise : "+currentItem.areasOfExpertise);
						 pTagName.appendChild(pTagAOENode);
						 divTag.appendChild(pTagAOE);
					 }
				 swal({
						  title: "Mentor Profile",
						  content:divTag,
						  button: "close",
				 });
				 }
				 imgTag.style.padding = "10px";
				 var figCaptionNameTag = document.createElement("FIGCAPTION");
				 var figCaptionNameNode = document.createTextNode("Name : "+item.mentorName);
				 figCaptionNameTag.appendChild(figCaptionNameNode);
				 figureTag.style.display = "inline-block";
				 figureTag.style.alignContent = "center";
				 figureTag.appendChild(imgTag);
				 figureTag.appendChild(figCaptionNameTag);
				 document.getElementById('column').appendChild(figureTag);
				}
			},
			error : function(error) {
				console.log('Error ${error}')
			}
		});		
	});
});	
