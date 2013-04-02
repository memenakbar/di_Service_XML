package com.javapassion.examples.services;

import com.javapassion.examples.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public String getCustomerGreeting() {
		String greeting = "Hello, " + customerDao.getCustomerName();
		return greeting;
	}

}
