package com.tjoeun.syncronizedMethodTest;

public class LibraryMain
{
	public static Library library = new Library();
	
	public static void main(String[] args)
	{
		/*
		Library library = new Library();
		System.out.println(library.bookList);
		
		// ArrayList remove(object) 메소드를 실행하면 삭제할 객체가 있으면 true, 
		// 없으면 false를 리턴하고 remove(index) 메소드를 실행하면 삭제할 index의
		// 데이터를 리턴하고 삭제한다.
		String book = library.bookList.remove(0);
		System.out.println(book);
		System.out.println(library.bookList);
		*/
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("임꺽정");
		Student student3 = new Student("장길산");
		Student student4 = new Student("일지매");
		Student student5 = new Student("이몽룡");
		Student student6 = new Student("성춘향");
		
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
	}
}
















