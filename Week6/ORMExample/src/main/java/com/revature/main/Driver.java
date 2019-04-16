/*
 * package com.revature.main;
 * 
 * import org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext; import
 * org.springframework.stereotype.Component; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.revature.daos.CaveDao; import com.revature.daos.CaveDaoImpl;
 * import com.revature.domains.Cave;
 * 
 * @Component public class Driver {
 * 
 * @Autowired SessionFactory sessFact;
 * 
 * @Transactional public void testConn() { sessFact.getCurrentSession(); }
 * 
 * public static void main(String[] args) { ApplicationContext ac = new
 * ClassPathXmlApplicationContext("beans.xml"); Driver driver =
 * ac.getBean(Driver.class); //driver.testConn();
 * 
 * CaveDao caveDao = (CaveDao) ac.getBean("caveDaoImpl");
 * 
 * 
 * 
 * caveDao.createCave(new Cave(1, "new cave", 500.0)); caveDao.createCave(new
 * Cave(2, "old cave", 1500.0));
 * 
 * 
 * System.out.println(caveDao.readAllCaves());
 * 
 * }
 * 
 * }
 */