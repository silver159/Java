package k20230417;

import java.util.ArrayList;

public class ArrayListTestEx
{
	public static void main(String[] args)
	{
//		ArrayList는 데이터가 삽입되면 자동으로 크기가 커지고 제거되면 자동으로 작아진다.
//		중간에 데이터가 삽입되면 삽입되는 위치부터 모든 데이터가 뒤로 이동되고 데이터가 
//		제거되면 제거된 데이터 다음 위치부터 모든 데이터가 앞으로 이동된다.
		
//		<E>: 제네릭이라 부르며 ArrayList에 저장할 데이터의 타입을 반드시 클래스로 적어야 한다.
//		=>기본자료형을 사용할 수 없다. => 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 한다.
//		기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용해야 한다. => 랩퍼 클래스는 기본 자료형의
//		첫 문자만 대문자로 바꾸면 된다. 단, int는 Integer로 char는 Character를 사용한다.
//		랩퍼 클래스 : 기본 자료형을 객체로 포장하는 것
//		ArrayList list = new ArrayList(); // JDK 1.4 버전 이전, 사용가능
//		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK 1.5 버전 이후,
		ArrayList<Integer> list = new ArrayList<>(); // JDK 1.7 버전 이후.
		
		for (int i=0; i<10; i++) {
			list.add(i+1);
		}
		for (int i=0;i<10;i++) {
			System.out.printf("list.get(%d) = %d%n", i, list.get(i));
		}
		for (int i=10; i<20; i++) {
			list.add(i+1);
		}
		for (int i=10;i<20;i++) {
			System.out.printf("list.get(%d) = %d%n", i, list.get(i));
		}
//		ArrayList도 인덱스 범위를 벗어나면 IndexOutOfBoundsException가 발생된다.(0~19)
//		System.out.println(list.get(20));
	}
}
