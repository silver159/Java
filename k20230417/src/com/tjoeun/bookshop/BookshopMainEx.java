package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMainEx
{
	public static void main(String[] args)
	{
//		클래스이름 객체(변수)이름 = new 생성자();
//		BookVOEx vo = new BookVOEx();
//		System.out.println(vo.getTitle());
//		System.out.println(vo);
//		클래스로 만든 객체를 출력하면 "자동으로" toString() 메소드가 실행된다.
//		System.out.println(vo.toSting());
		
//		도서 정보를 만든다.
//		출판일은 날짜 데잍터를 만들어서 BookVO 클래스의 writeDate 필드에 넣어주면 다른곳에서 
//		사용할 일이 없다. 이럴 경우 익명으로 만들어 사용하면 편리하다.
		BookVOEx book1 = new BookVOEx("java", "홍길동", "더조은출판사", new Date(2020,5,13), 35000);
		System.out.println("book1: "+book1);
		
//		private 권한으로 선언되 필드에 전근하기 위해서 getters & setters 메소드를 만들어 사용한다.
//		System.out.println(book1.getTitle());
//		book1.setTitle("spring");
//		System.out.println(book1);
		
		BookVOEx book2 = new BookVOEx("java", "홍길자", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book3 = new BookVOEx("java", "홍길숙", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book4 = new BookVOEx("java", "홍길희", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book5 = new BookVOEx("java", "홍길영", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book6 = new BookVOEx("java", "홍길자", "더조은출판사", new Date(2020,5,13), 35000);
		
		BookListEx bookList = new BookListEx(5);
		
//		도서 정보를 BookList 클래스의 bookList 배열에 저장하는 메소드를 실행한다.
		bookList.addbook(book1);
		bookList.addbook(book2);
		bookList.addbook(book3);
//		bookList.addbook(book4);
//		bookList.addbook(book5);
//		bookList.addbook(book6);
		
		System.out.println(bookList);
	}
}

























