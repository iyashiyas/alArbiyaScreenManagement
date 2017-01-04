$( document ).ready(function() {
	 
	var roomId; 
	(function worker() {
		
		var ctx="${pageContext.request.contextPath}/header";
	  $.ajax({
		type:'GET',
	    contentType: "application/json",
	    url:"/alArbiyaScreenManagement/header", 
	    dataType: "json",
	    success: function(data) {
	    	$.each(data, function (i, getPlayerRooms) { 
          $("#roomNumber").html(getPlayerRooms.room.roomCode);   
        	  roomId=getPlayerRooms.room.id;
        	  $("#roomId").val(roomId);
        		console.log("inside");
        	  $.ajax({ 
        			type:'GET',
        		    contentType: "application/json",
        		    url:"/alArbiyaScreenManagement/roomCustomerName", 
        		    data:{roomId:roomId},
        		    success: function(data) {
        		    	$.each(data, function (i, roomCustomerName) { 
        	       
        	        	  $("#customerName").html(roomCustomerName.userDetails.id);  
        	        		console.log("inside succcess");
        	        	});
        	        },
        	        error:function(xmlHttpRequest, textStatus, errorThrown){
        	            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
        	                return;
        	        },
        	   
        		  });
        	});
        },
        error:function(xmlHttpRequest, textStatus, errorThrown){
            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
                return;
        },
   
	  });
	})();
	    
	 
	});

 