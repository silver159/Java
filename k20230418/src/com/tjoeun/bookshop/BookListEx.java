package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookListEx
{
//	1. 필드
	private ArrayList<BookVOEx> bookList = new ArrayList<>();
//	2. 생성자
//	생략가능
	
//	3. getters & setters
	public ArrayList<BookVOEx> getBookList()
	{
		return bookList;
	}

	public void setBookList(ArrayList<BookVOEx> bookList)
	{
		this.bookList = bookList;
	}
//	4. toString()

	@Override
	public String toString()
	{
		String str = "";
		str += "=====================================================================\n";
		str += "도서명 저자    출판사        출판일      가격\n";
		str += "=====================================================================\n";
		double sum = 0.0;
		for (BookVOEx vo : bookList) {
			str += vo + "\n";
			sum += vo.getPrice();
		}
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		str += "=====================================================================\n";
		str += "합계 금액: " + df.format(sum) +"\n";
		str += "=====================================================================\n";
		return str;
	}

	public void addBook(BookVOEx book)
	{
		bookList.add(book);
		
	}

	
}
