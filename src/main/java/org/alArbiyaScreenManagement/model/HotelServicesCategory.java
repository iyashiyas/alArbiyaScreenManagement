package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="HOTEL_SERVICES_CATEGORY")
public class HotelServicesCategory {

	@Id @GeneratedValue 
	@Column(name="SERVICE_CATEGORY_ID")
	private long hotelServicesCategoryId;
	
	@Column(name="SERVICE_CATEGORY_STATUS")
	private String categoryStatus;
	
	@Column(name="SERVICE_CATEGORY_NAME")
	private String serviceCategoryName;
	
	@Column(name="SERVICE_CATEGORY_DESCRIPTION")
	private String serviceCategoryDescription;
	
	@Column(name="SERVICE_CATEGORY_ICON_NAME")
	private String serviceCategoryIconName;
	
 
	@OneToMany(mappedBy = "hotelServicesCategory", fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	private List<HotelServicesItem> hotelServicesItems;
 
	public long getHotelServicesCategoryId() {
		return hotelServicesCategoryId;
	}

	public void setHotelServicesCategoryId(long hotelServicesCategoryId) {
		this.hotelServicesCategoryId = hotelServicesCategoryId;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public String getServiceCategoryName() {
		return serviceCategoryName;
	}

	public void setServiceCategoryName(String serviceCategoryName) {
		this.serviceCategoryName = serviceCategoryName;
	}
  
	public String getServiceCategoryDescription() {
		return serviceCategoryDescription;
	}

	public void setServiceCategoryDescription(String serviceCategoryDescription) {
		this.serviceCategoryDescription = serviceCategoryDescription;
	}

	public String getServiceCategoryIconName() {
		return serviceCategoryIconName;
	}

	public void setServiceCategoryIconName(String serviceCategoryIconName) {
		this.serviceCategoryIconName = serviceCategoryIconName;
	}

	public List<HotelServicesItem> getHotelServicesItems() {
		return hotelServicesItems;
	}

	public void addHotelServicesItem(HotelServicesItem hotelServicesItem) {
		this.hotelServicesItems.add(hotelServicesItem);
		if(hotelServicesItem.getHotelServicesCategory() != this) {
			hotelServicesItem.setHotelServicesCategory(this);
		}
	}
	
	public void setHotelServicesItems(List<HotelServicesItem> hotelServicesItems) {
		this.hotelServicesItems = hotelServicesItems;
	}
	
	
	public boolean isEmpty() {
		return (this.getServiceCategoryName() == null || this.getServiceCategoryName().isEmpty());
	}
}
