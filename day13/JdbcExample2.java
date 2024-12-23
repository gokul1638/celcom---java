package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		String sql = "delete Gokul_Employee where employee_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4
		ps.setInt(1, 1);
		
		int n = ps.executeUpdate();
		
		if(n == 1)
		{
			System.out.println("Record deleted");
		}
		else
		{
			System.out.println("records not deleted");
		}
		ps.close();
		con.close();

	}

}
