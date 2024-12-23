package com.amit.spring.springcore.lc.interfaces;

import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/amit/spring/springcore/lc/interfaces/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}
