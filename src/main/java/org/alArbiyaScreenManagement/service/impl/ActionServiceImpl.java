package org.alArbiyaScreenManagement.service.impl;

 
import java.util.List;
 




import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.repository.ActionRepository;
import org.alArbiyaScreenManagement.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements ActionService {
	
	@Autowired ActionRepository actionRepository;
	
  
	@Override
	public List<HotelServicesItem> getAllCoffeShopItems() {
		// TODO Auto-generated method stub
		return actionRepository.getAllCoffeShopItems();
	}
	 
	@Override
	public List<HotelServicesItem> getAllRestaurantItems() {
		// TODO Auto-generated method stub
		return actionRepository.getAllRestaurantItems();
	}

	@Override
	public List<HotelServicesCategory> getHotelServiceCategories() {
		// TODO Auto-generated method stub
		return actionRepository.getHotelServiceCategories();
	}

	@Override
	public List<HotelServicesItem> getHotelServiceItems(String serviceId) {
		// TODO Auto-generated method stub
		return actionRepository.getHotelServiceItems(serviceId);
	}

	@Override
	public List<HotelServicesGroup> getAllParentCategories(List<Long> hotelServicesItemsIds) {
		return actionRepository.getAllParentCategories(hotelServicesItemsIds);
	}
	 
}
