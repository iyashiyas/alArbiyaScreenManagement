$(function() {
	var ingredientLangugaeCount = 0;
	$(document).on('click','.btn-add',function(e) {
		ingredientLangugaeCount++
				e.preventDefault();

				var controlForm = $('.controls:first'), currentEntry = $(this)
						.parents('.entry:first'), newEntry = $(
						currentEntry.clone()).appendTo(controlForm);

				newEntry.find('input').val('');
				newEntry.find('input').attr('name',"ingredientLanguages[" + ingredientLangugaeCount+ "].ingredientLanguageName")
				newEntry.find('select').attr('name',"ingredientLanguages[" + ingredientLangugaeCount + "].language.id")
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
	var editIngredientLangugaeCount = 0;
	$(document).on('click','.edit-btn-add',function(e) {
		editIngredientLangugaeCount++
		e.preventDefault();

		var controlForm = $('.editControls:last'), currentEntry = $(this)
			.parents('.editEntry:first'), newEntry = $(
			currentEntry.clone()).appendTo(controlForm);

			newEntry.find('input').val('');
			//newEntry.find('#editFormLanguageId').attr('name',"unitLanguages[" + editUnitLangugaeCount + "].id")
			newEntry.find('#editFormLanguageLanguageId').attr('name',"ingredientLanguages[" + editIngredientLangugaeCount + "].language.id")
			newEntry.find('#editFormLanguageName').attr('name',"ingredientLanguages[" + editIngredientLangugaeCount+ "].ingredientLanguageName")
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
