package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		String sql = "update Gokul_Employee set salary = 2000 where employee_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4
		ps.setInt(1, 4);
		
		int n = ps.executeUpdate();
		
		if(n == 1)
		{
			System.out.println("Record updated");
		}
		else
		{
			System.out.println("records not deleted");
		}
		ps.close();
		con.close();

	}

}
