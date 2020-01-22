$(document).ready(function () {
	var getUrl = window.location;
	var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1];
	
    $('.left-half ul li:first').addClass('active');
    $('.right-half:not(:first)').hide();
    $('.left-half ul li a').click(function (event) {
        event.preventDefault();
        var content = $(this).attr('href');
        $(this).parent().addClass('active');
        $(this).parent().siblings().removeClass('active');
        $(content).show();
        $(content).siblings('.right-half').hide();
    });
    
    //mentor Applications
    $('#mentorhref').on('click', function(e) {
    	$.ajax(
	    	{
	    		 url:baseUrl+"/admin/getAllMentorApplications",
	    		 type: 'GET',
	    		 success : function(result) {
	    			 if (result === undefined || result.length == 0) {
	    				 var elementExists = document.getElementById("message");
	    				 if(elementExists == null) {
	    					 $('#mentor-section').append('<h2 id="message">Either desicion on all application are taken or no applications</h2>');
	    				 }
	    			 } else {
	    				var elementExists = document.getElementById("tableId");
	    				if(elementExists != null) {
	    					elementExists.parentNode.removeChild(elementExists);
	    				}
	    				var stringified = JSON.stringify(result);
		    			var parsedObj = JSON.parse(stringified);
		    			var col = [];
		    			for (var i in parsedObj) {
		    				for (var key in parsedObj[i]) {
		    	                if (col.indexOf(key) === -1) {
		    	                    col.push(key);
		    	                }
		    	            }
		    			}
		    			col.push('decision');
		    			var table = document.createElement("table");
		    			table.id="tableId";
		    			var tr = table.insertRow(-1); 
		    			
		    			for (var i = 0; i < col.length; i++) {
		    					var th = document.createElement("th");      // TABLE HEADER.
			    	            th.innerHTML = col[i];
			    	            tr.appendChild(th);
		    	        }
		    			
		    			 // ADD JSON DATA TO THE TABLE AS ROWS.
		    	        for (var i = 0; i < parsedObj.length; i++) {

		    	            tr = table.insertRow(-1);

		    	            for (var j = 0; j < col.length; j++) {
		    	                var tabCell = tr.insertCell(-1);
		    	                if(col[j].toLowerCase() === 'resume') {
		    	                	var btn = document.createElement('input');
		    	                	btn.type = "button";
		    	                	btn.className = "btn";
		    	                	btn.value = "Download";
		    	                	btn.onclick = (function(e) {
		    	                		$.ajax({
			    	                		type: "GET",
			    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].resume,
			    	                		//data: { logDownload: true, file: $(this).attr("download") },
			    	                		success : function(result) {
			    	                			var uint8Array = new Uint8Array(result);
			    	                			function base64ToArrayBuffer(result) {
			    	                			    var binaryString = window.atob(result);
			    	                			    var binaryLen = binaryString.length;
			    	                			    var bytes = new Uint8Array(binaryLen);
			    	                			    for (var i = 0; i < binaryLen; i++) {
			    	                			       var ascii = binaryString.charCodeAt(i);
			    	                			       bytes[i] = ascii;
			    	                			    }
			    	                			    return bytes;
			    	                			 }
			    	                			var resumelink = document.createElement('a');
			    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
			    	    	                	resumelink.href = window.URL.createObjectURL(blob);
			    	    	                    var fileName = 'resume';
			    	    	                    resumelink.download = fileName,
			    	    	                    resumelink.click();
			    	                		},
			    	                		error : function(result) {
			    	                			alert("Could not download the attachment "+result);
			    	                		}
			    	                		});
		    	                	});
		    	                	tabCell.appendChild(btn);
		    	                } else if(col[j].toLowerCase() === 'certificates') {
		    	                	if (parsedObj[i][col[j]] === 'undefined' || parsedObj[i][col[j]] == null) {
		    	                		tabCell.innerHTML = '<h5>no certificates</h5>';
		    	                	} else {
		    	                		var btn = document.createElement('input');
			    	                	btn.type = "button";
			    	                	btn.className = "btn";
			    	                	btn.value = "Download";
			    	                	btn.onclick = (function(e) {
			    	                		$.ajax({
				    	                		type: "GET",
				    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].certificates,
				    	                		async: true,
				    	                		//data: { logDownload: true, file: $(this).attr("download") },
				    	                		success : function(result) {
				    	                			var uint8Array = new Uint8Array(result);
				    	                			function base64ToArrayBuffer(result) {
				    	                			    var binaryString = window.atob(result);
				    	                			    var binaryLen = binaryString.length;
				    	                			    var bytes = new Uint8Array(binaryLen);
				    	                			    for (var i = 0; i < binaryLen; i++) {
				    	                			       var ascii = binaryString.charCodeAt(i);
				    	                			       bytes[i] = ascii;
				    	                			    }
				    	                			    return bytes;
				    	                			 }
				    	                			var resumelink = document.createElement('a');
				    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
				    	    	                	resumelink.href = window.URL.createObjectURL(blob);
				    	    	                    var fileName = 'certificate';
				    	    	                    resumelink.download = fileName,
				    	    	                    resumelink.click();
				    	                		},
				    	                		error : function(result) {
				    	                			alert("Could not download the attachment"+result);
				    	                		}
				    	                		});
			    	                	});
			    	                	tabCell.appendChild(btn);
		    	                	}
		    	                } else if(col[j].toLowerCase() === 'decision') {
		    	                	var acceptbtn = document.createElement('input');
		    	                	acceptbtn.type = "button";
		    	                	acceptbtn.className = "btn";
		    	                	acceptbtn.value = "Accept";
		    	                	acceptbtn.onclick = (function(e) {
		    	                		var object = {};
		    	                		object['id'] = parsedObj[this.parentNode.parentNode.rowIndex-1].mentorId;
		    	                		object['applicationDecision'] = true;
		    	                		var json = JSON.stringify(object);
		    	                		$.ajax({
			    	                		type: "POST",
			    	                		url: baseUrl+'/sendemail',
			    	                		contentType: "application/json; charset=utf-8",
			    	            			dataType: "json",
			    	            			data : json,
			    	                		success : function(result) {
			    	                		  if (result) {
			    	                			  alert("Email Sent");
			    	                		  }
			    	                		},
			    	                		error : function(result) {
			    	                			alert("Email could not be sent");
				    	                	}
		    	                		});
		    	                	});	
		    	                	tabCell.appendChild(acceptbtn);
		    	                	var rejectbtn = document.createElement('input');
		    	                	rejectbtn.type = "button";
		    	                	rejectbtn.className = "btn";
		    	                	rejectbtn.value = "Reject";
		    	                	rejectbtn.onclick = (function(e) {
		    	                		var object = {};
		    	                		object['id'] = parsedObj[this.parentNode.parentNode.rowIndex-1].mentorId;
		    	                		object['applicationDecision'] = false;
		    	                		var json = JSON.stringify(object);
		    	                		$.ajax({
			    	                		type: "POST",
			    	                		url: baseUrl+'/sendemail',
			    	                		contentType: "application/json; charset=utf-8",
			    	            			dataType: "json",
			    	            			data : json,
			    	                		success : function(result) {
			    	                		  if (result) {
			    	                			  alert("Email Sent");
			    	                		  }
			    	                		},
			    	                		error : function(result) {
			    	                			alert("Email could not be sent");
				    	                	}
		    	                		});
		    	                	});
		    	                	tabCell.appendChild(rejectbtn);
		    	    	            //tabCell.innerHTML = '<input type="button" id="btnAdd1" value="Accept">'+'<span><input type="button" id="btnAdd2" value="Reject">';
		    	                }  else  {
		    	                	tabCell.innerHTML = parsedObj[i][col[j]];
		    	                }
		    	            }
		    	        }
		    	        table.border="1";
		    	        $('#mentor-section').append(table);
	    			}
	    		 },
	    		 error : function(error) {
	    					 console.log('Error ${error}')
	    				 }
	    		 }
	    )
	});
    
    //statup applications
    $('#applicationsref').on('click', function(e) {
    	$.ajax(
	    	{
	    		 url:baseUrl+"/admin/getAllStartupApplications",
	    		 type: 'GET',
	    		 success : function(result) {
	    			 if (result === undefined || result.length == 0) {
	    				 var elementExists = document.getElementById("message");
	    				 if(elementExists == null) {
	    					 $('#applications-section').append('<h2 id="message">Either desicion on all application are taken or no applications</h2>');
	    				 }
	    			 } else {
		    				var elementExists = document.getElementById("tableId");
		    				if(elementExists != null) {
		    					elementExists.parentNode.removeChild(elementExists);
		    				}
		    				var stringified = JSON.stringify(result);
			    			var parsedObj = JSON.parse(stringified);
			    			var col = [];
			    			for (var i in parsedObj) {
			    				for (var key in parsedObj[i]) {
			    	                if (col.indexOf(key) === -1) {
			    	                    col.push(key);
			    	                }
			    	            }
			    			}
			    			col.push('decision');
			    			var table2 = document.createElement("table");
			    			table2.id="tableId";
			    			var tr = table2.insertRow(-1); 
			    			
			    			for (var i = 0; i < col.length; i++) {
			    					var th = document.createElement("th");      // TABLE HEADER.
				    	            th.innerHTML = col[i];
				    	            tr.appendChild(th);
			    	        }
			    			
			    			 // ADD JSON DATA TO THE TABLE AS ROWS.
			    	        for (var i = 0; i < parsedObj.length; i++) {

			    	            tr = table2.insertRow(-1);

			    	            for (var j = 0; j < col.length; j++) {
			    	                var tabCell = tr.insertCell(-1);
			    	                if(col[j].toLowerCase() === 'deatilsdoc') {
			    	                	var btn = document.createElement('input');
			    	                	btn.type = "button";
			    	                	btn.className = "btn";
			    	                	btn.value = "Download";
			    	                	btn.onclick = (function(e) {
			    	                		$.ajax({
				    	                		type: "GET",
				    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].deatilsDoc,
				    	                		success : function(result) {
				    	                			var uint8Array = new Uint8Array(result);
				    	                			function base64ToArrayBuffer(result) {
				    	                			    var binaryString = window.atob(result);
				    	                			    var binaryLen = binaryString.length;
				    	                			    var bytes = new Uint8Array(binaryLen);
				    	                			    for (var i = 0; i < binaryLen; i++) {
				    	                			       var ascii = binaryString.charCodeAt(i);
				    	                			       bytes[i] = ascii;
				    	                			    }
				    	                			    return bytes;
				    	                			 }
				    	                			var resumelink = document.createElement('a');
				    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
				    	    	                	resumelink.href = window.URL.createObjectURL(blob);
				    	    	                    var fileName = 'detailsof';
				    	    	                    resumelink.download = fileName,
				    	    	                    resumelink.click();
				    	                		},
				    	                		error : function(result) {
				    	                			alert("Could not download the attachment "+result);
				    	                		}
				    	                		});
			    	                	});
			    	                	tabCell.appendChild(btn);
			    	                } else if(col[j].toLowerCase() === 'businessdoc') {
			    	                	if (parsedObj[i][col[j]] === 'undefined' || parsedObj[i][col[j]] == null) {
			    	                		tabCell.innerHTML = '<h5>no docs</h5>';
			    	                	} else {
			    	                		var btn = document.createElement('input');
				    	                	btn.type = "button";
				    	                	btn.className = "btn";
				    	                	btn.value = "Download";
				    	                	btn.onclick = (function(e) {
				    	                		$.ajax({
					    	                		type: "GET",
					    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].businessdoc,
					    	                		//data: { logDownload: true, file: $(this).attr("download") },
					    	                		success : function(result) {
					    	                			var uint8Array = new Uint8Array(result);
					    	                			function base64ToArrayBuffer(result) {
					    	                			    var binaryString = window.atob(result);
					    	                			    var binaryLen = binaryString.length;
					    	                			    var bytes = new Uint8Array(binaryLen);
					    	                			    for (var i = 0; i < binaryLen; i++) {
					    	                			       var ascii = binaryString.charCodeAt(i);
					    	                			       bytes[i] = ascii;
					    	                			    }
					    	                			    return bytes;
					    	                			 }
					    	                			var resumelink = document.createElement('a');
					    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
					    	    	                	resumelink.href = window.URL.createObjectURL(blob);
					    	    	                    var fileName = 'businessdocOf';
					    	    	                    resumelink.download = fileName,
					    	    	                    resumelink.click();
					    	                		},
					    	                		error : function(result) {
					    	                			alert("Could not download the attachment"+result);
					    	                		}
					    	                		});
				    	                	});
				    	                	tabCell.appendChild(btn);
			    	                	}
			    	                }else if(col[j].toLowerCase() === 'pitchdeck') {
			    	                	if (parsedObj[i][col[j]] === 'undefined' || parsedObj[i][col[j]] == null) {
			    	                		tabCell.innerHTML = '<h5>no docs</h5>';
			    	                	} else {
			    	                		var btn = document.createElement('input');
				    	                	btn.type = "button";
				    	                	btn.className = "btn";
				    	                	btn.value = "Download";
				    	                	btn.onclick = (function(e) {
				    	                		$.ajax({
					    	                		type: "GET",
					    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].pitchdeck,
					    	                		//data: { logDownload: true, file: $(this).attr("download") },
					    	                		success : function(result) {
					    	                			var uint8Array = new Uint8Array(result);
					    	                			function base64ToArrayBuffer(result) {
					    	                			    var binaryString = window.atob(result);
					    	                			    var binaryLen = binaryString.length;
					    	                			    var bytes = new Uint8Array(binaryLen);
					    	                			    for (var i = 0; i < binaryLen; i++) {
					    	                			       var ascii = binaryString.charCodeAt(i);
					    	                			       bytes[i] = ascii;
					    	                			    }
					    	                			    return bytes;
					    	                			 }
					    	                			var resumelink = document.createElement('a');
					    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
					    	    	                	resumelink.href = window.URL.createObjectURL(blob);
					    	    	                    var fileName = 'pitchdeckOf';
					    	    	                    resumelink.download = fileName,
					    	    	                    resumelink.click();
					    	                		},
					    	                		error : function(result) {
					    	                			alert("Could not download the attachment"+result);
					    	                		}
					    	                		});
				    	                	});
				    	                	tabCell.appendChild(btn);
			    	                	}
			    	                }else if(col[j].toLowerCase() === 'otherdoc') {
			    	                	if (parsedObj[i][col[j]] === 'undefined' || parsedObj[i][col[j]] == null) {
			    	                		tabCell.innerHTML = '<h5>no docs</h5>';
			    	                	} else {
			    	                		var btn = document.createElement('input');
				    	                	btn.type = "button";
				    	                	btn.className = "btn";
				    	                	btn.value = "Download";
				    	                	btn.onclick = (function(e) {
				    	                		$.ajax({
					    	                		type: "GET",
					    	                		url: baseUrl+'/download?filePath='+parsedObj[this.parentNode.parentNode.rowIndex-1].otherdoc,
					    	                		//data: { logDownload: true, file: $(this).attr("download") },
					    	                		success : function(result) {
					    	                			var uint8Array = new Uint8Array(result);
					    	                			function base64ToArrayBuffer(result) {
					    	                			    var binaryString = window.atob(result);
					    	                			    var binaryLen = binaryString.length;
					    	                			    var bytes = new Uint8Array(binaryLen);
					    	                			    for (var i = 0; i < binaryLen; i++) {
					    	                			       var ascii = binaryString.charCodeAt(i);
					    	                			       bytes[i] = ascii;
					    	                			    }
					    	                			    return bytes;
					    	                			 }
					    	                			var resumelink = document.createElement('a');
					    	    	                	var blob = new Blob([base64ToArrayBuffer(result)], {type: "application/pdf"});
					    	    	                	resumelink.href = window.URL.createObjectURL(blob);
					    	    	                    var fileName = 'otherdocOf';
					    	    	                    resumelink.download = fileName,
					    	    	                    resumelink.click();
					    	                		},
					    	                		error : function(result) {
					    	                			alert("Could not download the attachment"+result);
					    	                		}
					    	                		});
				    	                	});
				    	                	tabCell.appendChild(btn);
			    	                	}
			    	                } else if(col[j].toLowerCase() === 'decision') {
			    	                	var acceptbtn = document.createElement('input');
			    	                	acceptbtn.type = "button";
			    	                	acceptbtn.className = "btn";
			    	                	acceptbtn.value = "Accept";
			    	                	acceptbtn.onclick = (function(e) {
			    	                		var object = {};
			    	                		object['id'] = parsedObj[this.parentNode.parentNode.rowIndex-1].applicationId;
			    	                		object['applicationDecision'] = true;
			    	                		var json = JSON.stringify(object);
			    	                		$.ajax({
				    	                		type: "POST",
				    	                		url: baseUrl+'/sendemail',
				    	                		contentType: "application/json; charset=utf-8",
				    	            			dataType: "json",
				    	            			data : json,
				    	                		success : function(result) {
				    	                		  if (result) {
				    	                			  alert("Email Sent");
				    	                		  }
				    	                		},
				    	                		error : function(result) {
				    	                			alert("Email could not be sent");
					    	                	}
			    	                		});
			    	                	});	
			    	                	tabCell.appendChild(acceptbtn);
			    	                	var rejectbtn = document.createElement('input');
			    	                	rejectbtn.type = "button";
			    	                	rejectbtn.className = "btn";
			    	                	rejectbtn.value = "Reject";
			    	                	rejectbtn.onclick = (function(e) {
			    	                		var object = {};
			    	                		object['id'] = parsedObj[this.parentNode.parentNode.rowIndex-1].applicationId;
			    	                		object['applicationDecision'] = false;
			    	                		var json = JSON.stringify(object);
			    	                		$.ajax({
				    	                		type: "POST",
				    	                		url: baseUrl+'/sendemail',
				    	                		contentType: "application/json; charset=utf-8",
				    	            			dataType: "json",
				    	            			data : json,
				    	                		success : function(result) {
				    	                		  if (result) {
				    	                			  alert("Email Sent");
				    	                		  }
				    	                		},
				    	                		error : function(result) {
				    	                			alert("Email could not be sent");
					    	                	}
			    	                		});
			    	                	});
			    	                	tabCell.appendChild(rejectbtn);
			    	                } else  {
			    	                	tabCell.innerHTML = parsedObj[i][col[j]];
			    	                }
			    	            }
			    	        }
			    	        table2.border="1";
			    	        $('#applications-section').append(table2);
		    			}
	    		 },
	    		 error : function(error) {
	    					 console.log('Error ${error}')
	    				 }
	    		 }
	    )
	});
});
