package com.amit.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amit.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("empList");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Amit");
		emp.setSalary(10000);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("John");
		emp2.setSalary(1000);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Leo");
		emp3.setSalary(200000);
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);
		

		modelAndView.addObject("employees", empList);
		return modelAndView;
	}

}
