package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EMSApp {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt();
		return choice;
	}

	public static Employee insertView() {
		System.out.println("Enter employee id,name and salary");
//		int id = sc.nextInt();
//		String name = sc.next();
//		double salary = sc.nextDouble();

		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

	}

	public static int deleteView() {
		System.out.println("Enter Employee Id :");
		return sc.nextInt();
	}

	public static Employee updateView() {
		System.out.println("Enter Employee Id,Name, and Salary : ");
		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
	}

	public static int findView() {
		System.out.println("Enter Employee Id :");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		String result = "";
		Employee employee;
		int id;
		String msg = "";
		do {
			int choice = menu();

			switch (choice) {
			case 1: {
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			}
			case 2: {
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			}
			case 3: {
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			}
			case 4: {

				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			}
			case 5: {
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			}
			case 6: {
				System.exit(0);
			}
			}

			System.out.println("Do you want to Continue [yes | no]:");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
