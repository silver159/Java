package com.tjoeun.GenericTest;

public class ThreeDPrinterTest
{
	public static void main(String[] args)
	{
		// Powder를 재료로 사용하는 3D 프린터 객체를 만든다.
		ThreeDPrinterPowder printerPowder = new ThreeDPrinterPowder();
		// Powder를 재료로 사용하는 3D 프린터에 사용할 재료를 만든다.
		Powder powder = new Powder();
		
		// 3D 프린터에 재료를 넣어준다.
		printerPowder.setMaterial(powder);
		// 3D 프린터를 사용한다.
		System.out.println(printerPowder.getMaterial());
		// 3D 프린터에서 재료를 꺼낸다.
		powder = printerPowder.getMaterial();
		System.out.println("=========================");
		
		// Plastic를 재료로 사용하는 3D 프린터 객체를 만든다.
		ThreeDPrinterPlastic printerPlastic = new ThreeDPrinterPlastic();
		Plastic plastic = new Plastic();
		
		printerPlastic.setMaterial(plastic);
		System.out.println(printerPlastic.getMaterial());
		plastic = printerPlastic.getMaterial();
		System.out.println("=========================");
		
		// Powder와 Plastic을 모두 재료로 사용하는 3D 프린터 객체를 만든다. => Object
		ThreeDPrinter threeDPrinter = new ThreeDPrinter();
		
		threeDPrinter.setMaterial(powder); // upcasting
		System.out.println(threeDPrinter.getMaterial());
		// 자식 객체를 부모 객체에 넣을 때(upcasting)는 별다른 문제가 발생되지
		// 않지만 부모 객체에 저장된 자식 객체를 자식 객체에 넣을 때(downcasting)는
		// 반드시 형변환 시켜서 넣어야 한다.
		powder = (Powder) threeDPrinter.getMaterial(); // downcasting
		
		threeDPrinter.setMaterial(plastic); // upcasting
		System.out.println(threeDPrinter.getMaterial());
		plastic = (Plastic) threeDPrinter.getMaterial();// downcasting
		System.out.println("=========================");
		
		// Powder와 Plastic을 모두 재료로 사용하는 3D 프린터 객체를 만든다. => Generic
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(powder);
		System.out.println(genericPrinter.getMaterial());
		powder = genericPrinter.getMaterial();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(plastic);
		System.out.println(genericPrinter2.getMaterial());
		plastic = genericPrinter2.getMaterial();
		System.out.println("=========================");
		
		Water water = new Water();
		
		threeDPrinter.setMaterial(water);
		System.out.println(threeDPrinter.getMaterial());
		water = (Water) threeDPrinter.getMaterial();
		
		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		genericPrinter3.setMaterial(water);
		System.out.println(genericPrinter3.getMaterial());
		water = genericPrinter3.getMaterial();
	}
}












