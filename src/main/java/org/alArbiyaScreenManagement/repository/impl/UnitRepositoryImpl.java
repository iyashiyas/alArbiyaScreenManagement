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
 

import org.alArbiyaScreenManagement.model.Unit;
import org.alArbiyaScreenManagement.repository.UnitRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UnitRepositoryImpl implements UnitRepository{
	@PersistenceContext
	EntityManager entityManager;
	 
	public List<Unit> getAllUnitWithCategory(String categoryCode) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Unit> query = criteriaBuilder.createQuery(Unit.class);
		Root<Unit> unitRoot = query.from(Unit.class);
		//Join<UnitCategory, Unit> joinUnit = unitCategoryRoot.join("units");
		
		List<Predicate> conditions = new ArrayList<Predicate>();
		categoryCode = (categoryCode == null || categoryCode == "" ) ? "GRL" : categoryCode;
		
		conditions.add(criteriaBuilder.equal(unitRoot.get("unitCategory"), categoryCode ));
		//conditions.add(criteriaBuilder.equal(joinUnit.get("unitStatus"), Status.ACTIVE.name()));
		
		query.orderBy(criteriaBuilder.asc(unitRoot.get("id")));
		TypedQuery<Unit> typedQuery = entityManager.createQuery(query
		        .select(unitRoot)
		        .where(conditions.toArray(new Predicate[] {}))
		);
		return typedQuery.getResultList();
	}
	 
	@SuppressWarnings("unchecked")
	@Override
	public List<Unit> getAllUnits() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT unit from Unit unit where unitStatus='ENABLE' order by id", Unit.class);
		return query.getResultList(); 
	}

	@Override
	public Unit getUnit(long id) {
		Query query = entityManager.createQuery("SELECT unit from Unit unit where id=:id", Unit.class);
		query.setParameter("id", id);
		return (Unit) query.getResultList().get(0);
	}
	 
	 
}
