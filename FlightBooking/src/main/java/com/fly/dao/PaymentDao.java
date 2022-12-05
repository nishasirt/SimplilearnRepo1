package com.fly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fly.pojo.BookedFlight;
import com.fly.pojo.Payment;
import com.fly.util.HibernetUtil;

public class PaymentDao {
	
	Session session;
	Transaction tr;

	public int insert(Payment p) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		int s = (int) session.save(p);

		tr.commit();
		session.clear();

		return s;
	}

}
