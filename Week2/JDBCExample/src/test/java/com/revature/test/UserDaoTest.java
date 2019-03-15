package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.bean.User;
import com.revature.dao.UserDaoImpl;


@RunWith(MockitoJUnitRunner.class)
public class UserDaoTest {

	@Mock
	private Connection conn;
	
	@Mock
	private Statement stmt;
	
	@Mock
	private ResultSet rs;
	
	private User user;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		assertNotNull("Failed to mock connection", conn);
		when(conn.createStatement()).thenReturn(stmt);
		when(stmt.executeUpdate(any(String.class))).thenReturn(1);
		user = new User(1, "nick", "1234");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdate() throws SQLException {
		new UserDaoImpl(conn).updateUser(user);
		verify(stmt).executeUpdate("update user_table set password = '" 
		+ user.getPassword() + "' where username = '" + user.getUsername() + "'");
	}

}
