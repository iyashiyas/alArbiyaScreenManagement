package org.alArbiyaScreenManagement.service.impl;

 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 







import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.model.Orders;
import org.alArbiyaScreenManagement.model.ParkingOrder;
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

	@Override
	public Orders addOrder(Orders order) {
		System.out.println("roomid is == "+ order.getRoom().getId());
		// TODO Auto-generated method stub
		order.setOrderStatus("ORDERED");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date(); 
	    order.setRequestedTime(dateFormat.format(date)); 
		return actionRepository.addOrder(order);
	}

	@Override
	public ParkingOrder parkingRequest(ParkingOrder parkingOrder) {
		// TODO Auto-generated method stub
		parkingOrder.setOrderStatus("ORDERED");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date(); 
		parkingOrder.setRequestTime(dateFormat.format(date)); 
		return actionRepository.parkingRequest(parkingOrder);
	}
	 
}
