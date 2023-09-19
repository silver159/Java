package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMainEx
{
	static MemoListTest memoList = new MemoListTest(); 
	public static void main(String[] args)
	{
//		1.입력 2.목록보기 3.수정 4.삭제 5.종료
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while(menu !=5) {
		while(true) {
			System.out.println("=======================================");
			System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.종료");
			System.out.println("=======================================");
			System.out.print("원하는 메뉴를 입력하세요: ");
			menu = scanner.nextInt();
			if(menu>=1 && menu<=5) {break;}
			System.out.println("다시 입력해주세요");
		}
		switch(menu) {
		case 1:
			insert();
			break;
		case 2:
			System.out.println(memoList);
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		}
		
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static void update()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 메모의 번호를 입력하세요: ");
		int idx = scanner.nextInt();
		MemoVOTest original = memoList.selectMemo(idx);
		
		if(original == null) {
			System.out.println(idx+"번의 글이 존재하지 않습니다.");
		}
		else
		{
			System.out.println("수정할 글 확인");
			System.out.println(original);
			scanner.nextLine();
			System.out.print("비밀번호: ");
			String password = scanner.nextLine().trim();
			
			if(password.equals(original.getPassword()))
			{
				System.out.print("수정할 메모: ");
				String memo = scanner.nextLine().trim();
				memoList.updateMemo(idx, memo);
				System.out.println(idx+"번 수정 완료!!!");
			}
			else
			{
				System.out.println("잘못된 비밀번호입니다.");
			}
		}
		
		
		
	}

	private static void delete()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 메모의 번호를 입력하세요: ");
		int idx = scanner.nextInt();
		MemoVOTest original = memoList.selectMemo(idx);
		
		if(original == null) {
			System.out.println(idx+"번의 글이 존재하지 않습니다.");
		}
		else
		{
			System.out.println("삭제할 글 확인");
			System.out.println(original);
			scanner.nextLine();
			System.out.print("비밀번호: ");
			String password = scanner.nextLine().trim();
			
			if(password.equals(original.getPassword()))
			{
				memoList.deleteMemo(idx);
				System.out.println(idx+"번 삭제 완료!!!");
			}
			else
			{
				System.out.println("잘못된 비밀번호입니다.");
			}
		}
	}

	private static void insert()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.print("메모: ");
		String memo = scanner.nextLine().trim();
		
		MemoVOTest memo1 = new MemoVOTest(name, password, memo);
		memoList.addMemo(memo1);
		
	}
}
