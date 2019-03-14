package com.revature.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private Connection conn;

	@Override
	public void createUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(Integer id) {
		User ret = null;
		String sql = "select * from user_table where user_id =" + id;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				ret = new User();
				ret.setId(rs.getInt(1));
				ret.setUsername(rs.getString("username"));
				ret.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

}
