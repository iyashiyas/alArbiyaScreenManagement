$(function() {
	var unitLangugaeCount = 0;
	$(document).on('click','.btn-add',function(e) {
				unitLangugaeCount++
				e.preventDefault();

				var controlForm = $('.controls:first'), currentEntry = $(this)
						.parents('.entry:first'), newEntry = $(
						currentEntry.clone()).appendTo(controlForm);

				newEntry.find('input').val('');
				newEntry.find('input').attr('name',"unitLanguages[" + unitLangugaeCount+ "].unitLanguageName")
				newEntry.find('select').attr('name',"unitLanguages[" + unitLangugaeCount + "].language.id")
				controlForm.find('.entry:not(:last) .btn-add')
					.removeClass('btn-add')
					.addClass('btn-remove')
					.removeClass('btn-success')
					.addClass('btn-danger')
					.html('<span class="glyphicon glyphicon-minus"></span>');
			}).on('click', '.btn-remove', function(e) {
		$(this).parents('.entry:first').remove();
		e.preventDefault();
		return false;
	});
});

$(function() {
	
	$(document).on('click','.edit-btn-add',function(e) {
		var editUnitLangugaeCount = $('.editEntry.input-group ').length;
		e.preventDefault();

		var controlForm = $('.editControls:last'), currentEntry = $(this)
			.parents('.editEntry:first'), newEntry = $(
			currentEntry.clone()).appendTo(controlForm);

			newEntry.find('input').val('');
			//newEntry.find('#editFormLanguageId').attr('name',"unitLanguages[" + editUnitLangugaeCount + "].id")
			newEntry.find('#editFormLanguageLanguageId').attr('name',"unitLanguages[" + editUnitLangugaeCount + "].language.id")
			newEntry.find('#editFormLanguageName').attr('name',"unitLanguages[" + editUnitLangugaeCount+ "].unitLanguageName")
			controlForm.find('.editEntry:not(:last) .edit-btn-add')
				.removeClass('edit-btn-add')
				.addClass('edit-btn-remove')
				.removeClass('btn-success')
				.addClass('btn-danger')
				.html('<span class="glyphicon glyphicon-minus"></span>');
			}).on('click', '.edit-btn-remove', function(e) {
			$(this).parents('.editEntry:first').remove();
			e.preventDefault();
			return false;
		});
});
