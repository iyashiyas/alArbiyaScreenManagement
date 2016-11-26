package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParkingController {
	@RequestMapping(value = "/parking")
	public String showHome() {
		return "parking/parking";
	}
}
