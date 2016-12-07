package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoffeeShopController {
	
	@RequestMapping(value = "/coffeeShop")
	public String coffeeShop(  ) {
		return "coffeeShop/coffeeShop"; 
	}
	
	
}
