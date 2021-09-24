package com.customer.management.service;

public interface CustomerService {
	void insertCustomer(int id, String name, String address);

	void getCustomer(int id);
}
