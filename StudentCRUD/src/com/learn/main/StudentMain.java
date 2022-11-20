package com.learn.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.learn.bean.Student;
import com.learn.dao.StudentDao;
import com.learn.dbutil.DBUtil;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println(DBUtil.dbConn());
		StudentDao dao = new StudentDao();
		Student student = new Student();

		int i;
		while (true) {
			System.out.println("Enter\n 1. For insert\n 2. For update\n 3. For delete \n 4. select \n 5.exit  ");
			i = sc.nextInt();

			switch (i) {
			case 1:

				System.out.println("enter id");
				student.setId(sc.nextInt());
				System.out.println("enter Emp name");
				student.setName(sc.next());
				System.out.println("enter email");
				student.setEmail(sc.next());
				System.out.println("enter dob");
				String sdob = sc.next();
				Date date1 = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(sdob);

				java.sql.Date dob = new java.sql.Date(date1.getTime());

				student.setDob(dob);
				System.out.println("enter Address");
				student.setAddres(sc.next());

				int row = dao.insert(student);

				if (row > 0) {
					System.out.println("inserted data");
				} else {
					System.out.println("insertion fail");
				}

				break;

			case 2:

				int id;
				System.out.println("Enter id for which want to update data");

				id = sc.nextInt();

				student.setName("Nagam");
				;
				student.setId(id);

				int e5 = dao.updateDataPre(student);

				if (e5 > 0) {
					System.out.println("update done");
				} else {
					System.out.println("update fail");
				}

				break;

			case 3:

				int idd;
				System.out.println("Enter id for which want to delete data");

				idd = sc.nextInt();

				student.setId(idd);

				int e6 = dao.deleteDataPre(student);
				if (e6 > 0) {
					System.out.println("delete done");
				} else {
					System.out.println("delete fail");
				}

				break;

			case 4:

				ArrayList<Student> arr = dao.getAllStudent();

				for (Student s : arr) {

					System.out.println("Student id " + s.getId() + "  " + " Student name " + s.getName()
							+ " Student email " + s.getEmail() + " Student DOB " + s.getDob() + " Student Address "
							+ s.getAddres());
				}

				break;
				
			case 5:
				System.exit(0);
				
				
				break;

			default:
				break;
			}

		}

	}

}
