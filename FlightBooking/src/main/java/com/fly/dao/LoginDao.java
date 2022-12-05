package com.fly.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fly.pojo.Admin;
import com.fly.util.HibernetUtil;

public class LoginDao {

	Session session;
	Transaction tr;

	public String getPass(String username) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();
		System.out.println("pass" + username);

		Query q = session.createQuery("select a.password from Admin a where a.username= :username");
		q.setString("username", username);
		String psd = (String) q.uniqueResult();
		System.out.println("pass" + psd);

		tr.commit();
		session.close();

		return psd;

	}

	public int setPass(Admin ad) {

		SessionFactory sf = HibernetUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();

		Query q = session.createQuery("update Admin set password= :pass where username= :name");
		q.setString("pass", ad.getPassword());
		q.setString("name", ad.getUsername());
		int s = q.executeUpdate();

		tr.commit();
		session.close();

		return s;

	}

}
