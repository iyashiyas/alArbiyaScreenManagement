$( document ).ready(function() {
	
	/*$("#ingredientStatus").change(function() {
		$("#ingredientStatus").val("ENABLE");
		if(!this.checked){
		   $("#ingredientStatus").val("DISABLE");
		} 
	})*/
	$('#EditUnit-Modal').modal('hide');
	
	$('.unitEdit').click(function() {
		var $row = $(this).parent('tr')
		var $unitLanguageSize = $row.find($(".unitLanguageSize")).val()
		
		//remove if there are more dropdowns, we need only one, that is the first
		$("div.editEntry:not(:first)").remove();
		$("div.editEntry:first").find(".edit-btn-remove")
			    	.removeClass("edit-btn-remove")
			    	.removeClass("btn-danger")
			    	.addClass("edit-btn-add")
			    	
		$("div.editEntry:first").find("span.glyphicon")
			    	.removeClass("glyphicon-minus")
			    	.addClass("glyphicon-plus")
		
		for (i = 0; i < $unitLanguageSize-1; i++) { 
			var controlForm = $('.editControls:first');
		    var $currentEntry = $('.editEntry:first').clone();
		    
		    $currentEntry.find("#editFormLanguageId").attr('name', 'unitLanguages['+ parseInt(i+1) +'].id')
		    $currentEntry.find("#editFormLanguageLanguageId").attr('name', 'unitLanguages['+ parseInt(i+1) +'].language.id')
		    $currentEntry.find("#editFormLanguageName").attr('name', 'unitLanguages['+ parseInt(i+1) +'].unitLanguageName')
		    var newEntry = $($currentEntry).appendTo(controlForm);
		} 
		for (i = 0; i < $unitLanguageSize; i++) {
			$("input[name='unitLanguages\\["+i+"\\].id']").val($row.find($('td.unitLanguageId'+i+'')).attr('value'))
			$("select[name='unitLanguages\\["+i+"\\].language.id']").val($row.find($('td.unitLanguageLanguageId'+i+'')).attr('value'))
			$("input[name='unitLanguages\\["+i+"\\].unitLanguageName']").val($row.find($('td.unitLanguageName'+i+'')).attr('value'))
		}
    	
		$('#EditUnit-Modal').find("select[name='unitCategory']").val($row.find(".unitCategory").text())
		$('#EditUnit-Modal').find("#id").val($row.find(".id").text())
		$('#EditUnit-Modal').find("#unitName").val($row.find(".unitName").text())
		$('#EditUnit-Modal').find("#measurementUnit").val($row.find(".measurementUnit").text())
		$('#EditUnit-Modal').find("#unitStatus").val($row.find(".unitStatus").text())
		if($row.find(".unitStatus").text()=="ENABLE" || $row.find(".unitStatus").text()=="ENABLED") {
			$('#EditUnit-Modal').find("#unitStatus").prop('checked',true)
		} else {
			$('#EditUnit-Modal').find("#unitStatus").prop('checked',false)
		}
		$('#EditUnit-Modal').find("#unitDescription").val($row.find(".unitDescription").text())
		
		$('#EditUnit-Modal').modal({
		    backdrop: 'static',
		    keyboard: true,
		    show: true});
		
		$("div.editEntry:not(:last) .edit-btn-add")
		.removeClass('edit-btn-add')
		.addClass('edit-btn-remove')
		.removeClass('btn-success')
		.addClass('btn-danger')
		.html('<span class="glyphicon glyphicon-minus"></span>');
	});
	
	$(".disableUnitButton").click(function() {
		$('#disableUnitFormWrapper .disableUnit').find("#id").val($(this).attr("unitId"))
		$('#disableUnitFormWrapper .disableUnit').find("#status").val($(this).val())
		$('#disableUnitFormWrapper').modal('show');
	})
  	$(".disableUnitFormButton").click(function() {
		var $form = $('#disableUnitFormWrapper .disableUnit')
	    var $url = $form.attr( "action" );
		
		var posting = $.post( $url, $form.serialize() );
		
		posting.done(function( data ) {
			$('#disableUnitFormWrapper').modal('hide');
		  });
	}) 
});

function handleSuccess() {
	$('#EditUnit-Modal').modal('hide');
	location.reload();
}  

$("#EditUnit-Modal").on('hidden', function () {
    alert("comgin")
});
