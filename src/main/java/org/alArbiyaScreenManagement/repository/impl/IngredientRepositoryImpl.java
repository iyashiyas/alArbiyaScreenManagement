package org.alArbiyaScreenManagement.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
 


import org.alArbiyaScreenManagement.model.Ingredient;
import org.alArbiyaScreenManagement.repository.IngredientRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class IngredientRepositoryImpl implements IngredientRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	
 
	@Override
	public List<Ingredient> getAllIngredienttWithCategory(String categoryCode) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Ingredient> query = criteriaBuilder.createQuery(Ingredient.class);
		Root<Ingredient> ingredientRoot = query.from(Ingredient.class);
		 
		List<Predicate> conditions = new ArrayList<Predicate>();
		categoryCode = (categoryCode == null || categoryCode == "" ) ? "SAUCE" : categoryCode;
		
		conditions.add(criteriaBuilder.equal(ingredientRoot.get("ingredientCategory"), categoryCode ));
	 	 TypedQuery<Ingredient> typedQuery = entityManager.createQuery(query
		        .select(ingredientRoot)
		        .where(conditions.toArray(new Predicate[] {}))
		);
		return typedQuery.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ingredient> getAllIngredients() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ingredient from Ingredient ingredient where ingredientStatus='ENABLE' order by id", Ingredient.class);
		return query.getResultList(); 
	}
 
}
