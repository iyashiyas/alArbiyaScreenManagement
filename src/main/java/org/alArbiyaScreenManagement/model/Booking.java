package org.alArbiyaScreenManagement.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BOOKING")
public class Booking {
	
	@Id @GeneratedValue 
	@Column(name="BOOKING_ID")
	private long id;
	
	@Column(name="BOOKING_REFERENCE_ID")
	private String bookingReferenceId;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="END_DATE")
	private Date endDate;
	
	@Column(name="BOOKING_STATUS")
	private String bookingStatus;
	
	@Column(name="CHECKED_IN_TIME")
	private Date checkedInTime;
	
	@Column(name="CHECKED_OUT_TIME")
	private Date checkedOutTime;
	
	@OneToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="USER_ID")
	private UserDetails userDetails;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ROOM_ID")
	private Room room;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookingReferenceId() {
		return bookingReferenceId;
	}

	public void setBookingReferenceId(String bookingReferenceId) {
		this.bookingReferenceId = bookingReferenceId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public Date getCheckedInTime() {
		return checkedInTime;
	}

	public void setCheckedInTime(Date checkedInTime) {
		this.checkedInTime = checkedInTime;
	}

	public Date getCheckedOutTime() {
		return checkedOutTime;
	}

	public void setCheckedOutTime(Date checkedOutTime) {
		this.checkedOutTime = checkedOutTime;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
		if(this.room.getBookings() != null && !this.room.getBookings().contains(this)) {
			this.room.getBookings().add(this);
		}
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
		if(this.userDetails.getBooking() != null && !this.userDetails.getBooking().contains(this)) {
			this.userDetails.getBooking().add(this);
		}
	}

}
