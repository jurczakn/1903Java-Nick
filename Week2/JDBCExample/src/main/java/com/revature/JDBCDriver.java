package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	

private static String username = "njurczak";
private static String password = "Revature";
private static String url = "jdbc:postgresql://nick-1903-java-db.cjteoptiiwyx.ca-central-1.rds.amazonaws.com:5432/nick_1903_java_db?";

public static void main(String[] args) {
	try {
		Connection conn = DriverManager.getConnection(url, username, password);
		/*String query = "create table user_table ("
				+ "user_id serial primary key,"
				+ "username text unique,"
				+ "password text"
				+ ")";*/
		String query = "insert into user_table (username, password) values('ahmed', 'ahmed123')";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Success!!!!!!");
	} catch (SQLException e) {
		System.out.println("Failure:[");
		e.printStackTrace();
	}
}	
	


}
