package com.EMS2.view;

import java.util.Scanner;

import com.EMS2.model.Department;
import com.EMS2.model.Employee;

public class DepartmentView {
	
	static Scanner sc = new Scanner(System.in);
	
	static int deptNo;
	static String deptName,location;
	
	public static Department insertDepartmentView() {
		System.out.println("Enter department no, department name and location");
		deptNo = sc.nextInt();
		deptName = sc.next();
		location = sc.next();
		

		return new Department(deptNo, deptName, location);

	}
	public static int deleteDepartmentView() {
		System.out.println("Enter Department number:");
		return sc.nextInt();
	}

	public static Department updateDepartmentView() {
		System.out.println("Enter Department number,Department Name and Location to update Department");
		deptNo = sc.nextInt();
		deptName = sc.next();
		location = sc.next();

		return new Department(deptNo, deptName, location);
	}
////
	public static int findDepartmentView() {
		System.out.println("Enter Department number :");
		return sc.nextInt();
	}

}
