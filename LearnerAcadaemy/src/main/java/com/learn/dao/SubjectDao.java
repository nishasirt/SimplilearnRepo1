package com.learn.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.learn.bean.Classes;
import com.learn.bean.Subject;
import com.learn.bean.Teacher;

public class SubjectDao {
	Session session;
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction tran ;
	
	
	
	public String insert(Subject cc) {
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
	public Subject getSubject(int id)
	{
	      hibConn();	
		Subject s=session.get(Subject.class, id);
		 close();
		return s;
		
	}
	public	List<Subject> getAllSubject(){
		hibConn();
		Query q=session.createQuery("from Subject");
		ArrayList<Subject> arr=(ArrayList<Subject>) q.list();
		close();
		return arr;
	}
	
	 public String updateSubject(Subject id) {
	     hibConn();
	     session.saveOrUpdate(id);
	     close();
	
	    return "data updated";
       }
		
		public String deleteSubject(int id) {
			hibConn();
			
			System.out.print("id"+id);
			Subject myObject = (Subject)session.load(Subject.class,id);
		    session.delete(myObject);

		    //This makes the pending delete to be done
		    session.flush() ;
		    close();
		    return  "deleted";
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
