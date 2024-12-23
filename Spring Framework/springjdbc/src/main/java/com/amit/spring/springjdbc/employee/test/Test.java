package com.amit.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amit.spring.springjdbc.employee.dao.EmployeeDAO;
import com.amit.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/amit/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDao");
		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setFirstName("Leo");
//		employee.setLastname("GOAT");
//		int result = dao.create(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(1);
		List<Employee> employee2 = dao.findAll();
		System.out.println(employee2);

//		System.out.println("Number of records deleted are : " + result);

	}

}
