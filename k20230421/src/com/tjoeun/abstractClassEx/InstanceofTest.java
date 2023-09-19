package com.tjoeun.abstractClassEx;

import java.util.ArrayList;

abstract class Animal
{
	public abstract void move(); // 추상 메소드 : 상속 받는 클래스가 다 다르게 실
	public void hiding() {} // 일반 메소드 : 상속 받는 클래스가 다 같게 실행
}
class Human extends Animal
{
	@Override
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBooks()
	{
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal
{
	@Override
	public void move()
	{
		System.out.println("호랑이는 네 발로 걷습니다");
	}
	public void hunting()
	{
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal
{

	@Override
	public void move()
	{
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void eating()
	{
		System.out.println("독수리가 먹이를 먹습니다.");
	}
}
public class InstanceofTest
{
	public static void main(String[] args)
	{
		Animal[] animals = { new Human(), new Tiger(), new Eagle() };
		animals[0].move();
		animals[1].move();
		animals[2].move();
		System.out.println("===========================");
		
		// upcasting, 자식 => 부모
		Animal hanimal = new Human();
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();
		
		// main() 이라는 static 메소드에서 moveAnimal() 메소드를 바도 실행하기 때문에
		// moverAnimal() 메소드는 반시드 static으로 선언된 메소드이어야 한다.
		// private static void moveAnimal(Animal animal) 사용
		moveAnimal(hanimal);
		moveAnimal(tanimal);
		moveAnimal(eanimal);
		System.out.println("===========================");
		
		// 현재 클래스 자신의 객체를 생성해서 moveAnimal2() 메소드를 실행하게 되면
		// static 메소드로 만들지 않고도 실행할 수 있다.
		//자신의 클래스 객체를 만든다.
		InstanceofTest test = new InstanceofTest();
		test.moveAnimal2(hanimal);
		test.moveAnimal2(tanimal);
		test.moveAnimal2(eanimal);
		System.out.println("===========================");
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hanimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		
		for (Animal animal : animalList)
		{
			animal.move();
		}
		System.out.println("===========================");
		
		for (int i=0; i<animalList.size();i++)
		{
			// downcasting: upcasting된 클래스를 다시 원래의 타입으로 변환시킨다.
			// instanceof 연산자를 사용해서 형변환이 가능한지 확인한 후
			// downcasting을 실행한다.
			// instanceof 연산자는 객체가 instanceof 뒤에 지정한 클래스 타입으로 안전하게
			// 형변환이 가능한지 검사한다.
			
			Animal animal = animalList.get(i);
			if(animal instanceof Human) 
			{
				// downcasting, 부모에 저장된 자식 객체 => 자식
				Human human = (Human) animal;
				human.readBooks();
			} else if (animal instanceof Tiger) 
			{
				// downcasting, 부모에 저장된 자식 객체 => 자식
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle)
			{
				// downcasting, 부모에 저장된 자식 객체 => 자식
				Eagle eagle = (Eagle) animal;
				eagle.eating();
			} else
			{
				System.out.println("downcasting 불가능");
			}
		}
		
	}

	private void moveAnimal2(Animal animal)
	{
		animal.move();
	}

	private static void moveAnimal(Animal animal)
	{
		animal.move();
	}

}




























