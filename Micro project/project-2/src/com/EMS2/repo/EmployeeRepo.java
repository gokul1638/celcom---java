package com.EMS2.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.EMS2.model.Department;
import com.EMS2.model.Employee;
import com.EMS2.util.DBUtil;


public class EmployeeRepo {
	
	DepartmentRepo departmentRepo = new DepartmentRepo();
	int deptNo;
	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into Gokul_Employee values ( ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, employee.geteId());
		ps.setString(2, employee.getEName());
		ps.setInt(3, employee.getSalary());
		ps.setInt(4, employee.getDepartment().getDept_no());
		
		int n = ps.executeUpdate();
		if(n == 1)
		{
			flag = true;
		}
		
	}catch (SQLException e)
		{
		System.out.println("Insert query not Executed");
		}
		return flag;
	}

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete Gokul_Employee where Employee_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		
		int n = ps.executeUpdate();
		if(n == 1)
		{
			flag = true;
		}
		
	}catch (SQLException e)
		{
		System.out.println("delete query not Executed");
		}
		return flag;
		
	}
//
	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "update Gokul_Employee set employee_name = ? , employee_id = ?, salary = ?, dept_no = ? where employee_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(2, employee.geteId());
		ps.setString(1, employee.getEName());
		ps.setInt(3, employee.getSalary());
		ps.setInt(4, employee.getDepartment().getDept_no());
		ps.setInt(5, employee.geteId());
		
		int n = ps.executeUpdate();
		if(n == 1)
		{
			flag = true;
		}
		
	}catch (SQLException e)
		{
		System.out.println("Insert query not Executed");
		}
		return flag;
		
	}
//	
	public Employee doFindEmployee(int id) {
		Employee employee = null;
		
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from Gokul_Employee where employee_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			employee = new Employee();
			employee.seteId(rs.getInt("employee_id"));
			employee.setEName(rs.getString("employee_name"));
			employee.setSalary(rs.getInt("Salary"));
			
			deptNo = rs.getInt("dept_no");
			Department department = departmentRepo.doFindDepartment(deptNo);
			employee.setDepartment(department);
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return employee;
		
	}
	public List<Employee> doFindAllEmployee() {
		List <Employee> list = new LinkedList <>();
		Employee employee = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from Gokul_Employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			employee = new Employee();
			employee.seteId(rs.getInt("employee_id"));
			employee.setEName(rs.getString("employee_name"));
			employee.setSalary(rs.getInt("Salary"));
			
			deptNo = rs.getInt("dept_no");
			Department department = departmentRepo.doFindDepartment(deptNo);
			employee.setDepartment(department);
			
			list.add(employee);
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return list;
		
	}
	
//	public boolean isEmpty()
//	{
//		return DBUtil.getListIsEmpty();
//	}
}
