package com.learn.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.learn.bean.Employee;
import com.learn.dao.EmployeeDAO;
import com.learn.jdbc.dbutil.DBUtil;

public class CRUDMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println(DBUtil.dbConn());
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		System.out.println("enter id");
		e.setEid(sc.nextInt());
		System.out.println("enter Emp name");
		e.setEname(sc.next());
		System.out.println("enter email");
		e.setEmpEmail(sc.next());
		System.out.println("enter salary");
		e.setSalary(sc.nextFloat());
		
		
		EmployeeDAO dao=new EmployeeDAO();
		int r=dao.insert(e);
		
		if(r>0)
		{
			System.out.println("insertion done");
		}
		else{
			System.out.println("insertion fail");
		}
	}

}
