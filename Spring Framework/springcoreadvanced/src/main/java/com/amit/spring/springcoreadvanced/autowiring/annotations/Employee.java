package com.amit.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired(required = false)
	@Qualifier("address123")
	private Address address;
	

	
	@Override
	public String toString() {
		return "Employee [ address=" + address + "]";
	}

}
