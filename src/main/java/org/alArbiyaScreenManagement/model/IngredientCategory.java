package org.alArbiyaScreenManagement.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
import javax.persistence.Table;

@Entity
@Table(name = "INGREDIENT_CATEGORY")
public class IngredientCategory {

	@Id @GeneratedValue 
	@Column(name="INGREDIENT_CATEGORY_ID")
	private long id;
	
	@Column(name="INGREDIENT_NAME") 
	private String categoryName;
	
	@Column(name="INGREDIENT_STATUS") 
	private String categoryStatus;
	
	/*@OneToMany(mappedBy="ingredientCategory") 
	private Set<Ingredient> ingredients;*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	/*public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}*/
	
}
