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
			 imgTag.class = "column";
			 imgTag.src = "data:image/jpg;base64,"+item.profilePic;
			 imgTag.width = "289";
			 imgTag.height = "305";
			 imgTag.onclick = function image(img) {
				 var divTag = document.createElement('div');
				 var pTagName = document.createElement('p');
				 var pTagNameNode = document.createTextNode("Name : "+item.mentorName);
				 var pTagPSI = document.createElement('p');
				 var pTagPSINode = document.createTextNode("Name : "+item.primaryserviceindustry);
				 var pTagAOE = document.createElement('p');
				 var pTagAOENode = document.createTextNode("Name : "+item.areasOfExpertise);
				 pTagName.appendChild(pTagNameNode);
				 pTagName.appendChild(pTagPSINode);
				 pTagName.appendChild(pTagAOENode);
				 divTag.appendChild(pTagName);
				 divTag.appendChild(pTagPSI);
				 divTag.appendChild(pTagAOE);
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
});	
