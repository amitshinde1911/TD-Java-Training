package com.amit.spring.springcore.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/amit/spring/springcore/dependencycheck/config.xml");
		Prescription pre = (Prescription) context.getBean("prescription");
		System.out.println(pre);
		
		
		
		
	}

}
