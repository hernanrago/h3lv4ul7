package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import net.h3lv4ul7.mtgodyssey.model.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer card);
	
	Customer updateCustomer(Customer card);
		
	Customer findCustomerById(Integer id);
	
	List<Customer> findAllCustomers();
	
	void deleteCustomer(Customer card);

}
