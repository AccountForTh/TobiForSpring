package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		String user = "HR";
		String pw = "credit";
		String connURL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement ps;
		try {
			//1. driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. connetion 얻기
			conn = DriverManager.getConnection(connURL, user, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
