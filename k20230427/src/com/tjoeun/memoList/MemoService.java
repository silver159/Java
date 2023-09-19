package com.tjoeun.memoList;

import java.util.ArrayList;
import java.util.Scanner;

// 데이터를 테이블에 저장, 테이블에 저장된 데이터를 수정, 삭제 및 조회 작업을 실행하기
// 전에 필요한 전처리 작업을 실행하는 클래스, 비즈니스 로직을 작성하는 클래스
public class MemoService
{
	// 데이터를 입력받아 MemoDAO 클래스로 넘겨주는 메소드
	public static void insert()
	{
		// 전처리
		// 테이블에 저장할 데이터를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.print("메모: ");
		String memo = scanner.nextLine().trim();
		
		// 입력받은 데이터를 MemoVO 클래스 객체를 만들어 저장한다.
		MemoVO vo = new MemoVO();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMemo(memo);
		// System.out.println(vo);
		
		// 입력받은 데이터를 테이블에 저장하는 MemoDAO 클래스의 메소드를 호출한다.
		Boolean result =  MemoDAO.insert(vo);
		
		// 후처리
		if (result) {
			System.out.println(vo.getName()+ "님 글 저장완료");
		} else
		{
			System.out.println("저장실패");
		}
	}
 
	// 테이블에 저장된 메모 목록을 글번호(idx)의 내림차순(최신글순)으로 얻어오는
	// MemoDAO 클래스의 메소드를 호출하는 메소드
	public static void select()
	{
		// 테이블에 저장된 메모 목록을 얻어온다.
		ArrayList<MemoVO> list = MemoDAO.select(); 
		//System.out.println(list);
		
		// 얻어온 메모 목록을 콘솔에 출력한다.
		//System.out.println(list.size());
		if (list == null || list.size() == 0) 
		{
			System.out.println("저장된 글이 없습니다.");
		}else 
		{
			for (MemoVO vo : list)
			{
				System.out.println(vo);
			}
		}
	}
	
	// 삭제할 글번호를 입력받고 비밀번호를 확인한 후 글을 삭제하는 MemoDAO 클래스의 
	// 메소드를 호출한다.
	public static void delete()
	{
		// 삭제할 글번호를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 글번호를 입력하세요: ");
		int idx = scanner.nextInt();
		
		// 테이블에서 삭제할 글 1건을 얻어오는 MemoDAO 클래스의 메소드를 호출한다.
		MemoVO original = MemoDAO.selectByIdx(idx);
		// System.out.println(original);
		
		if(original != null)
		{
			// 삭제할 메모가 존재하는가?
			System.out.println("삭제할 메모 확인하기");
			System.out.println(original);
			
			// 메모를 삭제하기 위해 비밀번호를 입력한다.
			System.out.print("삭제할 글의 비밀번호를 입력하세요: ");
			scanner.nextLine(); // 키보드 버퍼를 비운다.
			String password = scanner.nextLine().trim();
			
			// 삭제할 글의 비밀번호와 삭제하기 위해 입력한 비밀번호(password)를 비교한다.
			if (password.equals(original.getPassword()))
			{
				// 비밀번호가 일치하면 MemoDAO 클래스의 메모를 삭제하는 메소드를 호출한다. 
				MemoDAO.delete(idx);
				System.out.println(idx + "번 글 삭제완료!!!");
			} else
			{
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else
		{
			System.out.println(idx+"번 메모는 존재하지 않는 메모입니다.");
		}
	}
	
	// 수정할 글번호를 입력받고 비밀번호를 확인한 후 글을 수정하는 MemoDAO 클래스의 
	// 메소드를 호출한다.
	public static void update()
	{
		// 수정할 글번호를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 글번호를 입력하세요: ");
		int idx = scanner.nextInt();
			
		// 테이블에서 수정할 글 1건을 얻어오는 MemoDAO 클래스의 메소드를 호출한다.
		MemoVO original = MemoDAO.selectByIdx(idx);
		// System.out.println(original);
				
		if(original != null)
		{
			// 수정할 메모가 존재하는가?
			System.out.println("수정할 메모 확인하기");
			System.out.println(original);
			
			// 메모를 수정하기 위해 비밀번호를 입력한다.
			System.out.print("수정할 글의 비밀번호를 입력하세요: ");
			scanner.nextLine(); // 키보드 버퍼를 비운다.
			String password = scanner.nextLine().trim();
		
			// 수정할 글의 비밀번호와 수정하기 위해 입력한 비밀번호(password)를 비교한다.
			if (password.equals(original.getPassword()))
			{
				// 수정할 이름, 메모를 입력받는다.
				System.out.print("수정할 이름을 내용을 입력하세요: ");
				String name = scanner.nextLine().trim();
				System.out.print("수정할 메모의 내용을 입력하세요: ");
				String memo = scanner.nextLine().trim();
				
				// 비밀번호가 일치하면 MemoDAO 클래스의 메모를 수정하는 메소드를 호출한다. 
				MemoDAO.update(idx, name, memo);
				System.out.println(idx + "번 글 수정완료!!!");
			} else
			{
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else
		{
			System.out.println(idx+"번 메모는 존재하지 않는 메모입니다.");
		}
	}
}













