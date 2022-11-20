package com.learn.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.learn.bean.Student;
import com.learn.dbutil.DBUtil;

public class StudentDao {

	public int insert(Student s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();

		if (con != null) {

			System.out.println("Connection with Db Done");

			String sql = "insert into student values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setDate(4, (Date) s.getDob());
			ps.setString(5, s.getAddres());

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
		String sql = "select * from student  order by name asc";

		PreparedStatement ps = con.prepareStatement(sql);
		// address of the table if it exists
		ResultSet rs = ps.executeQuery();
		ArrayList<Student> list = new ArrayList<>();
		while (rs.next()) {
			Student s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setDob(rs.getDate(4));
			s.setAddres(rs.getString(5));
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
		String sql = "UPDATE student " + "SET name = ? WHERE id=  ?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("id  " + s.getId());
		System.out.println("name  " + s.getName());

		ps.setInt(2, s.getId());
		ps.setString(1, s.getName());
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
		String sql = "delete from student where id=?";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("id  " + s.getId());
		ps.setInt(1, s.getId());

		int rows = ps.executeUpdate();

		return rows;

	}

}
