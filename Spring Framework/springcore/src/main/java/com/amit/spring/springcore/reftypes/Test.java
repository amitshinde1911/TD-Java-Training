package com.amit.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amit/spring/springcore/reftypes/reftypesconfig.xml");
		Student std = (Student) context.getBean("student");
		System.out.println(std.toString());
	}

}
