package com.manish.javadev.mix;

import java.sql.*;

/**
 * This code creating a connection for MySqlDatabase and creating a table
 * Employee Create table Employee(empNo int,empName varchar(35)) Note: But first
 * you create a database called "devtest" in your MYSQL databse
 * 
 * @author Manish Srivastava
 *
 */
public class MySQLJDBCConnectionCode {

	static String drivername = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost/devtest";
	static String username = "root";
	static String password = "manish";
	static Connection con;
	static Statement stmt;

	public static void main(String[] args) {
		try {
			Class.forName(drivername);
			// Driver manager is a class which calling static method
			// get connection which returning connection object
			con = DriverManager.getConnection(url, username, password);
			// And here i am creating statement object for creating
			// table for this database called devtest in MYSQL database
			stmt = con.createStatement();
			stmt.execute("create table Employee(empNo int,empName varchar(35))");
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
