package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/footwear")
public class FootwearController {
	
	
	@RequestMapping("/")
	public String preet() {
		System.out.println("EmployeeController.preet()");
		return "welcome";
	}

}
