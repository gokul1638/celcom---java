package com.ccm.repo;

import java.util.List;

import com.ccm.model.Customer;

public interface CustomerRepo {
	public boolean doInsertEmployee(Customer customer);

	public boolean doDeleteCustomer(int id);

	public boolean doUpdateCustomer(Customer customer);

	public Customer doFindCustomer(int id);

	public List<Customer> doFindAllCustomer();

}
