package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class BookListT {

//	도서 정보를 기억할 ArrayList를 만든다.
	private ArrayList<BookVO> bookList = new ArrayList<>();
	
//	생성자를 선언하지 않았으므로 자바 컴파일러가 아무런 일도 하지않는 기본 생성자를 만들어 준다.
//	public BookList() {
//		
//	}
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "======================================================\n";
		str += " 도서명 저자 출판사 출판일 가격\n";
		str += "======================================================\n";
		
		double sum = 0.0;
//		일반 for
//		for (int i=0; i<bookList.size(); i++) {
//			str += bookList.get(i) + "\n";
//			sum += bookList.get(i).getPrice();
//		}
		
//		향상된 for
		for (BookVO vo : bookList) {
			str += vo + "\n";
			sum += vo.getPrice();
		}
		
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		str += "======================================================\n";
		str += " 합계 금액: " + df.format(sum) + "\n";
		str += "======================================================\n";
		return str;
	}

	public void addBook(BookVO book) {
		bookList.add(book);
	}
	
}










