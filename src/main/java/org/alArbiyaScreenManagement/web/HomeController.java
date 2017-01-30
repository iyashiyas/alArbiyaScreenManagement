package org.alArbiyaScreenManagement.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.alArbiyaScreenManagement.model.Booking;
import org.alArbiyaScreenManagement.model.HotelInfo;
import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HouseKeeping;
import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.model.ParkingOrder;
import org.alArbiyaScreenManagement.model.Player;
import org.alArbiyaScreenManagement.model.ReceptionOrder;
import org.alArbiyaScreenManagement.service.ActionService;
import org.alArbiyaScreenManagement.service.BookingService;
import org.alArbiyaScreenManagement.service.HomeService;
import org.alArbiyaScreenManagement.service.HotelInfoService;
import org.alArbiyaScreenManagement.service.LanguageService;
import org.alArbiyaScreenManagement.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	LanguageService languageService;

	@Autowired
	HomeService homeService;

	@Autowired
	PlayerService playerService;

	@Autowired
	ActionService actionService;

	@Autowired
	HotelInfoService hotelInfoService;
	
	@Autowired
    BookingService bookingService;

	@Autowired(required = true)
	private HttpServletRequest request;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome(Model model, @ModelAttribute Player player) { 
		String iPAddrress = request.getHeader("X-FORWARDED-FOR");
		if (iPAddrress == null) {
			iPAddrress = request.getRemoteAddr();
			System.out.println(iPAddrress);
		}
		 
		playerService.addPlayer(player, iPAddrress);
		Player getRoomAssignedPlayer = playerService.getRoomAssignedPlayer(
				player, iPAddrress);
		if (getRoomAssignedPlayer == null) {
			model.addAttribute("configured", "notconfigured");
			return "redirect:/notAssigned";
		} else { 
			return "redirect:/authenticationPage";
		}
	}
	@RequestMapping(value = "/checkAuthenticationPassword", method = RequestMethod.GET)
	public String authenticate(@RequestParam(required=true) long roomId,
			@RequestParam(required=true) int password, @ModelAttribute Booking booking,Model model) { 
		System.out.println("roomID" +roomId); 
		Map<String, Object> attributes = new HashMap<String, Object>();
		Booking AuthenticatePassword= bookingService.authenticate(roomId,password);
		if(AuthenticatePassword==null)
		{ 
			attributes.put("error","error");
			return "home/authenticationPage";
		}
		else
		{ 
			return "redirect:/showHomePage";
		}
		 
	}  
	@RequestMapping(value = "/showHomePage")
	public String showHomePage(Model model) {
		Map<String, Object> attributes = new HashMap<String, Object>();
		List<Language> languages = languageService.getEnableLanguages();
		List<HotelInfo> hotelInfos = hotelInfoService.getHotelInfo();
		List<HotelServicesCategory> hotelServiceCategories = actionService.getHotelServiceCategories(); 
		attributes.put("languages", languages);
		attributes.put("hotelInfos", hotelInfos);
		attributes.put("hotelServiceCategories", hotelServiceCategories);
		attributes.put("parkingOrder", new ParkingOrder());
		attributes.put("receptionOrder", new ReceptionOrder());
		attributes.put("houseKeepingOrder", new HouseKeeping());
		model.addAllAttributes(attributes); 
		return "home/home";
	} 
	@RequestMapping(value = "/notAssigned")
	public String shms() {
		return "home/notAssignedPage";
	}
	
	@RequestMapping(value = "/authenticationPage")
	public String authenticationPage() {
		return "home/authenticationPage";
	}
 
	@RequestMapping(value="/header", method=RequestMethod.GET)
	public @ResponseBody List<Player> header() {
		String iPAddrress = request.getHeader("X-FORWARDED-FOR");
		if (iPAddrress == null) {
			iPAddrress = request.getRemoteAddr(); 
		} 
		return playerService.getPlayerRooms(iPAddrress);
	}
	
	@RequestMapping(value="/roomCustomerName", method=RequestMethod.GET)
	public @ResponseBody List<Booking> roomCustomerName(@RequestParam(required=false) String roomID) { 
		return bookingService.roomCustomerName(roomID);
	}
	 
}
