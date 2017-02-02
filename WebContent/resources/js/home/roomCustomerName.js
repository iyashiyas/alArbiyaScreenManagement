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
												 $.each(data, function (i, getBookedItems)
												{   
													 if (getBookedItems.parking==null)
												     {
													 $('#submitParking').toggleClass('disabled');
													 $('#submitParking').hide();
													 $('#radios').hide();
													 $('#parkingName').val("You Have No Parking")
													 
													 } 
													 else
												  {
												  $('#parkingName').val(getBookedItems.parking.parkingName);
												  $('#parkingId').val(getBookedItems.parking.id);
													 /*console.log(getBookedItems.userDetails.id)*/
												  }
												 });
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
