package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/form")
	public String preet() {
		System.out.println("EmployeeController.preet()");
		return "employeeForm";
	}

	@PostMapping("/submit")
	public String saveEmployee(@RequestParam(value = "name", defaultValue = "Guest") String name,
			@RequestParam("department") String department, @RequestParam("age") int age, Model model) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setDepartment(department);
		emp.setAge(age);

		model.addAttribute("employee", emp);

		System.out.println("EmployeeController.saveEmployee()");
		return "employeeSuccess";
	}

	@PostMapping("/save")
	public String saveByModelAttribute(@ModelAttribute Employee emp, Model model) {

		model.addAttribute("employee", emp);

		
		
		System.out.println("EmployeeController.saveByModelAttribute()");
		return "employeeSuccess";
	}

}
