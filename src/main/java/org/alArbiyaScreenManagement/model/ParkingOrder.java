package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne; 
import javax.persistence.Table;

@Entity
@Table(name="PARKING_ORDER")
public class ParkingOrder {

	@Id @GeneratedValue 
	@Column(name="PARKING_ID")
	private long id;
	
	@Column(name="TIME_STATUS")
	private String timeStatus;
	
	@Column(name="REQUEST_TIME")
	private String requestTime;

	@Column(name="DELIVERY_TIME")
	private String deliveryTime;
	 
	@OneToOne
	@JoinColumn(name="PARKING_ID", nullable=false)
	private Parking parking;
	
	@OneToOne
	@JoinColumn(name="ROOM_ID", nullable=false)
	private Room room;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTimeStatus() {
		return timeStatus;
	}

	public void setTimeStatus(String timeStatus) {
		this.timeStatus = timeStatus;
	}

	 

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

  
	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	 
	
}
