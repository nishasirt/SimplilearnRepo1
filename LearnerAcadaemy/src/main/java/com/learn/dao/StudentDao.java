package com.learn.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.learn.bean.Classes;
import com.learn.bean.ReportSubjectNTeacher;
import com.learn.bean.Student;
import com.learn.bean.Subject;

public class StudentDao {

	Session session;
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction tran;

	public String insert(Student cc) {
		hibConn();

		int r = (int) session.save(cc);

		if (r > 0) {
			close();
			return "data inserted";
		} else {
			close();
			return "data not inserted";
		}

	}
	/*
	 * public List<Object[]> getAllStudent(int id){ hibConn();
	 * 
	 * Query q=session.createQuery("from Classes c,Student s where c.id="+id);
	 * List<Object[]> list= q.list();
	 * 
	 * close(); return list;
	 * 
	 * }
	 */

	public List<Student> getAllStudent() {
		hibConn();

		Query q = session.createQuery("from Student");
		List<Student> list = q.list();

		close();
		return list;

	}

	public String delete(int id) {
		hibConn();

		System.out.print("id" + id);
		Student myObject = (Student) session.load(Student.class, id);
		session.delete(myObject);

		// This makes the pending delete to be done
		session.flush();
		close();
		return "deleted";
	}

	
	 
	  public List<Student> getAllData(int id)
	  {
		  hibConn(); 
	  Query q=session.createQuery("from Student s where s.classes.id="+id); 
	  List<Student>arr=q.list();
	
	 close(); 
	 return arr; 
	 }
	 
	public void hibConn() {

		ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		// Meta data in the config file should be executed
		md = new MetadataSources(ssr).getMetadataBuilder().build();
		// read session factory in the xml
		sf = md.getSessionFactoryBuilder().build();
		// to perform crud operation we need to define an object
		session = sf.openSession();
		// used to save the crud operation result on the table
		tran = session.beginTransaction();

	}

	public void close() {
		tran.commit();
		session.close();
		sf.close();
	}

}
