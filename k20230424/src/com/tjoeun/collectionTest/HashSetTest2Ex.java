package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2Ex
{
	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<>();
		
		hset.add("홍길동");
		System.out.println(hset.size() + ": "+ hset );
		hset.add("임꺽정");
		System.out.println(hset.size() + ": "+ hset );
		hset.add("장길산");
		System.out.println(hset.size() + ": "+ hset );
		hset.add("일지매"); // 저장되는 순서와 입력 순서가 다르다.
		System.out.println(hset.size() + ": "+ hset );
		hset.add("홍길동"); // 중복 데이터 저장 x
		System.out.println(hset.size() + ": "+ hset );
		System.out.println("===========================");
		
		ArrayList<String> list = new ArrayList<>();
		// 인덱스를 사용 못하기 때문에 일반 for 사용할 수 없다.
		// 향상된 for를 사용해서 HashSet이나 TreeSet 객체의 데이터를 1개씩 얻어올 수 있다.
		for (String str : hset)
		{
			System.out.println("향상된 for 사용: "+str);
			list.add(str); // ArrayList는 add() 메소드 사용
		}
		for (int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===========================");
		list.clear();
		// 다른 방법, JAVA가 제공하는 방법 (java.util)
		
		// Iterator 인터페이스는 HashSet이나 TreeSet과 같이 입력하는 순서와 저장되는 순서가 
		// 달라서 get(), set() 메소드를 사용할 수 없는 객체를 분리한다.
		// HashSet이나 TreeSet 객체에 Iterator() 메소드를 실행하면 데이터 단위로 분리된다.
		Iterator<String> iterator = hset.iterator(); // 인터페이스는 new로 만들지 않는다.
		
		// hasNext() 메소드는 Iterator 인터페이스 객체에 다음에 읽을 데이터가 있으면 true,
		// 없으면 false를 리턴한다.
		
		while(iterator.hasNext()) // iterator 인터페이스 객체에 데이터가 있는 동안 반복한다.
		{
			String str = iterator.next();
			// next() 메소드는 Iterator 인터페이스 객체의 다음 데이터를 얻어온다.
			System.out.println("Iterator 인터페이스 객체 사용: "+str);
			list.add(str);
		}
		System.out.println("===========================");
		for (int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===========================");
		hset.remove("홍길동");
		System.out.println(hset.size() + ": "+ hset );
		hset.clear();
		System.out.println(hset.size() + ": "+ hset );
		System.out.println("===========================");
	}
}
























