package com.amit.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcoreadvanced/autowiring/assignment/config.xml");
		Customer cus = (Customer) ctx.getBean("customer1");
		System.out.println(cus);

	}

}
