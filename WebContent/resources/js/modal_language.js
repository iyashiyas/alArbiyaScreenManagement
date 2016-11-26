$('.submitBtn').click(function() {
	var $form = $(this).parent('form');
	$('.editLanguageForm').removeClass('submitEditLanguage');
	$form.addClass('submitEditLanguage');
});

$('#submit').click(function() {
	var $form = $('.submitEditLanguage');
	var id = $form.find('#id').val();
	var status = $form.find('#status').val();
	$.ajax({
	    type : 'POST',
	    url : '/alArbiyaHotelManagement/language/editLanguage',
	    data : {id:id, status:status },
		success: handleSuccess,
		error:handleError
	});
	
}); 

function handleSuccess() {
	$('#confirm-submit').modal('toggle');
	
	/*$('.top-right').notify({
	    message: { text: 'Language Status Updated Successfully' }
	  }).show();*/

	location.reload();
}  
function handleError() {
	$('#confirm-submit').modal('toggle');
	
	$('.top-right').notify({
	    message: { text: 'Language Status Updation Failed' }
	  }).show();
	
}  
 