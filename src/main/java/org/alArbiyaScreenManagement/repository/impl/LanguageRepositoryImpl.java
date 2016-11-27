package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.repository.LanguageRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LanguageRepositoryImpl implements LanguageRepository {
	
	@PersistenceContext
    EntityManager entityManager; 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Language> getEnableLanguages() {
	 Query query = entityManager.createQuery("SELECT langs from Language langs where status='ACTIVE' order by id", Language.class);
	 return query.getResultList();
	}

}
