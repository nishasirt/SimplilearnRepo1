package com.learn.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/db9";
	public static final String User="root";
	public static final String Password="root";
   public static Connection dbConn() throws SQLException, ClassNotFoundException
   {
	   
	   Class.forName(DRIVER_CLASS);
	   Connection con=DriverManager.getConnection(DB_URL, User, Password);
	    return con;
	   
	   
   }
}
