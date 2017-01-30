package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RECEPTION_ORDER")
public class ReceptionOrder {

	@Id @GeneratedValue 
	@Column(name="RECEPTION_ORDER_ID")
	private long id;
	 
	@Column(name="REQUEST_TYPE")
	private String requestType; 
	
	@Column(name="ACCEPT_TIME")
	private String acceptTime;
	
	@Column(name="REQUEST_TIME")
	private String requestTime;
	
	@Column(name="ORDER_STATUS")
	private String orderStatus;  
	 
	@OneToOne
	@JoinColumn(name="ROOM_ID", nullable=false)
	private Room room;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	
	
	 
 
}
