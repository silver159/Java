package com.tjoeun.dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilEx
{
	// MySQL에 연결하는 Connection을 만들어 리턴하는 메소드
	public static Connection getMySQLConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 5.x 사용자, ClassNotFoundException
			String url = "jdbc:mysql://localhost:3306/javaam"; // mysql 5.x 사용자
			conn = DriverManager.getConnection(url, "root", "0000"); // SQLException
			System.out.println("연결성공: "+conn);
			
		} catch (ClassNotFoundException e)
		{
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e)
		{
			System.out.println("데이터베이스 접속 정보가 올바르지 않습니다.");
		}
		return conn;
	}
	
	// 데이터베이스 작업에 사용한 객체를 닫는 메소드
	public static void close(Connection conn)
	{
		if (conn !=null) {try{conn.close();} catch (SQLException e){e.printStackTrace();}}
	}
	public static void close(Statement stmt)
	{
		if (stmt !=null) {try{stmt.close();} catch (SQLException e){e.printStackTrace();}}
	}
	public static void close(PreparedStatement pstmt)
	{
		if (pstmt !=null) {try{pstmt.close();} catch (SQLException e){e.printStackTrace();}}
	}
	public static void close(ResultSet rs)
	{
		if (rs !=null) {try{rs.close();} catch (SQLException e){e.printStackTrace();}}
	}
	
	
}
