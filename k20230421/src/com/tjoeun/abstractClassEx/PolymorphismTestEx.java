package com.tjoeun.abstractClassEx;

import java.util.Scanner;

// 다형성(Polymorphism)이란 같은 메소드가 "서로 다른 클래스"에서 다양하게 실행되는 
// 것을 말한다.
// 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은
// 부모 클래스를 가져야 하고 부모와 자식 클래스에 같은 이름의 메소드가 있어야 하며
// 자식 클래스에서 부모 클래스의 메소드를 반드시 Override 시켜서 사용해야 한다.
// => 추상 클래스 만들어서 상속 시키면 가능
// 부모 클래스 타입의 객체에 자식 클래스 타입의 객체를 대입해서 다형성 구현된
// 메소드를 실행한다.
// Shape shape = new Point(); // upcasting, 자식 => 부모 
// 부모 객체     자식 객체
// 부모 클래스 타입의 객체에 자식 클래스 타입의 객체를 대입해서 다형성이 구현된
// 메소드를 실행한다.

abstract class ShapeEx
{
	int x,y;
	void move() {} //  일반 메소드
	abstract void draw(); // 추상 메소드 body {} 가 없다 => 다형성을 구현할 메소드
}
// Shape 클래스를 상속받아 Point 클래스를 만든다.
class PointEx extends ShapeEx
{
	@Override
	void draw()
	{
		System.out.println("점을 찍는다.");
	}
}
//Shape 클래스를 상속받아 Line 클래스를 만든다.
class LineEx extends ShapeEx
{
	@Override
	void draw()
	{
		System.out.println("선을 그린다.");
	}
}
//Shape 클래스를 상속받아 Circle 클래스를 만든다.
class CircleEx extends ShapeEx
{

	@Override
	void draw()
	{
		System.out.println("원을 그린다.");
	}
}
//Shape 클래스를 상속받아 Rectangle 클래스를 만든다.
class RectangleEx extends ShapeEx
{
	@Override
	void draw()
	{
		System.out.println("사각형을 그린다.");
	}
}
//Shape 클래스를 상속받아 Triangle 클래스를 만든다.
class TriangleEx extends ShapeEx
{
	@Override
	void draw()
	{
		System.out.println("삼각형을 그린다.");
	}
}

public class PolymorphismTestEx
{
	public static void main(String[] args)
	{
		// 부모는 추상 클래스라서 new 못한다.
		// 부모 클래스 타입의 객체에 자식 클래스 타입의 개체를 대입해서 다형성이 구현된
		// 메소드를 실행한다.
		// upcasting, 자식 => 부모
		
		ShapeEx shape = new PointEx();
		shape.draw();
		shape = new LineEx();
		shape.draw();
		shape = new CircleEx();
		shape.draw();
		shape = new RectangleEx();
		shape.draw();
		shape = new TriangleEx();
		shape.draw();
		
		ShapeEx[] shapes = { new PointEx(), new LineEx(), new CircleEx(),new RectangleEx(),
				new TriangleEx()};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 작업을 선택하세요: ");
		int i = scanner.nextInt();
		
		shapes[i-1].draw();
	}
}


















