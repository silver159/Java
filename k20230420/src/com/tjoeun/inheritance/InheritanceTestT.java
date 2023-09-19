package com.tjoeun.inheritance;

public class InheritanceTestT {

	public static void main(String[] args) {
		
		ParentT parent = new ParentT();
		System.out.println(parent);
		ParentT parent2 = new ParentT("홍길동", true);
		System.out.println(parent2);
		System.out.println("======================");
		
		ChildT child = new ChildT();
		System.out.println(child);
		ChildT child2 = new ChildT("성춘향", false, 16, "이쁜이");
		System.out.println(child2);
		
	}
	
}
