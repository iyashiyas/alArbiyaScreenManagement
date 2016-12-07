package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
 

public interface ActionRepository {
	 
	public void hotelService(HotelServicesItem hotelServices);
	public List<HotelServicesItem> getAllCoffeShopItems() ;
	public HotelServicesCategory getHotelServicesCategory(long parseLong);
	public List<HotelServicesItem> getAllRestaurantItems();
	public List<HotelServicesCategory> getHotelServiceCategories();
	public List<HotelServicesItem> getHotelServiceItems(String serviceId);
  
}
