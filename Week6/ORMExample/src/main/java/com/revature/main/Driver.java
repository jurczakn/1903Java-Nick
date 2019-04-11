package com.revature.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Driver {
	
	@Autowired
	SessionFactory sessFact;
	
	@Transactional
	public void testConn() {
		sessFact.getCurrentSession();
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Driver driver = ac.getBean(Driver.class);
		driver.testConn();
	}

}
