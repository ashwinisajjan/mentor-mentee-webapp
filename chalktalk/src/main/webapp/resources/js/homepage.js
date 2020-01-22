$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
	/*$.ajax(
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
	)*/
});
