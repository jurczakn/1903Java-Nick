package com.revature.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory sessFact = (SessionFactory) ac.getBean("mySessionFactory");
		Session sess = sessFact.getCurrentSession();
	}

}
