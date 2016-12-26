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
        	});
        },
        error:function(xmlHttpRequest, textStatus, errorThrown){
            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
                return;
        },
   
	  });
	})();
	});

 