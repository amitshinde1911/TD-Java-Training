package com.amit.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/amit/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		bo.placeOrder();
	}

}
