package com.ccm.service;

import com.ccm.model.Customer;

public interface CustomerService {
	public String insertCustomerValidation(Customer customer);

	public String deleteCustomerValidation(int id);

	public String updateCustomerValidation(Customer customer);

	public String findCustomerValidation(int id);

	public String findAllCustomerValidation();

}
