package com.revature;

import java.util.Scanner;

import com.revature.bean.UserDaoImpl;
import com.revature.dao.UserDao;
import com.revature.util.ConnectionFactory;

public class JDBCDriver {
	

/*private static String username = "";
private static String password = "";
private static String url = "";*/
private static UserDao userDao = new UserDaoImpl(ConnectionFactory.getConnection());

public static void main(String[] args) {
	System.out.println("What user do you want to get?");
	Scanner sc = new Scanner(System.in);
	System.out.println(userDao.getUserById(sc.nextInt()));
	/*try {
		Connection conn = ConnectionFactory.getConnection();//DriverManager.getConnection(url, username, password);
		String query = "create table user_table ("
				+ "user_id serial primary key,"
				+ "username text unique,"
				+ "password text"
				+ ")";
		//String query = "insert into user_table (username, password) values('Damani', 'damani123')";
		String query = "select * from user_table";
		Statement stmt = conn.createStatement();
		//stmt.executeUpdate(query);
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()){
			System.out.println("User: " + rs.getInt(1) + "- username: " + rs.getString(2) + " password: " + rs.getString(3));
		}
		
		System.out.println("Success!!!!!!");
	} catch (SQLException e) {
		System.out.println("Failure:[");
		e.printStackTrace();
	}*/
}	
	


}
