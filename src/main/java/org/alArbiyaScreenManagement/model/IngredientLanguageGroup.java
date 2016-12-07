package org.alArbiyaScreenManagement.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENT_LANGUAGE_GROUP")
public class IngredientLanguageGroup {

	@Id @GeneratedValue
	@Column(name="INGREDIENT_LANGUAGE_GROUP_ID")
	private long id;
	
	/*@OneToMany(mappedBy="ingredientLanguageGroup") 
	private Set<IngredientLanguage> ingredientLanguages;*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*public Set<IngredientLanguage> getIngredientLanguages() {
		return ingredientLanguages;
	}

	public void setIngredientLanguages(Set<IngredientLanguage> ingredientLanguages) {
		this.ingredientLanguages = ingredientLanguages;
	}*/
	
}
