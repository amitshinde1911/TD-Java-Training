package com.amit.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);

	}

}
