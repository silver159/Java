package com.tjoeun.dbTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.print("메모: ");
		String memo = scanner.nextLine().trim();
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		conn = DBUtil.getMySQLConnection();
		if(conn != null)
		{
			try
			{
				// mysql에 정상적으로 연결이 되었으므로 입력받은 데이터를 테이블에 저장한다
				
				// PreparedStatement를 사용해서 입력받은 데이터를 테이블에 저장한다.
				// sql 명령을 만든다.
				// 변수에 저장된 데이터가 대입될 자리에 "?"를 입력하고 나중에 "?"에 데이터를 대입
				// 문자열 데이터일 경우 Statement 처럼 작은다옴표를 사용할 필요가 없다.
				String sql ="insert into memo(name, password, memo) values (?,?,?)";
				// sql 명령을 임시로 실행한다.
				pstmt = conn.prepareStatement(sql);
				// "?" 데이터를 넣어준다. index는 1번부터, 입력순서는 상관없다.
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setString(3, password);
				// "?"가 채워진 sql 명령을 확정 실행한다. 인수 없이 실행한다.
				pstmt.executeUpdate();
				System.out.println("저장 완료");
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
}



















