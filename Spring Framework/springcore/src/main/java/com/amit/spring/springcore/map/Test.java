package com.amit.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amit/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.toString());
	}

}
