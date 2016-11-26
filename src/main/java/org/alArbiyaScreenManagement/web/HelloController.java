package org.alArbiyaScreenManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public void showHello() {
		System.out.println("Hello pa..");
	}
}
