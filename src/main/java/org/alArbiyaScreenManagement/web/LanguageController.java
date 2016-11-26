package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguageController {
	@RequestMapping(value = "/language")
	public String showHome() {
		return "language/language";
	}
}
