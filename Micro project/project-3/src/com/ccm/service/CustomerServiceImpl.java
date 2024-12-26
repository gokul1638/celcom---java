package com.ccm.service;

import com.ccm.model.Customer;
import com.ccm.repo.CustomerRepoImpl;
import com.ccm.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	CustomerRepo customerRepo = new CustomerRepoImpl();

	public String insertCustomerValidation(Customer customer) {
		String result;
		if (customer == null) {
			result = "Employee object is null";
		} else if (customer.getCustomerId() == 0 || customer.getCustomerName() == null || customer.getPhoneNumber() == 0
				|| customer.getCloud().getCloudId() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = customerRepo.doInsertEmployee(customer);
			if (flag) {
				result = "Customer object Saved";
			} else {
				result = "Customer object not Saved";
			}
		}
		return result;
	}
	
	public String deleteCustomerValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = customerRepo.doDeleteCustomer(id);
			if (flag) {
				result = "Employee object Deleted";
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
	public String updateCustomerValidation(Customer customer) {
		String result;
		if (customer == null) {
			result = "Customer Object is Null";
		} else if (customer.getCustomerId() == 0 || customer.getCustomerName() == null || customer.getPhoneNumber() == 0) {
			result = "Invalid Customer Data";
		} else {
			boolean flag = customerRepo.doUpdateCustomer(customer);
			if (flag) {
				result = "Employee Object Updated ";
			} else {
				result = "Employee Object Not Found ";
			}
		}
		return result;
	}
	
	public String findCustomerValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Customer customer = customerRepo.doFindCustomer(id);
			if (customer != null) {
				result = customer.toString();
			} else {
				result = "Customer object  Not Found";
			}
		}
		return result;
	}
	
	
	
	public String findAllCustomerValidation()
	{
		return customerRepo.doFindAllCustomer().toString();
	}

}