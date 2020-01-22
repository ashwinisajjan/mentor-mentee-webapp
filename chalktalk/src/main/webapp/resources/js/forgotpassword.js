$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
	$('#submit').on('click', function(e) {
		e.preventDefault();
		if ($('#psw')[0].value === $('#psw-repeat')[0].value) {
			var object = {};
			var form = $('#registrationform')[0];
			var formData = new FormData(form);
			formData.forEach(function(value, key){
				object[key] = value;
			});
			var json = JSON.stringify(object);
			$.ajax( {
				url:baseUrl+"/updatepassword",
				type: 'POST',
				contentType: "application/json; charset=utf-8",
				dataType: "json",
				data : json,
				success : function(result) {
					alert("password update is successful");
					window.location.replace(baseUrl+"/");
				},
				error : function(result) {
					if(!result) {
						alert("password update is not successful");
					} else {
						alert(result.responseText);
					}
					return false;
				}
			}
			)
		} else {
			alert("passwords doesn't match");
			return false;
		}
		
	});
});
