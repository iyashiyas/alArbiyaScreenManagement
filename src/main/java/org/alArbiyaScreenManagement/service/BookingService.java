package org.alArbiyaScreenManagement.service;

import java.util.List;

import org.alArbiyaScreenManagement.model.Booking;
 

public interface BookingService {

	List<Booking> roomCustomerName(String roomID);

	public Booking authenticate(long roomId, int password);

}
