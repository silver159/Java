package com.tjoeun.collectionTest;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest
{
	public static void main(String[] args)
	{
		// HashSet은 중복되는 데이터 입력을 허용하지 않는다.
		// 데이터를 입력하는 순서와 입력된 데이터가 실제로 저장되는 순서가 달라 get(), set()
		// 메소드가 제공되지 않는다.
		// index를 사용 못한다.
		
		HashSet<Integer> hset = new HashSet<>();
		
		// add(value) 메소드는 HashSet에 value를 저장한다. 특정위치에 저장할 수 없다.
		hset.add(500);
		// size() 메소드는 HashSet에 저장된 데이터의 개수를 얻어온다.
		System.out.println(hset.size() + ": "+ hset );
		hset.add(100);
		System.out.println(hset.size() + ": "+ hset );
		hset.add(999);
		System.out.println(hset.size() + ": "+ hset );
		hset.add(50); // 순서가 변한다
		System.out.println(hset.size() + ": "+ hset );
		hset.add(100); // 중복되는 데이터는 저장되지 않는다.
		System.out.println(hset.size() + ": "+ hset );
		
		// remove(value) 메소드는 HashSet에 저장된 value를 제거한다.
		hset.remove(500);
		System.out.println(hset.size() + ": "+ hset );
		
		// clear() 메소드는 HashSet에 저장된 모든 데이터를 제거한다.
		hset.clear();
		System.out.println(hset.size() + ": "+ hset );
		System.out.println("=========================");
		
		// 로또 1등 번호 HashSet 이용
//		Random random = new Random();
//		while( hset.size()!=7)
//		{
//			int r = random.nextInt(45) + 1;
//			hset.add(r);
//			System.out.println(hset);
//		}
		Random random = new Random();
		while (true)
		{
			int lotto = random.nextInt(45)+1;
			System.out.println(lotto);
			hset.add(lotto);
			// HashSet 객체에 중복되지 않는 숫자 6개가 저장되면 무한루프를 탈출한다.
			if (hset.size()==6) {break;}
		}
		System.out.println("1등 번호: "+hset);
		
		// 보너스 번호 HashSet 이용
		/* 내가 한 방법
		while (true)
		{
			int lotto = random.nextInt(45)+1;
			hset.add(lotto);
			if (hset.size()==7)
			{
				System.out.println("보너스 번호: "+lotto);break;
			}
		}
		*/
		int bonus;
		while (true)
		{
			bonus = random.nextInt(45)+1;
			System.out.println(bonus);
			hset.add(bonus);
			if (hset.size()==7)
			{
				break;
			}
		}
		hset.remove(bonus); // bonus에 보너스 번호가 남아있다.
		System.out.println("1등 번호: "+ hset +"보너스 번호: "+bonus);
		System.out.println("=========================");
		
		// 다른 방법
		while (true)
		{
			bonus = random.nextInt(45)+1;
			System.out.println(bonus);
			// contains() 메소드는 HashSet 객체에 인수로 지정된 데이터가 포함되어있으면
			// true, 그렇지 않으면 false를 리턴한다.
//			if (hset.contains(bonus) == false)
			if (!hset.contains(bonus))
			{
				break;
			}
		}
		System.out.println("1등 번호: "+ hset +"보너스 번호: "+bonus);
		System.out.println("================================================");
		
		
	}
}












