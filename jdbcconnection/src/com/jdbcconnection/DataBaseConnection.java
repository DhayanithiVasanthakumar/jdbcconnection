package com.jdbcconnection;

import java.sql.*;

public class DataBaseConnection {
	static final String url = "jdbc:mysql://localhost:3306/employees";
	static final String user = "root";
	static final String pass = "Dhaya004@";
	
	static Connection con=null;
	
	private DataBaseConnection() {
		
	}
//........................................
	public static Connection getDataBaseConnection() {
		try {
			if(con==null) {
				con=DriverManager.getConnection(url,user,pass);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
