 
$( document ).ready(function() {
 
	 $( ".branchDetail" ).change(function() {
			var branchId=$(this).val();
			 $('.buildingId').empty();
			    $.ajax({
			        type:'GET',
			        contentType: "application/json",
			        url:'getAllBuilding',
			        data:{branchId:branchId},
			        dataType: "json",
			        success: function(data){ 
			        	$.each(data, function (i, building) {
			        		console.log(building.id);
			        		$('.buildingId').append('<option value="'+building.id+'">'+building.buildingCode+'</option>')
			        	});
			        },
			        error:function(xmlHttpRequest, textStatus, errorThrown){
			            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
			                return;
			        },
			    });
			 
		});
		 
	  
	 // Get Floor By Building ID
	 $( ".buildingId" ).change(function() {
		 $('.FloorId').empty();
			var buildingId=$(this).val();
			 
			    $.ajax({
			        type:'GET',
			        contentType: "application/json",
			        url:'getAllFloor',
			        data:{buildingId:buildingId},
			        dataType: "json",
			        success: function(data){ 
			        	$.each(data, function (i, floor) {
			        		console.log(floor.id);
			        		$('.FloorId').append('<option value="'+floor.id+'">'+floor.floorCode+'</option>')
			        	});
			        },
			        error:function(xmlHttpRequest, textStatus, errorThrown){
			            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
			                return;
			        },
			    });
			 
		});
	
	//  Edit Form
	 $('.edit-roombtn').click(function() {
		   
		var $row = $(this).parent('tr')
	  
		$('#edit-Room').find("#roomId").val($row.find(".roomId").text())
		$('#edit-Room').find("#roomName").val($row.find(".roomName").text())
		$('#edit-Room').find("#roomCode").val($row.find(".roomCode").text())
		$('#edit-Room').find("#roomPrice").val($row.find(".roomPrice").text())
		$('#edit-Room').find("#roomFloorCode").val($row.find(".roomFloorCode").text())
		$('#edit-Room').find("#roomFloorId").val($row.find(".roomFloorId").text())
		$('#edit-Room').find("#roomType").val($row.find(".roomType").text())
	    $('#edit-Room').find("#roomTypeId").val($row.find(".roomTypeId").text())
		$('#edit-Room').find("#roomDescription").val($row.find(".roomDescription").text())
		
	    
	    
		if($row.find(".roomStatus").text()=="ENABLE" || $row.find(".roomStatus").text()=="ENABLED") {
			$('#edit-Room').find("#roomStatus").prop('checked',true)
		} else {
			$('#edit-Room').find("#roomStatus").prop('checked',false)
		}
		 $('#edit-Room').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
	});
});
	 
	 function handleSuccess() {
			$('#edit-Room').modal('hide');
			location.reload();
		}

 
 