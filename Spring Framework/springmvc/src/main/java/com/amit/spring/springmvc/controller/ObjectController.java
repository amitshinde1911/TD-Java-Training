package com.amit.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amit.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Amit");
		emp.setSalary(10000);

		modelAndView.addObject("employee", emp);
		return modelAndView;
	}

}
