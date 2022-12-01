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

public class ClassesDao {
	Session session;
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction tran ;

	public String insert(Classes cc) {
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
	
	public Classes getClasse(int id)
	{
		hibConn();
		Classes c=session.get(Classes.class, id);
		close();
		return c;
	}
	
	public String delete(int id) {
		hibConn();
		
		System.out.print("id"+id);
	   Classes myObject = (Classes)session.load(Classes.class,id);
	    session.delete(myObject);

	    //This makes the pending delete to be done
	    session.flush() ;
	    close();
	    return  "deleted";
	}
	
	
public	List<Classes> getAllClasses(){
		hibConn();
		Query q=session.createQuery("from Classes");
		ArrayList<Classes> arr=(ArrayList<Classes>) q.list();
		close();
		return arr;
	}

      public String updateClass(Classes id) {
	     hibConn();
	     session.saveOrUpdate(id);
	     close();
	
	    return "data updated";
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
