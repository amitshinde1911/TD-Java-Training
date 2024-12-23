package com.amit.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
	}

}
