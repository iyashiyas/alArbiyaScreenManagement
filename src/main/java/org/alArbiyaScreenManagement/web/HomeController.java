package org.alArbiyaScreenManagement.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller
public class HomeController {
	
	@Autowired
	LanguageService languageService; 
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome(Model model) {
		List<Language> languages = languageService.getEnableLanguages();
		Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("languages", languages);
		model.addAllAttributes(attributes);
		return "home/home";
	}
	
}
