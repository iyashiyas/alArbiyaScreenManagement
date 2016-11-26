package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RentalController {
	@RequestMapping(value = "/rental")
	public String showHome() {
		return "rentalService/rentalService";
	}
}
