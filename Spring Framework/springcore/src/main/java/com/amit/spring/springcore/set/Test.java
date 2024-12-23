package com.amit.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amit/spring/springcore/set/setconfig.xml");
		CarDealer cd = (CarDealer) context.getBean("carDealer");
		System.out.println(cd.getName());
		System.out.println(cd.getModels());
		System.out.println(cd.getModels().getClass().getName());
		
	}

}
