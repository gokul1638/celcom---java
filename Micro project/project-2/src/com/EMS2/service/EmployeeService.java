package com.EMS2.service;

import com.EMS2.model.Employee;
import com.EMS2.repo.EmployeeRepo;

public class EmployeeService {

	EmployeeRepo employeeRepo = new EmployeeRepo();
	

	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee object is null";
		} else if (employee.geteId() == 0 || employee.getEName() == null || employee.getSalary() == 0 || employee.getDepartment().getDept_no() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
			if (flag) {
				result = "Employee object Saved";
			} else {
				result = "Employee object not Saved";
			}
		}
		return result;
	}
	
	public String deleteEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
			if (flag) {
				result = "Employee object Deleted";
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
//	
	public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.geteId() == 0 || employee.getEName() == null || employee.getSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);
			if (flag) {
				result = "Employee Object Updated ";
			} else {
				result = "Employee Object Not Found ";
			}
		}
		return result;
	}
//	
	public String findEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee object  Not Found";
			}
		}
		return result;
	}
//	
//	
	
	public String findAllEmployeeValidation()
	{
		return employeeRepo.doFindAllEmployee().toString();
	}

}
