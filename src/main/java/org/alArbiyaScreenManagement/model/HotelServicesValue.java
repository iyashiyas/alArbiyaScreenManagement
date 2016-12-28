package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
  
@Entity
@Table(name="HOTEL_SERVICES_VALUES")
public class HotelServicesValue {
	
	@Id @GeneratedValue 
	@Column(name="HOTEL_SERVICE_VALUE_ID")
	private long id;
	
	@Column(name="FIELD_NAME")
	private String fieldName;
	
	@Column(name="EXTERNAL_ID")
	private String externalId;
	
	@Column(name="FIELD_VALUE")
	private String fieldValue;

	@Column(name="ITEM_PRICE")
	private String itemPrice;
	
	@ManyToOne
	private HotelServicesGroup hotelServicesGroup;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public HotelServicesGroup getHotelServicesGroup() {
		return hotelServicesGroup;
	}

	public void setHotelServicesGroup(HotelServicesGroup hotelServicesGroup) {
		this.hotelServicesGroup = hotelServicesGroup;
		if(hotelServicesGroup.getHotelServicesValues() != null && !hotelServicesGroup.getHotelServicesValues().contains(this)) {
			hotelServicesGroup.getHotelServicesValues().add(this);
		}
	}
	
}
