package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Orders {
 
	@Id 
	@GeneratedValue
	@Column(name="ORDER_ID")
	private long id;
	
	@Column(name="ORDER_DETAILS")
	private String orderDetails;
	
	@Column(name="REQUESTED_TIME")
	private String requestedTime;
	
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	 
	@Column(name="TOTAL_PRICE")
	private String totalPrice;
	
	@Column(name="Accept_TIME")
	private String acceptTime; 
	
	@Column(name="READY_FOR_DELIVERY_TIME")
	private String readyForDeliveryTime;
	
	@Column(name="DELIVERED_TIME")
	private String deliveredTime;
	 
	@OneToOne
	@JoinColumn(name="ROOM_ID", nullable=false)
	private Room room;
	 
	 @ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "ORDER_INGREDIENT", joinColumns = @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"), inverseJoinColumns = @JoinColumn(name = "INGREDIENT_ID", referencedColumnName = "INGREDIENT_ID"))
	private List<Ingredient> ingredients;
    
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "ORDER_UNIT", joinColumns = @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"), inverseJoinColumns = @JoinColumn(name = "UNIT_ID", referencedColumnName = "UNIT_ID"))
	private List<Unit> unit;
		 

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Unit> getUnit() {
		return unit;
	}

	public void setUnit(List<Unit> unit) {
		this.unit = unit;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

 
	public String getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getReadyForDeliveryTime() {
		return readyForDeliveryTime;
	}

	public void setReadyForDeliveryTime(String readyForDeliveryTime) {
		this.readyForDeliveryTime = readyForDeliveryTime;
	}

	public String getDeliveredTime() {
		return deliveredTime;
	}

	public void setDeliveredTime(String deliveredTime) {
		this.deliveredTime = deliveredTime;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	  

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
}
