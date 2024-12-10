package com.amit.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcore/innerbeans/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) ctx.getBean("employee");
		System.out.println(emp2.hashCode());
	}

}
