package com.learn.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.learn.bean.Employee;
import com.learn.jdbc.dbutil.DBUtil;

// CRUD operation

/*

Statement of SQL            -     CRUD
Execute the statement
Close the connection

 * */

public class EmployeeDAO {

	public int insert(Employee e) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}

		Statement st = con.createStatement();

		String sql = "insert into empolyee values(" + e.getEid() + ",'" + e.getEname() + "','" + e.getEmpEmail() + "',"
				+ e.getSalary() + ")";
		System.out.println(sql);
		// insert,update,delete--> return numric value (no if row)
		int row = st.executeUpdate(sql);

		return row;

	}

}