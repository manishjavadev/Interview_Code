//JDBC Connection
//This JDBC code creating connection using MYSQL database

package com.manish.javadev.mix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Manish Srivastava
 *
 */
public class OracleJDBCConnectionCode {

	static String drivername = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String username = "javadev";
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
			// table for this database called dev test in MYSQL database
			stmt = con.createStatement();
			stmt.execute("create table Employee(empNo int,empName varchar(35))");
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}