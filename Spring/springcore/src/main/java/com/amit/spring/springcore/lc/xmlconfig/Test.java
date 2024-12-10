package com.amit.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/amit/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}
