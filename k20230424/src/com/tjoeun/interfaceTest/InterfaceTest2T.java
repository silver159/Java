package com.tjoeun.interfaceTest;

public class InterfaceTest2T {

	public static void main(String[] args) {
		
		CalcT calc = new ComplateCalcT();
		int num1 = 10;
		int num2 = 2;
		
		System.out.printf("%d + %d = %2d\n", num1, num2, calc.add(num1, num2));
		System.out.printf("%d - %d = %2d\n", num1, num2, calc.sub(num1, num2));
		System.out.printf("%d * %d = %2d\n", num1, num2, calc.mul(num1, num2));
		System.out.printf("%d / %d = %2d\n", num1, num2, calc.div(num1, num2));
		
	}
	
}
