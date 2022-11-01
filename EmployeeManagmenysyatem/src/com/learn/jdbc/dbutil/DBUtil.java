package com.learn.jdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*1.register the driver
2.connection with the dB→single responsibility principle -DbUtil-database utility
*/
public class DBUtil {
	
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/db8";
	public static final String User="root";
	public static final String Password="root";
   public static Connection dbConn() throws SQLException, ClassNotFoundException
   {
	   
	   Class.forName(DRIVER_CLASS);
	   Connection con=DriverManager.getConnection(DB_URL, User, Password);
	    return con;
	   
	   
   }
}
