package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/electronics")
public class WelcomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}

	@RequestMapping("/reading")
	public String request(@RequestParam(name = "str") String name, Model model) {
		System.out.println("WelcomeController.greet......" + name);
		model.addAttribute("name", name);
		
		return "success";
	}

}
