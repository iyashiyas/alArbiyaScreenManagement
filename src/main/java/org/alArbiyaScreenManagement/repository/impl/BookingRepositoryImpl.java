package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alArbiyaScreenManagement.model.Booking;

import org.alArbiyaScreenManagement.repository.BookingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BookingRepositoryImpl implements BookingRepository {
    
	@PersistenceContext
    EntityManager entityManager; 
	
	
	@Override
	public List<Booking> roomCustomerName(String roomId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT chekedrooms from Booking chekedrooms where ROOM_ID=:roomId and bookingStatus='CHECKEDIN' ", Booking.class);
		query.setParameter("roomId", roomId);
		System.out.println(roomId);
		System.out.println(query);
		return query.getResultList();
	}

}
