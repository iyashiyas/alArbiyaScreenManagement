package org.alArbiyaScreenManagement.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.alArbiyaScreenManagement.model.HotelInfo;
import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.model.Player;
import org.alArbiyaScreenManagement.service.ActionService;
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
			return "redirect:/notAssigned";
		} else {
		    
			List<Player> getPlayerRooms = playerService.getPlayerRooms(iPAddrress);  
			List<Language> languages = languageService.getEnableLanguages();
			List<HotelInfo> hotelInfos = hotelInfoService.getHotelInfo();
			List<HotelServicesCategory> hotelServiceCategories = actionService
					.getHotelServiceCategories();
			Map<String, Object> attributes = new HashMap<String, Object>();
			attributes.put("getPlayerRooms", getPlayerRooms);
			attributes.put("languages", languages);
			attributes.put("hotelInfos", hotelInfos);
			attributes.put("hotelServiceCategories", hotelServiceCategories);
			model.addAllAttributes(attributes);
			return "home/home";
		}
	}

	/*
	 * @RequestMapping(value = "/shms", method = RequestMethod.GET) public
	 * String shms(@ModelAttribute Player player) { String iPAddrress =
	 * request.getHeader("X-FORWARDED-FOR"); if (iPAddrress == null) {
	 * iPAddrress = request.getRemoteAddr(); System.out.println(iPAddrress); }
	 * 
	 * Player playerDetails = playerService.getPlayerDetails(iPAddrress);
	 * System.out.println(playerDetails);
	 * 
	 * playerService.addPlayer(player, iPAddrress); return "home/home"; }
	 */
	@RequestMapping(value = "/notAssigned")
	public String shms() {
		return "home/notAssignedPage";
	}

	  
	@RequestMapping(value="/header", method=RequestMethod.GET)
	public @ResponseBody List<Player> header() {
		String iPAddrress = request.getHeader("X-FORWARDED-FOR");
		if (iPAddrress == null) {
			iPAddrress = request.getRemoteAddr(); 
		} 
		return playerService.getPlayerRooms(iPAddrress);
	}
	

	 
  
}
