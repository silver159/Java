package com.tjoeun.collectionTest;

import java.util.TreeSet;
import java.util.Random;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		// TreeSet은 중복되는 데이터 입력을 허용하지 않는다.
		// 데이터를 입력하는 순서와 입력된 데이터가 실제로 저장되는 순서가 달라 get(), set()
		// 메소드가 제공되지 않는다.
		// index를 사용 못한다.
		// TreeSet은 HashSet과 달리 입력되는 순서와 관계없이 오름차순으로 정렬되서 저장된다.
		// 정렬외에는 HashSet과 차이점 없다.
		
		TreeSet<Integer> tSet = new TreeSet<>();
		
		// add(value) 메소드는 TreeSet에 value를 저장한다. 특정위치에 저장할 수 없다.
		tSet.add(500);
		// size() 메소드는 TreeSet에 저장된 데이터의 개수를 얻어온다.
		System.out.println(tSet.size() + ": "+ tSet );
		tSet.add(100);
		System.out.println(tSet.size() + ": "+ tSet );
		tSet.add(999);
		System.out.println(tSet.size() + ": "+ tSet );
		tSet.add(50);
		System.out.println(tSet.size() + ": "+ tSet );
		tSet.add(100); //  중복되는 데이터는 저장되지 않는다.
		System.out.println(tSet.size() + ": "+ tSet );
		
		// remove(value) 메소드는 TreeSet에 저장된 value를 제거한다.
		tSet.remove(500);
		System.out.println(tSet.size() + ": "+ tSet );
		
		// clear() 메소드는 TreeSet에 저장된 모든 데이터를 제거한다.
		tSet.clear();
		System.out.println(tSet.size() + ": "+ tSet );
		System.out.println("=========================");
		
		// 로또 1등 번호 TreeSet 이용
		Random random = new Random();
		while (true)
		{
			int lotto = random.nextInt(45)+1;
			System.out.println(lotto);
			tSet.add(lotto);
			// TreeSet 객체에 중복되지 않는 숫자 6개가 저장되면 무한루프를 탈출한다.
			if (tSet.size()==6) {break;}
		}
		System.out.println("1등 번호: "+tSet);
		
		// 보너스 번호 TreeSet 이용
		/* 내가 한 방법
		while (true)
		{
			int lotto = random.nextInt(45)+1;
			tSet.add(lotto);
			if (tSet.size()==7)
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
			tSet.add(bonus);
			if (tSet.size()==7)
			{
				break;
			}
		}
		tSet.remove(bonus);
		System.out.println("1등 번호: "+ tSet +"보너스 번호: "+bonus);
		System.out.println("=========================");
		
		while (true)
		{
			bonus = random.nextInt(45)+1;
			System.out.println(bonus);
			// contains() 메소드는 TreeSet 객체에 인수로 지정된 데이터가 포함되어있으면
			// true, 그렇지 않으면 false를 리턴한다.
//			if (tSet.contains(bonus) == false)
			if (!tSet.contains(bonus))
			{
				break;
			}
		}
		System.out.println("1등 번호: "+ tSet +"보너스 번호: "+bonus);
		System.out.println("================================================");
		
		
	}
}













