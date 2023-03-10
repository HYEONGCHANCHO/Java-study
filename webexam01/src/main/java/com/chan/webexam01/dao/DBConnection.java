package com.chan.webexam01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection(String driver, String url, String userName, String pwd) {
		Connection con = null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
