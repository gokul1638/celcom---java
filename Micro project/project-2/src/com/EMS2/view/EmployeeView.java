package com.EMS2.view;

import java.util.Scanner;

import com.EMS2.model.Department;
import com.EMS2.model.Employee;

public class EmployeeView {
	static int eId, salary, dept_no;
	static String eName;

	static Scanner sc = new Scanner(System.in);

	

	public static Employee insertEmployeeView() {
		System.out.println("Enter employee id, name, salary and dept_no");
		eId = sc.nextInt();
		eName = sc.next();
		salary = sc.nextInt();
		dept_no = sc.nextInt();
		Department Department = new Department();
		Department.setDept_no(dept_no);

		return new Employee(eId, eName, salary,Department);

	}

	public static int deleteEmployeeView() {
		System.out.println("Enter Employee Id :");
		return sc.nextInt();
	}

	public static Employee updateEmployeeView() {
		System.out.println("Enter employee id, name, salary and dept_no to update employee");
		eId = sc.nextInt();
		eName = sc.next();
		salary = sc.nextInt();
		dept_no = sc.nextInt();
		Department Department = new Department();
		Department.setDept_no(dept_no);

		return new Employee(eId, eName, salary,Department);
	}
//
	public static int findEmployeeView() {
		System.out.println("Enter Employee Id :");
		return sc.nextInt();
	}

}
