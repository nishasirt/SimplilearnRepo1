package com.fly.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fly.pojo.Airline;
import com.fly.pojo.Places;
import com.fly.util.HibernetUtil;

public class AirLineDao {
	
	
	
	
	Session session;
	Transaction tr;
	
	public int insert(Airline p) {
		
		SessionFactory sf=HibernetUtil.getSessionFactory();
		session=sf.openSession();
		tr=session.beginTransaction();
		
		int s=(int) session.save(p);
		
		tr.commit();
		session.clear();
		
		
		return s;
	}
	public List<Airline> getAirlines() {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		Query q = session.createQuery("from Airline");

		List<Airline> list = q.list();
		tr.commit();
		session.clear();

		return list;

	}


}
