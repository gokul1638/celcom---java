package com.ccm.main;

import java.util.Scanner;

import com.ccm.model.Cloud;
import com.ccm.model.Customer;
import com.ccm.service.CloudServiceimpl;
import com.ccm.service.CustomerServiceImpl;
import com.ccm.service.CloudService;
import com.ccm.service.CustomerService;
import com.ccm.view.CloudView;
import com.ccm.view.CustomerView;

public class CCMApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();
		CloudService cloudService = new CloudServiceimpl();
		String result = "";
		Customer customer;
		Cloud cloud;
		int id,deptNo;
		
		String msg = "";
		do {
			int choice = CustomerView.menu();

			switch (choice) {
			case 1: {
				customer = CustomerView.insertCustomerView();
				result = customerService.insertCustomerValidation(customer);
				CustomerView.printResult(result);
				break;
			}
			case 2: {
				id = CustomerView.deleteCustomerView();
				result = customerService.deleteCustomerValidation(id);
				CustomerView.printResult(result);
				break;
			}
			case 3: {
				customer = CustomerView.updateCustomerView();
				result = customerService.updateCustomerValidation(customer);
				CustomerView.printResult(result);
				break;
			}
			case 4: {

				id = CustomerView.findCustomerView();
				result = customerService.findCustomerValidation(id);
				CustomerView.printResult(result);
				break;
			}
			case 5: {
				result = customerService.findAllCustomerValidation();
				CustomerView.printResult(result);
				break;
			}
			case 6: {
				cloud = CloudView.insertCloudView();
				result = cloudService.insertCloudValidation(cloud);
				CustomerView.printResult(result);
				break;
			}
			case 7: {
				deptNo = CloudView.deleteCloudView();
				result = cloudService.deleteCloudValidation(deptNo);
				CustomerView.printResult(result);
				break;
			}
			case 8: {
				cloud = CloudView.updateCloudView();
				result = cloudService.updateCloudValidation(cloud);
				CustomerView.printResult(result);
				break;
			}
			case 9: {
				deptNo = CloudView.findCloudView();
				result = cloudService.findCloudValidation(deptNo);
				CustomerView.printResult(result);
				break;
			}
			case 10: {
				result = cloudService.findAllCloudValidation();
				CustomerView.printResult(result);
				break;
			}
			case 11: {
				System.exit(0);
			}
			}

			
			msg = CustomerView.continues();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
