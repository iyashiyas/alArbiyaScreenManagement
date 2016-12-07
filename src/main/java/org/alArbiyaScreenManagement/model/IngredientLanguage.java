package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENT_LANGUAGE")
public class IngredientLanguage {

	@Id @GeneratedValue
	@Column(name="INGREDIENT_LANGUAGE_ID")
	private long id;
	
	@Column(name="INGREDIENT_LANGUAGE_NAME") 
	private String ingredientLanguageName;
	
	@OneToOne
	@JoinColumn(name="LANGUAGE_ID", nullable=false)
	private Language language;
 
	@ManyToOne
	@JoinColumn(name="INGREDIENT_ID")
	private Ingredient ingredient;
 	
	/*@ManyToOne 
	private IngredientLanguageGroup ingredientLanguageGroup;
*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getIngredientLanguageName() {
		return ingredientLanguageName;
	}

	public void setIngredientLanguageName(String ingredientLanguageName) {
		this.ingredientLanguageName = ingredientLanguageName;
	}
	
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
 
	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
		 if (!ingredient.getIngredientLanguages().contains(this)) {
	        	ingredient.getIngredientLanguages().add(this);
	        }
	}

	public boolean isEmpty() {
		return (this.getIngredientLanguageName() == null || this.getIngredientLanguageName().isEmpty());
	}
	
}
