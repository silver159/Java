package com.tjoeun.interfaceTest;

public abstract class Calculator implements Calc
{
	@Override
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2)
	{
		return num1-num2;
	}
	// 이럴경우 다형성에서 add나 sub는 빠진다. 
	// => 일반적으로 인터페이스에서 default나 static으로 선언
}
