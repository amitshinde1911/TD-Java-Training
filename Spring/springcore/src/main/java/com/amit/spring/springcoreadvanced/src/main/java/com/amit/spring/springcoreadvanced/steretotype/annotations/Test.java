package com.amit.spring.springcoreadvanced.steretotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/amit/spring/springcoreadvanced/steretotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("inst");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor2);

	}

}
