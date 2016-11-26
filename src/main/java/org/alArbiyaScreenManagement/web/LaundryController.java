package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaundryController {
	@RequestMapping(value = "/laundry")
	public String showHome() {
		return "laundry/laundry";
	}
}
