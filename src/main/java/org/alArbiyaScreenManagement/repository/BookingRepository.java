package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.Booking;

public interface BookingRepository {

	List<Booking> roomCustomerName(String roomId);

	Booking authenticate(long roomId, int password);

}
