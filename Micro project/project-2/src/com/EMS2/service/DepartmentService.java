package com.EMS2.service;

import com.EMS2.model.Department;
import com.EMS2.model.Employee;
import com.EMS2.repo.DepartmentRepo;
import com.EMS2.repo.EmployeeRepo;

public class DepartmentService {
	EmployeeRepo employeeRepo = new EmployeeRepo();
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Employee object is null";
		} else if (department.getDept_no() == 0 || department.getDept_name() == null || department.getLocation() == null) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Departmet object Saved";
			} else {
				result = "Department object not Saved";
			}
		}
		return result;
	}

	public String deleteDepartmentValidation(int deptNo) {
		String result = "";
		if (deptNo == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(deptNo);
			if (flag) {
				result = "Department object Deleted";
			} else {
				result = "Department object  Not Found";
			}
		}
		return result;
	}

//	
	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is Null";
		} else if (department.getDept_no() == 0 || department.getDept_name() == null || department.getLocation() == null) {
			result = "Invalid department Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Departent Object Updated ";
			} else {
				result = "Department Object Not Found ";
			}
		}
		return result;
	}

//	
	public String findDepartmentValidation(int deptNo) {
		String result = "";
		if (deptNo == 0) {
			result = "Invalid department Number";
		} else {
			Department department = departmentRepo.doFindDepartment(deptNo);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department object  Not Found";
			}
		}
		return result;
	}
//	
//	

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}
