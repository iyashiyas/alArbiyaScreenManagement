package org.alArbiyaScreenManagement.web;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

  



import org.alArbiyaScreenManagement.dto.CoffeeShop;
import org.alArbiyaScreenManagement.dto.Restaurant;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.service.ActionService;
import org.alArbiyaScreenManagement.service.IngredientService;
import org.alArbiyaScreenManagement.service.LanguageService;
import org.alArbiyaScreenManagement.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/action")
public class ActionController {
 
	@Autowired
	ActionService actionService;
	@Autowired
	LanguageService languageService;
	@Autowired
	UnitService unitService;
	@Autowired
	IngredientService ingredientService;

	
	@RequestMapping(method = RequestMethod.GET)
	public String showAction(
			Model model,
			@RequestParam(required = false) org.alArbiyaScreenManagement.enums.Action actionCode) {
		String actionCde = (actionCode == null || actionCode.name() == "") ? "action"
				: actionCode.getActionName();
		Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("coffeShop", new CoffeeShop());
		model.addAllAttributes(attributes);
		return "action/" + actionCde;
	}

	@RequestMapping(value = "/showCoffeeShop", method = RequestMethod.GET)
	public String showCoffeeShop(Model model, @RequestParam(required=true) String ServiceId) {
			 
		List<HotelServicesItem> hotelServiceItems = actionService.getHotelServiceItems(ServiceId); 
		Map<String, Object> attributes = new HashMap<String, Object>();
		CoffeeShop coffeeShop = new CoffeeShop(); 
		attributes.put("getHotelServiceItems",hotelServiceItems); 
		
		List<Long> hotelServicesItemsIds = new ArrayList<Long>();
		for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
			hotelServicesItemsIds.add(hotelServicesItem.getId());
		}
		List<HotelServicesGroup> parentCategories = actionService.getAllParentCategories(hotelServicesItemsIds);
		
		attributes.put("coffeShop", coffeeShop); 
		model.addAllAttributes(attributes);
		return "coffeeShop/coffeeShop";
	}
  
	@RequestMapping(value = "/showRestaurant", method = RequestMethod.GET)
	public String showRestaurant(Model model, @RequestParam(required=true) String ServiceId) {
		System.out.println(ServiceId);
	  
		List<HotelServicesItem> getHotelServiceItems = actionService
				.getHotelServiceItems(ServiceId);

		Map<String, Object> attributes = new HashMap<String, Object>();
		Restaurant restaurant = new Restaurant(); 
		attributes.put("getHotelServiceItems",getHotelServiceItems); 
		attributes.put("restaurant", restaurant); 
		model.addAllAttributes(attributes);
		
		return "restaurant/restaurant";
	}
	
	@RequestMapping(value = "/showCarRental", method = RequestMethod.GET)
	public String showCarRental(Model model, @RequestParam(required=true) String ServiceId) {
		System.out.println(ServiceId); 
		List<HotelServicesItem> getHotelServiceItems = actionService
				.getHotelServiceItems(ServiceId); 
		Map<String, Object> attributes = new HashMap<String, Object>();
		Restaurant restaurant = new Restaurant(); 
		attributes.put("getHotelServiceItems",getHotelServiceItems); 
		attributes.put("restaurant", restaurant); 
		model.addAllAttributes(attributes);
		
		return "rentalService/rentalService";
	}
	
	@RequestMapping(value = "/showLaundry", method = RequestMethod.GET)
	public String showLaundry(Model model, @RequestParam(required=true) String ServiceId) {
		System.out.println(ServiceId);
	   List<HotelServicesItem> getHotelServiceItems = actionService
				.getHotelServiceItems(ServiceId);
    Map<String, Object> attributes = new HashMap<String, Object>();
		Restaurant restaurant = new Restaurant(); 
		attributes.put("getHotelServiceItems",getHotelServiceItems); 
		attributes.put("restaurant", restaurant); 
		model.addAllAttributes(attributes);
		
		return "laundry/laundry";
	}
	 
	
	 
}
