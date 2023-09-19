package com.tjoeun.networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2Ex
{
	public static void main(String[] args)
	{
		Socket socket = null;
		PrintWriter printWriter = null;
		
		Scanner scanner = null;
		Scanner scan = null;
		
		try
		{
			socket = new Socket("192.168.0.175", 10004);
			System.out.println("192.168.0.175 서버의 10004번 포트로 접속합니다.");
			System.out.println("접속 성공: "+socket);
			
			printWriter = new PrintWriter(socket.getOutputStream());
			scanner = new Scanner(socket.getInputStream());
			scan = new Scanner(System.in);
			
			System.out.println(scanner.nextLine());
			
			// 키보드로 입력한 메시지 또는 서버에서 전송받은 메시지가 "BYE"면 통신을 끝낸다.
			String msg = "";
			do {
				// 서버로 전송할 메시지를 입력받는다.
				System.out.print("client >>> ");
				msg = scan.nextLine().trim();
				// 입력받은 메시지를 서버로 전송한다.
				printWriter.write(msg + "\n");
				printWriter.flush();
				// 입력한 메시지가 "BYE"면 통신을 종료한다. => do ~ while을 탈출한다.
				if(msg.toUpperCase().equals("BYE")) {break;}
				//=======================================
				// 서버에서 전송받은 메시지를 출력한다.
				msg = scanner.nextLine().trim();
				System.out.println("server >>> "+msg);
				//서버에서 전송받은 메시지가 "BYE"면 통신을 종료한다. => do ~ while을 탈출한다.
			}while(!msg.toUpperCase().equals("BYE"));
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}finally {
			if (socket != null) {try{socket.close();} catch (IOException e){e.printStackTrace();}}
		}
	}
}
