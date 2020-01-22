$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
	$.ajax(
			 {
				 url:baseUrl+"/roles",
				 type: 'GET',
				 success : function(result) {
					 var stringified = JSON.stringify(result);
					 var parsedObj = JSON.parse(stringified);
					 for (var i in parsedObj) {
						 var item =parsedObj[i];
						 $('#role').append( '<option value="'+item+'">'+item.toUpperCase()+'</option>' );
					 }
				 },
				 error : function(error) {
					 console.log('Error ${error}')
				 }
			 }
	)
	
	$('#submit').on('click', function(e) {
		e.preventDefault();
		if ($('#psw')[0].value === $('#psw-repeat')[0].value) {
			var uploadUrl = baseUrl+"/register";
			var object = {};
			var form = $('#registrationform')[0];
			var formData = new FormData(form);
			formData.forEach(function(value, key){
				object[key] = value;
			});
			var json = JSON.stringify(object);
			$.ajax( {
				url:baseUrl+"/register",
				type: 'POST',
				contentType: "application/json; charset=utf-8",
				dataType: "json",
				data : json,
				success : function(result) {
					alert("registration is successful");
					window.location.replace(baseUrl+"/registrationsuccessful");
				},
				error : function(result) {
					if(!result) {
						alert("registration is not successful");
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
