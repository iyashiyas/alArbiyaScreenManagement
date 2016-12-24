package org.alArbiyaScreenManagement.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {
	
	public class UnitSupporter {
		long unitId;
		long unitPrice;
		long unitName;
		public long getUnitId() {
			return unitId;
		}
		public void setUnitId(long unitId) {
			this.unitId = unitId;
		}
		public long getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(long unitPrice) {
			this.unitPrice = unitPrice;
		}
		public long getUnitName() {
			return unitName;
		}
		public void setUnitName(long unitName) {
			this.unitName = unitName;
		}
	}

	public class IngredientSupporter {
		long ingredientId;
		long ingredientPrice;
		long ingredientName;
		public long getIngredientId() {
			return ingredientId;
		}
		public void setIngredientId(long ingredientId) {
			this.ingredientId = ingredientId;
		}
		public long getIngredientPrice() {
			return ingredientPrice;
		}
		public void setIngredientPrice(long ingredientPrice) {
			this.ingredientPrice = ingredientPrice;
		}
		public long getIngredientName() {
			return ingredientName;
		}
		public void setIngredientName(long ingredientName) {
			this.ingredientName = ingredientName;
		}
	}
	
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

