package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
  
@Entity
@Table(name="ROOM")
public class Room {
	
	@Id @GeneratedValue 
	@Column(name="ROOM_ID")
	private long id;
	
	@Column(name="ROOM_NAME") 
	private String roomName;
	
	@Column(name="ROOM_CODE", unique=true) 
	private String roomCode;
	
	@Column(name="ROOM_PRICE") 
	private Float roomPrice;
	
	@Column(name="ROOM_DESCRIPTION") 
	private String roomDescription;
	
	@Column(name="ROOM_STATUS") 
	private String roomStatus;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FLOOR_ID")
	private Floor floor;
	
	@OneToOne
	private RoomType roomType;
	
	@JsonIgnore 
	@OneToMany(mappedBy="room", cascade={CascadeType.MERGE}, fetch=FetchType.EAGER)
	private List<Booking> bookings;
	 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public Float getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Float roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
        if (floor.getRooms()!=null && !floor.getRooms().contains(this)) {
        	floor.getRooms().add(this);
        }
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void addBooking(Booking booking) {
		this.bookings.add(booking);
        if (booking.getRoom() != this) {
        	booking.setRoom(this);
        }
	}
	
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	  
	
	 
}
