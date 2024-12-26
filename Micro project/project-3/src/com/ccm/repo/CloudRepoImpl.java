package com.ccm.repo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


import com.ccm.model.Cloud;
import com.ccm.util.DBUtil;



public class CloudRepoImpl implements CloudRepo {
	public boolean doInsertCloud(Cloud cloud) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into cloud_services values ( ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, cloud.getCloudId());
		ps.setString(2, cloud.getCloudName());
		
		
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
	public boolean doDeleteCloud(int cloudId) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete cloud_services where cloud_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, cloudId);
		
		
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
////
	public boolean doUpdateCloud(Cloud cloud) {
		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "update cloud_services set cloud_id = ? , cloud_name = ? where cloud_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, cloud.getCloudId());
		ps.setString(2, cloud.getCloudName());
		ps.setInt(3, cloud.getCloudId());
		
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
	public Cloud doFindCloud(int cloudId) {
		Cloud cloud = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from cloud_services where Cloud_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, cloudId);
		
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			cloud = new Cloud();
			cloud.setCloudId(rs.getInt("cloud_id"));
			cloud.setCloudName(rs.getString("Cloud_Name"));
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return cloud;
	}
	public List<Cloud> doFindAllCloud() {
		List <Cloud> list = new LinkedList <>();
		Cloud cloud = null;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select  * from cloud_services";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			cloud = new Cloud();
			cloud.setCloudId(rs.getInt("Cloud_id"));
			cloud.setCloudName(rs.getString("Cloud_name"));
			
			
			list.add(cloud);
		}
		
	}catch (SQLException e)
		{
		System.out.println("Find query not Executed");
		}
		return list;
		
	}

}
