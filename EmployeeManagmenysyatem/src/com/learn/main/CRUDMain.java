package com.learn.main;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.learn.bean.Employee;
import com.learn.dao.EmployeeDAO;
import com.learn.jdbc.dbutil.DBUtil;

public class CRUDMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println(DBUtil.dbConn());
		Scanner sc = new Scanner(System.in);
		
		

		int i;
		while (true) {
			System.out.println("Enter\n 1. For insert\n 2. For update\n 3. For delete \n 4. select \n 5.exit  \n 6. update pre \n 7. delete pre");
			i = sc.nextInt();
			EmployeeDAO dao = new EmployeeDAO();
			Employee e = new Employee();

			switch (i) {
			case 1:
				
				System.out.println("enter id");
				e.setEid(sc.nextInt());
				System.out.println("enter Emp name");
				e.setEname(sc.next());
				System.out.println("enter email");
				e.setEmpEmail(sc.next());
				System.out.println("enter salary");
				e.setSalary(sc.nextFloat());

				int r = dao.insert(e);

				if (r > 0) {
					System.out.println("insertion done");
				} else {
					System.out.println("insertion fail");
				}
				break;

			case 2:

				int ch;
				System.out.println("Enter id for which want to update data");

				ch = sc.nextInt();

				int e2 = dao.updateData(ch);

				if (e2 > 0) {
					System.out.println("update done");
				} else {
					System.out.println("update fail");
				}

				break;

			case 3:

				int ch1;
				System.out.println("Enter id for which want to delete data");

				ch1 = sc.nextInt();

				int e3 = dao.deleteData(ch1);
				System.out.println(e3);

				if (e3 > 0) {
					System.out.println("delete fail");
				} else {
					System.out.println("delete done");
				}

				break;

			case 4:
				System.out.println("fetch the detail..");

				List<Employee> emp = dao.selectData();

				for (Employee ee : emp) {

					System.out.println("emp id " + ee.getEid() + "  " + "emp name " + ee.getEname() + "emp email "
							+ ee.getEmpEmail() + "emp salary " + ee.getSalary());

				}
				break;
			case 5:

				System.exit(0);

				break;
				
			case 6:   
				
				int id;
				System.out.println("Enter id for which want to update data");

				id = sc.nextInt();
				
				e.setEname("Sakshi");
				e.setEid(id);

				int e5= dao.updateDataPre(e);

				if (e5> 0) {
					System.out.println("update done");
				} else {
					System.out.println("update fail");
				}

				
				break;
				
				
			case 7:
				
				int idd;
				System.out.println("Enter id for which want to delete data");

				idd = sc.nextInt();
				
				e.setEid(idd);
				
				
				int e6=dao.deleteDataPre(e);
				if (e6> 0) {
					System.out.println("delete done");
				} else {
					System.out.println("delete fail");
				}

				
				
				break;

			default:
				break;
			}

		}

	}

}
