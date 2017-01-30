package org.alArbiyaScreenManagement.web;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 



import org.alArbiyaScreenManagement.dto.CarRental;
import org.alArbiyaScreenManagement.dto.CoffeeShop;
import org.alArbiyaScreenManagement.dto.Laundry;
import org.alArbiyaScreenManagement.dto.Restaurant;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.model.HotelServicesValue;
import org.alArbiyaScreenManagement.model.HouseKeeping;
import org.alArbiyaScreenManagement.model.Ingredient;
import org.alArbiyaScreenManagement.model.IngredientSupporter;
import org.alArbiyaScreenManagement.model.Orders;
import org.alArbiyaScreenManagement.model.OrderItems;
import org.alArbiyaScreenManagement.model.ParkingOrder;
import org.alArbiyaScreenManagement.model.Unit;
import org.alArbiyaScreenManagement.model.UnitSupporter;
import org.alArbiyaScreenManagement.service.ActionService;
import org.alArbiyaScreenManagement.service.IngredientService;
import org.alArbiyaScreenManagement.service.LanguageService;
import org.alArbiyaScreenManagement.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ModelAttribute;
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
		if(hotelServiceItems.isEmpty()) {
			attributes.put("getHotelServiceItems",new ArrayList<HotelServicesItem>()); 
			return "coffeeShop/coffeeShop";
		} else {
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				populateOrderItems(hotelServicesItem);
			}
			CoffeeShop coffeShop = new CoffeeShop(); 
			attributes.put("getHotelServiceItems",hotelServiceItems); 
			
			List<Long> hotelServicesItemsIds = new ArrayList<Long>();
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				hotelServicesItemsIds.add(hotelServicesItem.getId());
			}
			List<HotelServicesGroup> parentCategories = actionService.getAllParentCategories(hotelServicesItemsIds);
			List<HotelServicesGroup> uniqueParentCategories = new ArrayList<HotelServicesGroup>();
			for(HotelServicesGroup hotelServicesGroup: parentCategories) {
				if(!uniqueParentCategories.contains(hotelServicesGroup)) {
					uniqueParentCategories.add(hotelServicesGroup);
				}
			}
		    
			attributes.put("uniqueParentCategories", uniqueParentCategories);
			attributes.put("coffeShop", coffeShop); 
			attributes.put("newOrder", new Orders());
			model.addAllAttributes(attributes);
			return "coffeeShop/coffeeShop";
		}
	} 

	@RequestMapping(value = "/showRestaurant", method = RequestMethod.GET)
	public String showRestaurant(Model model, @RequestParam(required=true) String ServiceId) {
			 
		List<HotelServicesItem> hotelServiceItems = actionService.getHotelServiceItems(ServiceId);
		
		Map<String, Object> attributes = new HashMap<String, Object>();
		if(hotelServiceItems.isEmpty()) {
			attributes.put("getHotelServiceItems",new ArrayList<HotelServicesItem>()); 
			return "restaurant/restaurant";
		} else {
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				populateOrderItems(hotelServicesItem);
			}
			Restaurant restaurant = new Restaurant(); 
			attributes.put("getHotelServiceItems",hotelServiceItems); 
			
			List<Long> hotelServicesItemsIds = new ArrayList<Long>();
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				hotelServicesItemsIds.add(hotelServicesItem.getId());
			}
			List<HotelServicesGroup> parentCategories = actionService.getAllParentCategories(hotelServicesItemsIds);
			List<HotelServicesGroup> uniqueParentCategories = new ArrayList<HotelServicesGroup>();
			for(HotelServicesGroup hotelServicesGroup: parentCategories) {
				if(!uniqueParentCategories.contains(hotelServicesGroup)) {
					uniqueParentCategories.add(hotelServicesGroup);
				}
			}
		    
			attributes.put("uniqueParentCategories", uniqueParentCategories);
			attributes.put("restaurant", restaurant); 
			attributes.put("newOrder", new Orders());
			model.addAllAttributes(attributes);
			return "restaurant/restaurant";
		}
		
	} 
	
	@RequestMapping(value = "/showCarRental", method = RequestMethod.GET)
	public String showCarRental(Model model, @RequestParam(required=true) String ServiceId) {
	List<HotelServicesItem> hotelServiceItems = actionService.getHotelServiceItems(ServiceId);
		
		Map<String, Object> attributes = new HashMap<String, Object>();
		if(hotelServiceItems.isEmpty()) {
			attributes.put("getHotelServiceItems",new ArrayList<HotelServicesItem>()); 
			return "rentalService/rentalService";
		} else {
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				populateOrderItems(hotelServicesItem);
			}
			CarRental carRental = new CarRental(); 
			attributes.put("getHotelServiceItems",hotelServiceItems); 
			
			List<Long> hotelServicesItemsIds = new ArrayList<Long>();
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				hotelServicesItemsIds.add(hotelServicesItem.getId());
			}
			List<HotelServicesGroup> parentCategories = actionService.getAllParentCategories(hotelServicesItemsIds);
			List<HotelServicesGroup> uniqueParentCategories = new ArrayList<HotelServicesGroup>();
			for(HotelServicesGroup hotelServicesGroup: parentCategories) {
				if(!uniqueParentCategories.contains(hotelServicesGroup)) {
					uniqueParentCategories.add(hotelServicesGroup);
				}
			}
		    
			attributes.put("uniqueParentCategories", uniqueParentCategories);
			attributes.put("carRental", carRental); 
			attributes.put("newOrder", new Orders());
			model.addAllAttributes(attributes);
			return "rentalService/rentalService";
		}
		
	}
	
	@RequestMapping(value = "/showLaundry", method = RequestMethod.GET)
	public String showLaundry(Model model, @RequestParam(required=true) String ServiceId) {
List<HotelServicesItem> hotelServiceItems = actionService.getHotelServiceItems(ServiceId);
		
		Map<String, Object> attributes = new HashMap<String, Object>();
		if(hotelServiceItems.isEmpty()) {
			attributes.put("getHotelServiceItems",new ArrayList<HotelServicesItem>()); 
			return "laundry/laundry";
		} else {
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				populateOrderItems(hotelServicesItem);
			}
			Laundry laundry = new Laundry(); 
			attributes.put("getHotelServiceItems",hotelServiceItems); 
			
			List<Long> hotelServicesItemsIds = new ArrayList<Long>();
			for(HotelServicesItem hotelServicesItem: hotelServiceItems) {
				hotelServicesItemsIds.add(hotelServicesItem.getId());
			}
			List<HotelServicesGroup> parentCategories = actionService.getAllParentCategories(hotelServicesItemsIds);
			List<HotelServicesGroup> uniqueParentCategories = new ArrayList<HotelServicesGroup>();
			for(HotelServicesGroup hotelServicesGroup: parentCategories) {
				if(!uniqueParentCategories.contains(hotelServicesGroup)) {
					uniqueParentCategories.add(hotelServicesGroup);
				}
			}
		    
			attributes.put("uniqueParentCategories", uniqueParentCategories);
			attributes.put("laundry", laundry); 
			attributes.put("newOrder", new Orders());
			model.addAllAttributes(attributes);
			return "laundry/laundry";
		}
		
	
	}
	    
	private void populateOrderItems(HotelServicesItem hotelServicesItem) {
		// TODO Auto-generated method stub
		OrderItems orderItems = new OrderItems();
		List<UnitSupporter> unitSupporter = new ArrayList<UnitSupporter>();
		List<IngredientSupporter> ingredientSupporters = new ArrayList<IngredientSupporter>();
		
		for(HotelServicesGroup parentGroup:hotelServicesItem.getHotelServiceParentGroups()) {
			for(HotelServicesGroup childGroup:parentGroup.getHotelServiceChildGroups()) {
				for(HotelServicesValue hotelServicesValue: childGroup.getHotelServicesValues()){
					if(hotelServicesValue.getFieldName().equals("UNITID")) {
						Unit unit = unitService.getUnit(Long.parseLong(hotelServicesValue.getExternalId()));
						
						UnitSupporter supporter = new UnitSupporter();
						supporter.setUnitId(unit.getId());
						supporter.setUnitName(unit.getUnitName());
						supporter.setUnitPrice(Long.parseLong(hotelServicesValue.getItemPrice()));
						unitSupporter.add(supporter);
					} 
					if(hotelServicesValue.getFieldName().equals("INGREDIENTID")) {
						Ingredient ingredient = ingredientService.getIngredient(Long.parseLong(hotelServicesValue.getExternalId()));
						IngredientSupporter supporter = new IngredientSupporter();
						supporter.setIngredientId(ingredient.getId());
						supporter.setIngredientName(ingredient.getIngredientName());
						supporter.setIngredientPrice(Long.parseLong(hotelServicesValue.getItemPrice()));
						ingredientSupporters.add(supporter);
					}
					orderItems.setUnitSupporter(unitSupporter);
					orderItems.setIngredientSupporter(ingredientSupporters);
				}
			}
		}
		hotelServicesItem.setOrderItems(orderItems); 
	}
	
	@RequestMapping(value="/addOrder", method=RequestMethod.POST)
	public String addOrder(@ModelAttribute Orders order){
		System.out.println("room ID"+order.getRoom().getId());
		actionService.addOrder(order);
		return "redirect:/showHomePage";
	}
	
	@RequestMapping(value="/parkingRequest", method=RequestMethod.POST)
	public String parkingRequest(@ModelAttribute ParkingOrder parkingOrder){ 
		actionService.parkingRequest(parkingOrder);
		return "redirect:/showHomePage";
	}
	
	@RequestMapping(value="/houseKeepingRequest", method=RequestMethod.POST)
	public String houseKeepingRequest(@ModelAttribute HouseKeeping houseKeepingOrder){ 
		actionService.houseKeepingRequest(houseKeepingOrder);
		return "redirect:/showHomePage";
	}
	 
}
