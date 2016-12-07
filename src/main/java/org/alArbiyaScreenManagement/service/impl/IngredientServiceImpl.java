package org.alArbiyaScreenManagement.service.impl;

import java.util.List;
  
import org.alArbiyaScreenManagement.model.Ingredient;
import org.alArbiyaScreenManagement.repository.IngredientRepository;
import org.alArbiyaScreenManagement.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	 
	@Override
	public List<Ingredient> getAllIngredienttWithCategory(String categoryCode) {
		return ingredientRepository.getAllIngredienttWithCategory(categoryCode);
	}

	@Override
	public List<Ingredient> getAllIngredients() {
		// TODO Auto-generated method stub
		return ingredientRepository.getAllIngredients();
	}
}
