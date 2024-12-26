package com.ccm.view;

import java.util.Scanner;

import com.ccm.model.Cloud;
import com.ccm.model.Customer;

public class CustomerView {
	static int customerId, cloudId;
	static String customerName;
	static int phoneNumber;

	static Scanner sc = new Scanner(System.in);
	
	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. find All Employee");
		System.out.println("6. Insert Department");
		System.out.println("7. Delete Department");
		System.out.println("8. Update Departmnet");
		System.out.println("9. find Department");
		System.out.println("10. find Department");
		System.out.println("11. Exit");

		System.out.println("Enter Your Choice:");
		return sc.nextInt();
	}
	
	public static void printInvalid() {
		System.out.println("Invalid Choice");
	}
	
	public static String continues() {
		System.out.println("Do you Want to Continue [yes | No ] : ");
		return sc.next();
	}
 
	public static void printResult(String result) {
		System.out.println(result);
	}

	public static Customer insertCustomerView() {
		System.out.println("Enter customer id, name, phone number and cloud id");
		customerId = sc.nextInt();
		customerName = sc.next();
		phoneNumber = sc.nextInt();
		cloudId = sc.nextInt();

		Cloud cloud = new Cloud();
		cloud.setCloudId(cloudId);

		return new Customer(customerId, customerName, phoneNumber, cloud);

	}

	public static int deleteCustomerView() {
		System.out.println("Enter customer Id :");
		return sc.nextInt();
	}

	public static Customer updateCustomerView() {
		System.out.println("Enter customer id, name, phone number and cloud id");
		customerId = sc.nextInt();
		customerName = sc.next();
		phoneNumber = sc.nextInt();
		cloudId = sc.nextInt();

		Cloud cloud = new Cloud();
		cloud.setCloudId(cloudId);

		return new Customer(customerId, customerName, phoneNumber, cloud);
	}

	public static int findCustomerView() {
		System.out.println("Enter customer Id :");
		return sc.nextInt();
	}

}
