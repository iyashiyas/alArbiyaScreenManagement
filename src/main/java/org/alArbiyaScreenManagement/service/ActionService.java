package org.alArbiyaScreenManagement.service;
 
import java.util.List;

import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.model.Orders;
 
  
public interface ActionService {
 
	public List<HotelServicesItem> getAllCoffeShopItems();
 
	public List<HotelServicesItem> getAllRestaurantItems();

	public List<HotelServicesCategory> getHotelServiceCategories();

	public List<HotelServicesItem> getHotelServiceItems(String serviceId);

	public List<HotelServicesGroup> getAllParentCategories(List<Long> hotelServicesItemsIds);

	public Orders addOrder(Orders order);
 
}
