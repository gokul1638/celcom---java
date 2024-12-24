package com.EMS2.main;

import java.util.Scanner;

import com.EMS2.model.Department;
import com.EMS2.model.Employee;
import com.EMS2.service.DepartmentService;
import com.EMS2.service.EmployeeService;
import com.EMS2.view.DepartmentView;
import com.EMS2.view.EmployeeView;


public class EMSApp {
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
		int choice = sc.nextInt();
		return choice;
	}
	
	

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		DepartmentService departmentService = new DepartmentService();
		String result = "";
		Employee employee;
		Department department;
		int id,deptNo;
		
		String msg = "";
		do {
			int choice = menu();

			switch (choice) {
			case 1: {
				employee = EmployeeView.insertEmployeeView();
				result = employeeService.insertEmployeeValidation(employee);
				System.out.println(result);
				break;
			}
			case 2: {
				id = EmployeeView.deleteEmployeeView();
				result = employeeService.deleteEmployeeValidation(id);
				System.out.println(result);
				break;
			}
			case 3: {
				employee = EmployeeView.updateEmployeeView();
				result = employeeService.updateEmployeeValidation(employee);
				System.out.println(result);
				break;
			}
			case 4: {

				id = EmployeeView.findEmployeeView();
				result = employeeService.findEmployeeValidation(id);
				System.out.println(result);
				break;
			}
			case 5: {
				result = employeeService.findAllEmployeeValidation();
				System.out.println(result);
				break;
			}
			case 6: {
				department = DepartmentView.insertDepartmentView();
				result = departmentService.insertDepartmentValidation(department);
				System.out.println(result);
				break;
			}
			case 7: {
				deptNo = DepartmentView.deleteDepartmentView();
				result = departmentService.deleteDepartmentValidation(deptNo);
				System.out.println(result);
				break;
			}
			case 8: {
				department = DepartmentView.updateDepartmentView();
				result = departmentService.updateDepartmentValidation(department);
				System.out.println(result);
				break;
			}
			case 9: {
				deptNo = DepartmentView.findDepartmentView();
				result = departmentService.findDepartmentValidation(deptNo);
				System.out.println(result);
				break;
			}
			case 10: {
				result = departmentService.findAllDepartmentValidation();
				System.out.println(result);
				break;
			}
			case 11: {
				System.exit(0);
			}
			}

			System.out.println("Do you want to Continue [yes | no]:");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
