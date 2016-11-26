$( document ).ready(function() {
 
	 $('.buildingEditbtn').click(function() {
		   
		var $row = $(this).parent('tr')
	  
		$('#editBuildingModal').find("#id").val($row.find(".id").text())
		$('#editBuildingModal').find("#buildingName").val($row.find(".buildingName").text())
		$('#editBuildingModal').find("#buildingCode").val($row.find(".buildingCode").text())
		$('#editBuildingModal').find("#buildingPhoneNumber").val($row.find(".buildingPhoneNumber").text())
		$('#editBuildingModal').find("#buildingEmail").val($row.find(".buildingEmail").text())
		$('#editBuildingModal').find("#buildingTotalFloor").val($row.find(".buildingTotalFloor").text())
		$('#editBuildingModal').find("#buildingDescription").val($row.find(".buildingDescription").text())
	    $('#editBuildingModal').find("#branchName").val($row.find(".branchName").text())
	    $('#editBuildingModal').find("#branchId").val($row.find(".branchId").text())
	  
	    
		//branchName
		
		if($row.find(".buildingStatus").text()=="ENABLE" || $row.find(".buildingStatus").text()=="ENABLED") {
			$('#editBuildingModal').find("#buildingStatus").prop('checked',true)
		} else {
			$('#editBuildingModal').find("#buildingStatus").prop('checked',false)
		}
		 	
		$('#editBuildingModal').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
	});
	
});
function handleSuccess() {
	$('#editBuildingModal').modal('hide');
	location.reload();
}
	 
