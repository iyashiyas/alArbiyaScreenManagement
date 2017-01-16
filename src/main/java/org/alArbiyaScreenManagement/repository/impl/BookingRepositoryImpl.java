package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
	public List<Booking> roomCustomerName(String roomID) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT chekedrooms from Booking chekedrooms where ROOM_ID=:roomId and bookingStatus='CHECKEDIN' ", Booking.class);
		query.setParameter("roomId", roomID);
		System.out.println(roomID);
		System.out.println(query);
		return query.getResultList();
	} 
	
	@Override
	public Booking authenticate(long roomId, int password) {
		// TODO Auto-generated method stub
		TypedQuery<Booking> query = this.entityManager.createQuery("SELECT bookings from Booking bookings WHERE bookings.room.id=:roomId and bookings.bookingStatus='CHECKEDIN' and bookings.accessPassword=:password", Booking.class);
		 query.setParameter("roomId",roomId);
		query.setParameter("password", password);
		List<Booking> bookingDetails=query.getResultList();
		return bookingDetails.isEmpty() ? null : bookingDetails.get(0);
	} 
}
