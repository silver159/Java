package com.tjoeun.interfaceTest3;

public class InterfaceTest3Ex
{
	public static void main(String[] args)
	{
		Calc calc = new ComplateCalc(); // upcating
		int num1 = 10;
		int num2 = 2;
		
		System.out.printf("%d + %d = %2d\n", num1, num2 , calc.add(num1, num2));
		System.out.printf("%d - %d = %2d\n", num1, num2 , calc.sub(num1, num2));
		System.out.printf("%d * %d = %2d\n", num1, num2 , calc.mul(num1, num2));
		System.out.printf("%d / %d = %2d\n", num1, num2 , calc.div(num1, num2));
		
		// Calc 인터페이스에 정의한 default 메소드를 실행한다. 객체(calc) 만들어 사용
		calc.description(5);
		
		// Calc 인터페이스에 정의한 static 메소드를 실행한다. "." 찍어 사용// 객체 필요 없다.
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println("sum: "+sum);
		
		// Calc 인터페이스에 정의한 private 메소드는 인터페이스 외부에서 실행할 수 없다.
//		calc.myMethod(5); // 에러
		// Calc 인터페이스에 정의한 private static 메소드는 인터페이스 외부에서 실행할 수 없다.
//		Calc.myStaticMethod(); // 에러
	}
}
