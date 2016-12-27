$( document ).ready(function() {
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
        	   
        	  $("#roomId").val(getPlayerRooms.room.id);
        	});
        },
        error:function(xmlHttpRequest, textStatus, errorThrown){
            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
                return;
        },
   
	  });
	})();
	});

 