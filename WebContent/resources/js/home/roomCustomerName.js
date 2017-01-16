$( document ).ready(function() { 
	
setInterval(
		function() {  
			var roomID=$("#ro").val(); 
			$ .ajax({
						type : 'GET',
						contentType : "application/json",
						url : "/alArbiyaScreenManagement/roomCustomerName",
						data:{roomID:roomID},
						success : function(data) {  
											 if(data.length==0)
												 {  
												 console.log("coming if");
											     window.location.assign("home"); 
												 }
											 else
												 {
												console.log("else");
												 }
						},
						error : function(xmlHttpRequest,
								textStatus, errorThrown) {
							if (xmlHttpRequest.readyState = 0 || xmlHttpRequest.status == 0)
								return;
						},

					});
		}, 10000);

});
