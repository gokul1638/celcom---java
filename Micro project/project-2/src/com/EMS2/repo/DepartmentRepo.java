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

public class DepartmentRepo {
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into Gokul_department values ( ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, department.getDept_no());
		ps.setString(2, department.getDept_name());
		ps.setString(3, department.getLocation());
		
		
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

	public boolean doDeleteDepartment(int deptNo) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete Gokul_department where dept_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, deptNo);
		
		
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
	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "update Gokul_department set dept_no = ? , dept_name = ?, location = ? where dept_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, department.getDept_no());
		ps.setString(2, department.getDept_name());
		ps.setString(3, department.getLocation());
		ps.setInt(4, department.getDept_no());
		
		int n = ps.executeUpdate();
		if(n == 1)
		{
			flag = true;
		}
		
	}catch (SQLException e)
		{
		System.out.println("update query not Executed");
		}
		return flag;
		
	}
//	
	public Department doFindDepartment(int deptNo) {
		Department department = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from Gokul_department where dept_No = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, deptNo);
		
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			department = new Department();
			department.setDept_no(rs.getInt("dept_no"));
			department.setDept_name(rs.getString("dept_name"));
			department.setLocation(rs.getString("location"));
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return department;
		
	}
	public List<Department> doFindAllDepartment() {
		List <Department> list = new LinkedList <>();
		Department department = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from Gokul_department";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			department = new Department();
			department.setDept_no(rs.getInt("dept_no"));
			department.setDept_name(rs.getString("dept_name"));
			department.setLocation(rs.getString("location"));
			
			list.add(department);
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
