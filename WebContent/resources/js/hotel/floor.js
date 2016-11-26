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
 
  
 $('.editFloorbtn').click(function() {
	   
		var $row = $(this).parent('tr')
	  
		$('#editFloor').find("#floorId").val($row.find(".floorId").text())
		$('#editFloor').find("#floorName").val($row.find(".floorName").text())
		$('#editFloor').find("#floorCode").val($row.find(".floorCode").text())
		$('#editFloor').find("#floorBuildingName").val($row.find(".floorBuildingName").text())
	    $('#editFloor').find("#floorTotalRoom").val($row.find(".floorTotalRoom").text())
	    $('#editFloor').find("#floorDescription").val($row.find(".floorDescription").text())
	    $('#editFloor').find("#floorBuildingId").val($row.find(".floorBuildingId").text())
	    
	   // branchName
		
		if($row.find(".floorStatus").text()=="ENABLE" || $row.find(".floorStatus").text()=="ENABLED") {
			$('#editFloor').find("#floorStatus").prop('checked',true)
		} else {
			$('#editFloor').find("#floorStatus").prop('checked',false)
		}
		 	
		$('#editFloor').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
	});
 
});
   
  