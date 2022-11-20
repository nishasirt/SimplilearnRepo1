package com.learn.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.learn.bean.Student;
import com.learn.dbutil.DBUtil;

public class StudentDao {
	public int insert(Student s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();

		if (con != null) {

			System.out.println("Connection with Db Done");

			String sql = "insert into student values(default,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, s.getFname());
			ps.setString(2, s.getLname());
			ps.setString(3, s.getEmail());
			ps.setDate(4,  s.getDob());
			ps.setString(6, s.getMobileNo());
			ps.setString(5, s.getPass());

			int r = ps.executeUpdate();
			con.close();
			return r;

		}

		else {
			
			System.out.println("Connection with Db not Done");
			return 0;
		}

	}
	
	public ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.dbConn();
		if (con != null) {
			System.out.println("connection with dB is established ");
		} else {
			System.out.println("connection failed ");
		}

		// Statement st=con.createStatement();
		String sql = "select * from student  order by sid asc";

		PreparedStatement ps = con.prepareStatement(sql);
		// address of the table if it exists
		ResultSet rs = ps.executeQuery();
		ArrayList<Student> list = new ArrayList<>();
		while (rs.next()) {
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setFname(rs.getString(2));
			s.setLname(rs.getString(3));
			s.setEmail(rs.getString(4));
			s.setDob(rs.getDate(5));
			s.setPass(rs.getString(6));
			s.setMobileNo(rs.getString(7));
			list.add(s);
		}
		con.close();
		return list;
	}
	
	public int updateDataPre(Student s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "UPDATE student " + "SET email = ? WHERE sid=  ?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("id " + s.getId());
		System.out.println("email  " + s.getEmail());

		ps.setString(1, s.getEmail());
		ps.setInt(2, s.getId());
	
		int rows = ps.executeUpdate();
		return rows;

	}
	public int deleteDataPre(Student s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "delete from student where sid=?";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("id  " + s.getId());
		ps.setInt(1, s.getId());

		int rows = ps.executeUpdate();

		return rows;

	}
	
	public int deleteDataMobile(Student s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "delete from student where mobileNo=?";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("id  " + s.getMobileNo());
		ps.setString(1, s.getMobileNo());

		int rows = ps.executeUpdate();

		return rows;

	}
}
