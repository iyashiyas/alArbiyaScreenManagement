package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOMTYPE")
public class RoomType {

	
	@Id @GeneratedValue 
	@Column(name="ROOMTYPE_ID")
	private long id;
	
	@Column(name="ROOMTYPE") 
	private String roomType;
	
	@Column(name="ROOMTYPE_CODE", unique=true) 
	private String roomTypeCode;
	
	@Column(name="ROOMTYPE_BEDTYPE") 
	private String roomTypeBedType;
	
	@Column(name="ROOMTYPE_DESCRIPTION") 
	private String roomTypeDescription;
	
	@Column(name="ROOMTYPE_STATUS") 
	private String roomTypeStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomTypeName() {
		return roomType;
	}

	public void setRoomTypeName(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRoomTypeBedType() {
		return roomTypeBedType;
	}

	public void setRoomTypeBedType(String roomTypeBedType) {
		this.roomTypeBedType = roomTypeBedType;
	}

	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}

	public void setRoomTypeDescription(String roomTypeDescription) {
		this.roomTypeDescription = roomTypeDescription;
	}

	public String getRoomTypeStatus() {
		return roomTypeStatus;
	}

	public void setRoomTypeStatus(String roomTypeStatus) {
		this.roomTypeStatus = roomTypeStatus;
	}
	
	
 
	
	
}
