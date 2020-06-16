package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.OracleConnection;
import com.dao.UserDao;
import com.vo.UserVO;

public class DBConnectionTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDao(new OracleConnection());
		UserVO uv = new UserVO();
//		uv.setId("kth");
//		uv.setName("taehun");
//		uv.setPw("1234");
//		try {
//			ud.add(uv);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			System.out.println("DBConnect");
			uv = ud.get("kth");
			
			System.out.println(uv.getPw());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}



}
