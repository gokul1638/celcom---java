package com.ccm.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ccm.model.Cloud;
import com.ccm.model.Customer;
import com.ccm.util.DBUtil;

public class CustomerRepoImpl implements CustomerRepo {
	
	CloudRepo cloudRepo = new CloudRepoImpl();
	
	public boolean doInsertEmployee(Customer customer) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into cloud_customers values ( ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setLong(3, customer.getPhoneNumber());
		ps.setInt(4, customer.getCloud().getCloudId());
		
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
	
	public boolean doDeleteCustomer(int id) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete cloud_customers where customer_id = ?";
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
	
	public boolean doUpdateCustomer(Customer customer) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "update cloud_customers set customer_id = ?, customer_Name = ? , contact_phone = ?, cloud_id = ? where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setLong(3, customer.getPhoneNumber());
		ps.setInt(4, customer.getCloud().getCloudId());
		ps.setInt(5, customer.getCustomerId());
		
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
	public Customer doFindCustomer(int id) {
		Customer customer = null;
		
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from cloud_customers where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			customer = new Customer();
			customer.setCustomerId(rs.getInt("Customer_id"));
			customer.setCustomerName(rs.getString("customer_name"));
			customer.setPhoneNumber(rs.getInt("Contact_phone"));
			
			int cloudid = rs.getInt("cloud_id");
			Cloud cloud = cloudRepo.doFindCloud(cloudid);
			customer.setCloud(cloud);
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return customer;
		
	}
	public List<Customer> doFindAllCustomer() {
		List <Customer> list = new LinkedList <>();
		Customer customer = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from cloud_customers";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			customer = new Customer();
			customer.setCustomerId(rs.getInt("Customer_id"));
			customer.setCustomerName(rs.getString("Customer_Name"));
			customer.setPhoneNumber(rs.getInt("contact_phone"));
			
			int cloudid = rs.getInt("cloud_id");
			Cloud cloud = cloudRepo.doFindCloud(cloudid);
			customer.setCloud(cloud);
			
			list.add(customer);
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
