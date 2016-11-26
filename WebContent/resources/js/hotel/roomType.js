/* $('#confirm-Edit').on('hidden.bs.modal', function () {
  location.reload();
})*/
$(function () {
    $(document).on('click', 'button[data-dismiss]', function (e) {
  location.reload();
})}); 
$( document ).ready(function() {
 
	 $('.edit-roomType').click(function() {
		   
		var $row = $(this).parent('tr')
	  
		$('#editRoomType').find("#id").val($row.find(".roomTypeId").text())
		$('#editRoomType').find("#roomType").val($row.find(".roomType").text())
		$('#editRoomType').find("#roomTypeCode").val($row.find(".roomTypeCode").text())
		$('#editRoomType').find("#roomTypeDescription").val($row.find(".roomTypeDescription").text())
		  
		if($row.find(".roomTypeStatus").text()=="ENABLE" || $row.find(".roomTypeStatus").text()=="ENABLED") {
			$('#editRoomType').find("#roomTypeStatus").prop('checked',true)
		} else {
			$('#editRoomType').find("#roomTypeStatus").prop('checked',false)
		}
		 $('#editRoomType').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
	});
});
	 
	 function handleSuccess() {
			$('#editRoomType').modal('hide');
			location.reload();
		}

 
