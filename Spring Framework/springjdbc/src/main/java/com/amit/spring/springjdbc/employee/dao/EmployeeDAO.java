
package com.amit.spring.springjdbc.employee.dao;

import java.util.List;

import com.amit.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> findAll();

}
