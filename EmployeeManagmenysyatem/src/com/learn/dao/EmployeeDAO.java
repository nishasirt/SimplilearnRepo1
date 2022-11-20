package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.learn.bean.Employee;
import com.learn.jdbc.dbutil.DBUtil;
import com.mysql.cj.xdevapi.PreparableStatement;

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
	
	public int insertPrepared(Employee e) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
         
		
		String sql="insert into employee values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,e.getEid());
		ps.setString(2,e.getEname());
		ps.setString(3,e.getEmpEmail());
		ps.setFloat(4, e.getSalary());
		int rows=ps.executeUpdate();
		return rows;


		
	

	}

	public java.util.List<Employee> selectData() throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}

		Statement st = con.createStatement();
		String sql = "select * from empolyee";
		ResultSet rs = st.executeQuery(sql);
		List<Employee> list = new ArrayList<Employee>();
		while (rs.next()) {

			Employee emp = new Employee();
			emp.setEid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setEmpEmail(rs.getString(3));
			emp.setSalary(rs.getFloat(4));

			list.add(emp);
		}
		
	/*	=>ResultSetMetaData
				To describe the table column.*/

				ResultSetMetaData rsm=rs.getMetaData();
						System.out.println("the no of columns"+rsm.getColumnCount());
						System.out.println("the 2st col name "+rsm.getColumnName(2)+"  "+"col type"+rsm.getColumnTypeName(2));

		return list;
	}

	public int deleteData(int id) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}

		Statement st = con.createStatement();
		String sql = "delete from empolyee where  eid=  "+ id  ;
		st.executeUpdate(sql);
		int r = st.executeUpdate(sql);
		
		//System.out.println(r);
		return r;

	}

	public int updateData(int id) throws ClassNotFoundException, SQLException {

		Employee e = new Employee();

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		Statement st = con.createStatement();
		String sql = "UPDATE empolyee " + "SET ename = 'Jay' WHERE eid= " + id ;
		st.executeUpdate(sql);
		int r = st.executeUpdate(sql);

		return r;

	}
	public int updateDataPre(Employee e) throws ClassNotFoundException, SQLException {

		

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "UPDATE empolyee " + "SET ename = ? WHERE eid=  ?" ;
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("id  "+e.getEid());
		System.out.println("name  "+e.getEname());
		
		ps.setInt(2,e.getEid());
		ps.setString(1,e.getEname());
		int rows=ps.executeUpdate();
		return rows;
		
		

		

	}
	public int deleteDataPre(Employee e) throws ClassNotFoundException, SQLException {

		

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "delete from empolyee where eid=?" ;
		PreparedStatement ps=con.prepareStatement(sql);
		
		System.out.println("id  "+e.getEid());
		ps.setInt(1,e.getEid());
		
		int rows=ps.executeUpdate();
		
		
		return rows;
		
		

		

	}
}
