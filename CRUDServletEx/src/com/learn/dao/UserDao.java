package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.learn.bean.User;
import com.learn.dbutil.DBUtil;

public class UserDao {

	
	
	public int insert(User s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();

		if (con != null) {

			System.out.println("Connection with Db Done");

			String sql = "insert into user values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3,  s.getPass());
			ps.setLong(4, s.getMobileNo());
			
			int r = ps.executeUpdate();
			con.close();
			return r;

		}

		else {
			
			System.out.println("Connection with Db not Done");
			return 0;
		}

	}
	
	public ArrayList<User> getAllUser() throws SQLException, ClassNotFoundException {
		Connection con = DBUtil.dbConn();
		if (con != null) {
			System.out.println("connection with dB is established ");
		} else {
			System.out.println("connection failed ");
		}

		// Statement st=con.createStatement();
		String sql = "select * from user  order by name asc";

		PreparedStatement ps = con.prepareStatement(sql);
		// address of the table if it exists
		ResultSet rs = ps.executeQuery();
		ArrayList<User> list = new ArrayList<>();
		while (rs.next()) {
			User s = new User();
			
			s.setName(rs.getString(1));
			
			s.setEmail(rs.getString(2));
			
			s.setPass(rs.getString(3));
			s.setMobileNo(rs.getLong(4));
			list.add(s);
		}
		con.close();
		return list;
	}
	
	public int updateDataPre(User s) throws ClassNotFoundException, SQLException {

		Connection con = DBUtil.dbConn();
		if (con != null) {

			System.out.println("Connection with db done");

		} else {

			System.out.println("connection fail");
		}
		String sql = "UPDATE user " + "SET email = ? WHERE name=  ?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("id " + s.getName());
		System.out.println("email  " + s.getEmail());

		ps.setString(1, s.getEmail());
		ps.setString(2, s.getName());
	
		int rows = ps.executeUpdate();
		return rows;

	}
}
