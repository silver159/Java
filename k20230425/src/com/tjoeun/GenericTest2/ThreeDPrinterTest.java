package com.tjoeun.GenericTest2;

public class ThreeDPrinterTest
{
	public static void main(String[] args)
	{
		// Powder와 Plastic을 모두 재료로 사용하는 3D 프린터 객체를 만든다. => Generic
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(new Powder());
		System.out.println(genericPrinter.getMaterial());
		Powder powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(new Plastic());
		System.out.println(genericPrinter2.getMaterial());
		Plastic plastic = genericPrinter2.getMaterial();
		System.out.println("=========================");
		
		Water water = new Water();
//		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>(); // 에러 발생
		
		
	}
}












