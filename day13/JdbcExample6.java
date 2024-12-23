 package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		String sql = "insert into Gokul_Employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4
		ps.setInt(1, 2);
		ps.setString(2, "mani");
		ps.setInt(3, 10000);
		ps.setInt(4, 20);
		ps.addBatch();
		
		ps.setInt(1, 1);
		ps.setString(2, "vijay");
		ps.setInt(3, 10000);
		ps.setInt(4, 20);
		ps.addBatch();
		
		ps.executeBatch();
		
		ps.close();
		con.close();

	}

}
