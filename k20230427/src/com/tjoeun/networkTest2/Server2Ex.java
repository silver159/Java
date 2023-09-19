package com.tjoeun.networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2Ex
{
	public static void main(String[] args)
	{
		ServerSocket server = null;
		Socket socket = null;
		PrintWriter printWriter = null;
		
		Scanner scanner = null;
		Scanner scan = null;
		
		try
		{
			server = new ServerSocket(10004);
			System.out.println("서버 시작: "+server);
			System.out.println("클라이언트가 접속하기를 기다립니다.");
			socket = server.accept();
			
			printWriter = new PrintWriter(socket.getOutputStream());
			scanner = new Scanner(socket.getInputStream());
			scan = new Scanner(System.in);
			
			printWriter.write("어서와 클라이언트\n");
			printWriter.flush();
			
			String msg = "";
			do {
				// 서버에서 전송받은 메시지를 출력한다.
				msg = scanner.nextLine();
				System.out.println("client >>> "+ msg);
				// 클라이언트에서 전송받은 메시지가 "BYE"면 통신을 종료한다. => do ~ while 탈출
				if (msg.toUpperCase().equals("BYE")) {break;}
				//=================================================
				// 클라이언트로 전송할 메시지를 입력받는다.
				System.out.print("server >>> ");
				msg = scan.nextLine().trim();
				// 입력받은 메시지를 클라이언트로 전송한다.
				printWriter.write(msg+"\n");
				printWriter.flush();
				// 입력한 메시지가 "BYE"면 통신을 종료한다. => do ~ while을 탈출한다.
			}while(!msg.toUpperCase().equals("BYE"));
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally {
			if (socket != null) {try{socket.close();} catch (IOException e){e.printStackTrace();}}
			if (server != null) {try{server.close();} catch (IOException e){e.printStackTrace();}}
		}
		
		
		
		
		
	}
}
