package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENT")
public class Ingredient {
	
	@Id @GeneratedValue 
	@Column(name="INGREDIENT_ID")
	private long id;
	
	@Column(name="INGREDIENT_NAME") 
	private String ingredientName;
	
	@Column(name="MEASUREMENT_UNIT") 
	private String measurementUnit;
	
	@Column(name="INGREDIENT_STATUS") 
	private String ingredientStatus;
	
	@Column(name="INGREDIENT_DESCRIPTION") 
	private String ingredientDescription;
	
	@Column(name="INGREDIENT_CATEGORY")
	private String ingredientCategory;
	 
	@OneToMany(mappedBy="ingredient", cascade=CascadeType.MERGE, fetch=FetchType.EAGER, orphanRemoval=true) 
	private List<IngredientLanguage> ingredientLanguages;
	
	/*@ManyToOne 
	private IngredientCategory ingredientCategory;*/
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getIngredientStatus() {
		return ingredientStatus;
	}

	public void setIngredientStatus(String ingredientStatus) {
		this.ingredientStatus = ingredientStatus;
	}

	public String getIngredientDescription() {
		return ingredientDescription;
	}

	public void setIngredientDescription(String ingredientDescription) {
		this.ingredientDescription = ingredientDescription;
	}

	  public String getIngredientCategory() {
		return ingredientCategory;
	}

	public void setIngredientCategory(String ingredientCategory) {
		this.ingredientCategory = ingredientCategory;
	} 
	
	public List<IngredientLanguage> getIngredientLanguages() {
		return ingredientLanguages;
	}
	public void addIngredientLanguages(IngredientLanguage ingredientLanguage) {
        this.ingredientLanguages.add(ingredientLanguage);
        if (ingredientLanguage.getIngredient() != this) {
        	ingredientLanguage.setIngredient(this);
        }
    }
	public void setIngredientLanguages(List<IngredientLanguage> ingredientLanguages) {
		this.ingredientLanguages = ingredientLanguages;
	} 
	
}
