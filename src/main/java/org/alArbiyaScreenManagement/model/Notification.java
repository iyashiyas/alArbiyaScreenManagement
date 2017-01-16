package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NOTIFICATION")
public class Notification {

	@Id
	@GeneratedValue
	@Column(name="NOTIFICATION_ID")
	private long id;
	
	@Column(name="ROOM_ID")
	private long roomId;
	
	@Column(name="ORDER_ID")
	private long orderId;

	@Column(name="SERVICE_ITEM_NAME")
	private String serviceItemName;
	
	@Column(name="READ_STATUS")
	private String readStatus;
    
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getServiceItemName() {
		return serviceItemName;
	}

	public void setServiceItemName(String serviceItemName) {
		this.serviceItemName = serviceItemName;
	}

	public String getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
