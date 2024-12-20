package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;

public class EmployeeService {

	//EmployeeRepo employeeRepo = new EmployeeRepo();
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee object is null";
		} else if (employee.geteId() == 0 || employee.geteName() == null || employee.geteSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee object Saved";
			} else {
				result = "Employee object not Saved";
			}
		}
		return result;
	}
	
	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee object Deleted";
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
	
	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.geteId() == 0 || employee.geteName() == null || employee.geteSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee Object Updated ";
			} else {
				result = "Employee Object Not Found ";
			}
		}
		return result;
	}
	
	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
	
	
//	public String findAllValidation() {
//		
//		if(employeeRepo.isEmpty())
//		{
//			return "No employee present";
//		}
//		else {
//			return employeeRepo.doFindAll().toString();
//		}
//		
//	}
	public String findAllValidation()
	{
		return employeeRepo.doFindAll().toString();
	}

}
