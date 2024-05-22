package com.jdbcconnection;
import java.sql.*;

public class QueryClass {
	public static void main(String[]args) {
		Connection con=DataBaseConnection.getDataBaseConnection();
//...................................................................
//query
		try {
			String query="CREATE TABLE stu(roll_no INT,stu_name VARCHAR(50),stu_age INT)";
			Statement st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Table  created");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
//...................................................................
	}
}
