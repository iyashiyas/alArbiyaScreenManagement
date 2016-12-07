package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL_SERVICES_GROUP")
public class HotelServicesGroup {
	
	@Id @GeneratedValue 
	@Column(name="HOTEL_SERVICE_GROUP_ID")
	private long id;
	
	@Column(name="SERVICEGROUPNAME")
	private String serviceGroupName;

	@OneToMany(mappedBy = "hotelServicesParentGroup", fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	private List<HotelServicesGroup> hotelServiceChildGroups;
	
	@ManyToOne
	private HotelServicesGroup hotelServicesParentGroup;
	
	@OneToMany(mappedBy="hotelServicesGroup", fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	private List<HotelServicesValue> hotelServicesValues;
	
	@ManyToOne
	private HotelServicesItem hotelServicesItem;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getServiceGroupName() {
		return serviceGroupName;
	}

	public void setServiceGroupName(String serviceGroupName) {
		this.serviceGroupName = serviceGroupName;
	}
	
	public HotelServicesItem getHotelServicesItem() {
		return hotelServicesItem;
	}

	public void setHotelServicesItem(HotelServicesItem hotelServicesItem) {
		this.hotelServicesItem = hotelServicesItem;
		if(hotelServicesItem.getHotelServiceParentGroups()!=null && !hotelServicesItem.getHotelServiceParentGroups().contains(this)) {
			hotelServicesItem.getHotelServiceParentGroups().add(this);
		}
	}

	public List<HotelServicesValue> getHotelServicesValues() {
		return hotelServicesValues;
	}

	public void addHotelServicesValues(HotelServicesValue hotelServicesValue) {
		this.hotelServicesValues.add(hotelServicesValue);
		if(hotelServicesValue.getHotelServicesGroup() != this) {
			hotelServicesValue.setHotelServicesGroup(this);
		}
	}
	
	public void setHotelServicesValues(List<HotelServicesValue> hotelServicesValues) {
		this.hotelServicesValues = hotelServicesValues;
	}

	public List<HotelServicesGroup> getHotelServiceChildGroups() {
		return hotelServiceChildGroups;
	}

	public void addHotelServiceChildGroup(HotelServicesGroup hotelServiceChildGroup) {
		this.hotelServiceChildGroups.add(hotelServiceChildGroup);
		if(hotelServiceChildGroup.getHotelServicesParentGroup() != this) {
			hotelServiceChildGroup.setHotelServicesParentGroup(this);
		}
	}
	
	public void setHotelServiceChildGroups(List<HotelServicesGroup> hotelServiceChildGroups) {
		this.hotelServiceChildGroups = hotelServiceChildGroups;
	}

	public HotelServicesGroup getHotelServicesParentGroup() {
		return hotelServicesParentGroup;
	}

	public void setHotelServicesParentGroup(HotelServicesGroup hotelServicesParentGroup) {
		this.hotelServicesParentGroup = hotelServicesParentGroup;
		if(!hotelServicesParentGroup.getHotelServiceChildGroups().contains(this)){
			hotelServicesParentGroup.getHotelServiceChildGroups().add(hotelServicesParentGroup);
		}
	}
	
	
	
	
}
