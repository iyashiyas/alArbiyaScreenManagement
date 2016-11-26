$( document ).ready(function() {
 
	 $('.branchEdit').click(function() {
		   
		var $row = $(this).parent('tr')
	  
		$('#EditBranch').find("#id").val($row.find(".id").text())
		$('#EditBranch').find("#branchName").val($row.find(".branchName").text())
		$('#EditBranch').find("#branchCode").val($row.find(".branchCode").text())
		$('#EditBranch').find("#branchPhoneNumber").val($row.find(".branchPhoneNumber").text())
		$('#EditBranch').find("#branchEmail").val($row.find(".branchEmail").text())
		$('#EditBranch').find("#branchAddress").val($row.find(".branchAddress").text())
		$('#EditBranch').find("#branchDescription").val($row.find(".branchDescription").text())
		  
		if($row.find(".branchStatus").text()=="ENABLE" || $row.find(".branchStatus").text()=="ENABLED") {
			$('#EditBranch').find("#branchStatus").prop('checked',true)
		} else {
			$('#EditBranch').find("#branchStatus").prop('checked',false)
		}
		 	
		$('#EditBranch').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
	});
});
	 
function handleSuccess() {
		$('#EditBranch').modal('hide');
	location.reload();
}