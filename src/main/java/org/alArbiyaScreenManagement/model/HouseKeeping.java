package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="HOUSEKEEPING")
public class HouseKeeping {
 
	@Id @GeneratedValue 
	@Column(name="HOUSEKEEPNG_ID")
	private long id;
	
	@Column(name="HOUSEKEEPING_TYPE")
	private String houseKeepingType;
	
	@Column(name="REQUEST_TIME")
	private String requestTime;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToOne
	@JoinColumn(name="ROOM_ID", nullable=true)
	private Room room;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHouseKeepingType() {
		return houseKeepingType;
	}

	public void setHouseKeepingType(String houseKeepingType) {
		this.houseKeepingType = houseKeepingType;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
}
