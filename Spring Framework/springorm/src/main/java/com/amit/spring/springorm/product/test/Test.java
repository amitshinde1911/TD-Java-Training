package com.amit.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amit.spring.springorm.product.dao.ProductDAO;
import com.amit.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/amit/spring/springorm/product/test/config.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone13");
		product.setDesc("IOS phone");
		product.setPrice(30000);
//		productDao.create(product);
//		productDao.update(product);
//		productDao.delete(product);
//		Product products = productDao.find(1);
		List<Product> products = productDao.findAll();
		System.out.println(products);
		
	}

}
