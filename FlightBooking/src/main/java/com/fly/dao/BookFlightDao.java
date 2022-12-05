package com.fly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fly.pojo.BookedFlight;
import com.fly.pojo.MapFligts;
import com.fly.pojo.Places;
import com.fly.util.HibernetUtil;

public class BookFlightDao {
	
	
	Session session;
	Transaction tr;

	public int insert(BookedFlight p) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

	    session.save(p);

		tr.commit();
		session.clear();

		return 0;
	}

	
	public BookedFlight getFlight(String pnr) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

	

		BookedFlight c=session.get(BookedFlight.class, pnr);
		tr.commit();
		session.clear();

		return c;

	}
}
