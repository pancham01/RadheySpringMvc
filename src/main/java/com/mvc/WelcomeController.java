package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}

}
