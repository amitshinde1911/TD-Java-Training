package com.amit.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/amit/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndlanguages ctl = (CountriesAndlanguages) context.getBean("countriesAndLangs");
		System.out.println(ctl.toString());
	}

}
