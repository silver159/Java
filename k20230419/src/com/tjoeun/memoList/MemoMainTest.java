package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMainTest
{
	public static void main(String[] args)
	{
//		MemoVO memo1 = new MemoVO("홍길동","1111","1등 입니다");
//		System.out.println(memo1);
//		MemoVO memo2 = new MemoVO("임꺽정","2222","2등 입니다");
//		System.out.println(memo2);
//		MemoVO memo3 = new MemoVO("장길산","3333","3등 입니다");
//		System.out.println(memo3);
		
//		1.입력 2.목록보기 3.수정 4.삭제 5.종료
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (menu !=5) {
			while(true)
			{
				System.out.println("=======================================");
				System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.종료");
				System.out.println("=======================================");
				System.out.print("원하는 메뉴를 입력하세요: ");
				menu =  scanner.nextInt();
				if(menu >=1 && menu <=5) {break;}
				System.out.println("메뉴는 1~5 사이에 입력해야 합니다..");
			}
//		여기까지 왔다면 menu에는 1~5 사이의 정수가 입력되었다는 의미이다.	
			switch(menu) 
			{
			case 1:
				insert(); //데이터를 저장하는 메소드를 실행한다.
				break;
			case 2:
//				데이터를 목록을 출력하는 메소드를 실행한다.
				break;
			case 3:
//				데이터를 수정하는 메소드를 실행한다.
				break;
			case 4:
//				데이터를 삭제하는 메소드를 실행한다.
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
//	키보드로 이름, 비밀번호, 메모를 입력받아 MemoVO 클래스 객체에 저장하고 ArrayLsit에 저장하는
//	메소드를 호출하는 메소드
	private static void insert()
	{
		Scanner scanner = new Scanner(System.in);
		String name ="";
		String password;
		String memo = "";
		scanner.nextLine(); // scanner.nextInt(); 엔터키가 남아있어 지워야 한다.
		System.out.print("이름을 입력하세요: ");
		name = scanner.nextLine();
		System.out.print("패스워드를 입력하세요: ");
		password = scanner.nextLine();
		System.out.print("메모를 입력하세요: ");
		memo = scanner.nextLine();
		MemoListTest memoList = new MemoListTest();
		MemoVOTest memo1 = new MemoVOTest(name, password, memo);
		
	}
}
