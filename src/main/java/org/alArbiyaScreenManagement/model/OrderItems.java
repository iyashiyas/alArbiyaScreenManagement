package org.alArbiyaScreenManagement.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {
	
	List<UnitSupporter> unitSupporter = new ArrayList<UnitSupporter>();
	List<IngredientSupporter> ingredientSupporter = new ArrayList<IngredientSupporter>();
	
	public List<UnitSupporter> getUnitSupporter() {
		return unitSupporter;
	}
	public void setUnitSupporter(List<UnitSupporter> unitSupporter) {
		this.unitSupporter = unitSupporter;
	}
	public List<IngredientSupporter> getIngredientSupporter() {
		return ingredientSupporter;
	}
	public void setIngredientSupporter(List<IngredientSupporter> ingredientSupporter) {
		this.ingredientSupporter = ingredientSupporter;
	}
	
	
}

