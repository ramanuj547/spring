package com.learn.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Customer customer = (Customer)context.getBean("customer");
		
		//ByDefault Ioc Create singleton object
		Customer customer2 = (Customer)context.getBean("customer");
		
		System.out.println("Customer Id " +customer.getId());
		System.out.println("Customer Name : " +customer.getName());
		
	}
	
}
