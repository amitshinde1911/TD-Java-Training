package com.amit.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition addition = (Addition) ctx.getBean("addition");
		System.out.println(addition);

	}

}
