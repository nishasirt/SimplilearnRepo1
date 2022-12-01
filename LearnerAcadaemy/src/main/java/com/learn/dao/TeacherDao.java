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

public class TeacherDao {
	
	Session session;
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction tran ;
	
	
	
	public String insert(Teacher cc) {
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
	public Teacher getTeacher(int id)
	{
		hibConn();
		Teacher c=session.get(Teacher.class, id);
		close();
		return c;
	}
	
	 public String updateTeacher(Teacher id) {
	     hibConn();
	     session.saveOrUpdate(id);
	     close();
	
	    return "data updated";
       }
		
		public String delete(int id) {
			hibConn();
			
			System.out.print("id"+id);
		   Teacher myObject = (Teacher)session.load(Teacher.class,id);
		    session.delete(myObject);

		    //This makes the pending delete to be done
		    session.flush() ;
		    close();
		    return  "deleted";
		}
	public	List<Teacher> getAllTeachers(){
		hibConn();
		Query q=session.createQuery("from Teacher");
		ArrayList<Teacher> arr=(ArrayList<Teacher>) q.list();
		close();
		return arr;
	}
    public String updateTeacher(Classes id) {
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
