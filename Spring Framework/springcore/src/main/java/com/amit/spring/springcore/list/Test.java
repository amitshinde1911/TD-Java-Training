package com.amit.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
		
		
	}

}
