 package org.alArbiyaScreenManagement.service;

import java.util.List;

import org.alArbiyaScreenManagement.model.Ingredient;

 
  
public interface IngredientService {
 
	public List<Ingredient> getAllIngredienttWithCategory(String categoryCode);
	
	public List<Ingredient> getAllIngredients();

	public Ingredient getIngredient(long parseLong);
	
	
}
