package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.Arrays;

//	여러권의 책 정보(BookVO 클래스)를 기억하는 클래스
public class BookListEx
{
//	1. 필드 선언
	private BookVOEx[] bookList; //여러권의 책 정보를 기억할 배열을 선언만 한다. => null초기화
	private int size; // 배열의 크기
	private int index; // 배열의 인덱스, 배열에 저장된 데이터의 개수
	
//	2, 생성자 선언
	
	public BookListEx()
	{
		this(10);
	}

	public BookListEx(int size)
	{
		super();
		this.size = size;
		bookList = new BookVOEx[size];
	}

//	3. getters & setters 선언
	public BookVOEx[] getBookList()
	{
		return bookList;
	}

	public void setBookList(BookVOEx[] bookList)
	{
		this.bookList = bookList;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

//	4. toString() 메소드 Override
	@Override
	public String toString()
	{
		String str = "";
		str += "=====================================================================\n";
		str += "도서명 저자    출판사        출판일      가격\n";
		str += "=====================================================================\n";
		
		double sum = 0.0;
//		일반 for
//		for (int i=0; i<bookList.length;i++)
//		{
//			if(bookList[i] == null) {break;}
//			str += bookList[i] +"\n";
////			각각의 배열 요소에 저장된 BookVO 클래스 객체에서 price만 꺼내서 더해준다
//			sum += bookList[i].getPrice();
//		}
//		향상된 for
		for(BookVOEx vo : bookList) {
			if(vo == null) {break;}
			str += vo +"\n";
			sum += vo.getPrice();
		}
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		str += "=====================================================================\n";
		str += "합계 금액: " + df.format(sum) +"\n";
		str += "=====================================================================\n";
		return str;

	}

	public void addbook(BookVOEx book)
	{
//		자바의 예외(Exception)처리 => try ~ catch ~(finally) 안써도 됨
//		예외가 발생될 것으로 예상되는 문장을 try 블록에 코딩한다.
//		예외가 발생되면 처리할 문자를 catch 블록에 코딩한다.
//		try 블록의 문장들을 실행하다가 예외가 발생되면 더이상 try 블록의 문장을 실행하지 않고
//		해당 예외의 catch 블록의 문장을 실행한다.
//		예외 발생 여부와 상관없이 실행해야 할 문장이 있다면 finally 블록에 코딩한다.
		
		try {
			bookList[index++] = book; 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 가득차서 "+book.getAuthor()+" 도서 정보를 저장할 수 없습니다.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			
		}finally {
//			System.out.println("꺄~~");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
