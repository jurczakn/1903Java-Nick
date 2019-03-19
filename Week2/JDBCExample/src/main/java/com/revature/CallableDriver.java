package com.revature;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.util.ConnectionFactory;

public class CallableDriver {
	
	public static void main(String[] args) {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "{call get_emps(?)}";
		try {
			conn.setAutoCommit(false);
			CallableStatement call =  conn.prepareCall(sql);
			call.setInt(1, 6);
			ResultSet rsInit = call.executeQuery();
			rsInit.next();
			ResultSet rs = (ResultSet) rsInit.getObject(1);
			while (((ResultSet)rs).next()){
				System.out.println("FName: " + ((ResultSet)rs).getString(2));
				System.out.println("LName: " + ((ResultSet)rs).getString(1));
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
