package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.model.Orders;
 

public interface ActionRepository {
	 
	public void hotelService(HotelServicesItem hotelServices);
	public List<HotelServicesItem> getAllCoffeShopItems() ;
	public HotelServicesCategory getHotelServicesCategory(long parseLong);
	public List<HotelServicesItem> getAllRestaurantItems();
	public List<HotelServicesCategory> getHotelServiceCategories();
	public List<HotelServicesItem> getHotelServiceItems(String serviceId);
	public List<HotelServicesGroup> getAllParentCategories(
			List<Long> hotelServicesItemsIds);
	public Orders addOrder(Orders order);
  
}
