package com.revature.daos;

import java.util.HashSet;
import java.util.Set;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Bear;
import com.revature.utils.SessionFactoryUtil;

public class BearDaoImpl implements BearDao {

	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private Logger log = LogManager.getRootLogger();
	
	
	@Override
	public Bear save(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear update(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear delete(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear findById(int id) {
		Bear b = null;
		Session session = sf.openSession();
		
		b = (Bear) session.get(Bear.class, id);
		//log.info(b);
		//System.out.println(b);
		session.close();
		return b;
	}

	@Override
	public Set<Bear> findByColor(String color) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(Bear.class);
		c.add(Restrictions.ilike("color", color));
		c.add(Restrictions.isNotNull("cave"));
		
		Set<Bear> bears = new HashSet<>(c.list()); // c.list will execute criteria
		System.out.println(bears);
		t.commit();
		session.close();
		
		return bears;
	}

	@Override
	public Set<Bear> findByCaveId(int caveId) {
		// TODO Auto-generated method stub
		Set<Bear> bs = null;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("FROM Bear WHERE cave.caveId =:caveIdParam");
		q.setInteger("caveIdParam", caveId);

		bs = new HashSet<Bear>(q.list());
		System.out.println(bs);
		t.commit();
		s.close();
		

		return bs;
	}

	public BearDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
