package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcExample5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		String sql = "select * from Gokul_Employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step 4
		
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsdata = rs.getMetaData();
		System.out.println(rsdata.getColumnCount());
		for(int i = 1 ; i <= rsdata.getColumnCount() ; i++)
		{
			System.out.println(rsdata.getColumnName(i));
		}
		while (rs.next())
		{
			System.out.println(rs.getInt("employee_id") + " " + rs.getString("employee_name") + " " + rs.getInt("salary") + " " + rs.getInt("dept_no"));
		}
		
		
		ps.close();
		con.close();

	}

}
