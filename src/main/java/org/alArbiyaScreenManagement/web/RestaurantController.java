package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {
	@RequestMapping(value = "/restaurant")
	public String showHome() {
		return "restaurant/restaurant";
	}
}
