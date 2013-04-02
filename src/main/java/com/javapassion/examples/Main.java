package com.javapassion.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapassion.examples.services.CustomerService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml" });

		CustomerService customerService = 
			(CustomerService) context.getBean("customerService");
		System.out.println(customerService.getCustomerGreeting());

	}
}
