package org.alArbiyaScreenManagement.service.impl;

import java.util.List;

import org.alArbiyaScreenManagement.model.Booking;
import org.alArbiyaScreenManagement.repository.BookingRepository;
import org.alArbiyaScreenManagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{
   
	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public List<Booking> roomCustomerName(String roomID) {
		// TODO Auto-generated method stub
		return bookingRepository.roomCustomerName(roomID);
	}

	@Override
	public Booking authenticate(long roomId, int password) {
		// TODO Auto-generated method stub
		return bookingRepository.authenticate(roomId,password);
	}

}
