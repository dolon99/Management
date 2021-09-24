package com.customer.management.service.impl;

import com.customer.management.dao.impl.DaoImplementation;
import com.customer.management.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	
	DaoImplementation daoImpl = new DaoImplementation();

	public void insertCustomer(int id, String name, String address) {
		daoImpl.insertIntoDB(id, name, address);
		
	}

	public void getCustomer(int id) {
		daoImpl.displayFromDB(id);
		
	}

}
