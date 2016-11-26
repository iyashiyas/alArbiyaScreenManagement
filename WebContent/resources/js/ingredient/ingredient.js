$('.ingredientEdit').click(function() {
		var $row = $(this).parent('tr');
		var $ingredientLanguageSize = $row.find(".ingredientLanguageSize").val()

		//remove if there are more dropdowns, we need only one, that is the first
		$("div.editEntry:not(:first)").remove();
		$("div.editEntry:first").find(".edit-btn-remove")
			    	.removeClass("edit-btn-remove")
			    	.removeClass("btn-danger")
			    	.addClass("edit-btn-add")
			    	
		$("div.editEntry:first").find("span.glyphicon")
			    	.removeClass("glyphicon-minus")
			    	.addClass("glyphicon-plus")
		
		for (i = 0; i < $ingredientLanguageSize-1; i++) { 
			var controlForm = $('.editControls:first');
		    var $currentEntry = $('.editEntry:first').clone();
			
		    $currentEntry.find("#editFormLanguageId").attr('name', 'ingredientLanguages['+ parseInt(i+1) +'].id')
		    $currentEntry.find("#editFormLanguageLanguageId").attr('name', 'ingredientLanguages['+ parseInt(i+1) +'].language.id')
		    $currentEntry.find("#editFormLanguageName").attr('name', 'ingredientLanguages['+ parseInt(i+1) +'].ingredientLanguageName')
		    var newEntry = $($currentEntry).appendTo(controlForm);
		} 
		
		for (i = 0; i < $ingredientLanguageSize; i++) {
			$("input[name='ingredientLanguages\\["+i+"\\].id']").val($row.find($('td.ingredientLanguageId'+i+'')).attr('value'))
			$("select[name='ingredientLanguages\\["+i+"\\].language.id']").val($row.find($('td.ingredientLanguageLanguageId'+i+'')).attr('value'))
			$("input[name='ingredientLanguages\\["+i+"\\].ingredientLanguageName']").val($row.find($('td.ingredientLanguageName'+i+'')).attr('value'))
		}
		$('#confirm-Edit').find("select[name='ingredientCategory']").val($row.find(".ingredientCategory").text())
		$('#confirm-Edit').find("#id").val($row.find(".id").text())
		$('#confirm-Edit').find("#ingredientName").val($row.find(".ingredientName").text())
 
		$('#confirm-Edit').find("#measurementUnit").val($row.find(".measurementUnit").text())
		$('#confirm-Edit').find("#ingredientStatus").val($row.find(".ingredientStatus").text())
		if($row.find(".ingredientStatus").text()=="ENABLE" || $row.find(".ingredientStatus").text()=="ENABLED") {
			$('#confirm-Edit').find("#ingredientStatus").prop('checked',true)
		} else {
			$('#confirm-Edit').find("#ingredientStatus").prop('checked',false)
		}
		$('#confirm-Edit').find("#ingredientDescription").val($row.find(".ingredientDescription").text())
		$('#confirm-Edit').modal({
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