package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.h3lv4ul7.mtgodyssey.model.Customer;
import net.h3lv4ul7.mtgodyssey.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findCustomerById(Integer id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);

	}

}
