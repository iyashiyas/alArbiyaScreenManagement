package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alArbiyaScreenManagement.model.HotelInfo;
import org.alArbiyaScreenManagement.repository.HotelInfoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class HotelInfoReositoryImpl implements HotelInfoRepository{

	@PersistenceContext
    EntityManager entityManager; 
 
	@SuppressWarnings("unchecked")
	@Override
	public List<HotelInfo> getHotelInfo() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT hotelInfo from HotelInfo hotelInfo", HotelInfo.class);
		return query.getResultList();
	}

}
