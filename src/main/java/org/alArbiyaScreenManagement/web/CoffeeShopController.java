package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoffeeShopController {
	@RequestMapping(value = "/coffeeShop")
	public String showHome() {
		return "coffeeShop/coffeeShop";
		
	}
}
