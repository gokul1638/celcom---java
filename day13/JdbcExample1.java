package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		String sql = "insert into Gokul_Employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4
		ps.setInt(1, 4);
		ps.setString(2, "mani");
		ps.setInt(3, 10000);
		ps.setInt(4, 20);
		int n = ps.executeUpdate();
		
		if(n == 1)
		{
			System.out.println("Record inserted");
		}
		else
		{
			System.out.println("records not inserted");
		}
		ps.close();
		con.close();
	}

}
                 