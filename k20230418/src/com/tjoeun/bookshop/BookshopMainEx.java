package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMainEx
{
	public static void main(String[] args)
	{
		BookVOEx book1 = new BookVOEx("java", "홍길동", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book2 = new BookVOEx("java", "홍길자", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book3 = new BookVOEx("java", "홍길숙", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book4 = new BookVOEx("java", "홍길희", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book5 = new BookVOEx("java", "홍길영", "더조은출판사", new Date(2020,5,13), 35000);
		BookVOEx book6 = new BookVOEx("java", "홍길자", "더조은출판사", new Date(2020,5,13), 35000);
		
		BookListEx bookList = new BookListEx();
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6); 
		
		System.out.println(bookList);
	}
}
