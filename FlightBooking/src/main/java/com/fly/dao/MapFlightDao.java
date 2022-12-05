package com.fly.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fly.pojo.Airline;
import com.fly.pojo.MapFligts;
import com.fly.pojo.Places;
import com.fly.util.HibernetUtil;


public class MapFlightDao {
	
	
	Session session;
	Transaction tr;

	public int insert(MapFligts p) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		int s = (int) session.save(p);

		tr.commit();
		session.clear();

		return s;
	}
	public List<MapFligts> getFlights() {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		Query q = session.createQuery("from MapFligts");

		List<MapFligts> list = q.list();
		tr.commit();
		session.clear();

		return list;

	}
	
	public MapFligts getFlight(int fid) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

	

		MapFligts c=session.get(MapFligts.class, fid);
		tr.commit();
		session.clear();

		return c;

	}
	public List<MapFligts> getFlightss(MapFligts fligts) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		Query q = session.createQuery("from MapFligts where source= :src and destination= :destination");
		q.setString("src", fligts.getSource());
		q.setString("destination", fligts.getDestination());
		List<MapFligts> list=q.list();

		
		tr.commit();
		session.clear();

		return list;

	}
}
