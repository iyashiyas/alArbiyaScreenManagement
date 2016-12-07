package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.Ingredient;

 
  
public interface IngredientRepository {
 
	public List<Ingredient> getAllIngredienttWithCategory(String categoryCode);
	public List<Ingredient> getAllIngredients();
	
	
}
