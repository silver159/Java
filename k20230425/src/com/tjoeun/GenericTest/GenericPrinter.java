package com.tjoeun.GenericTest;

// 재료로 Powder와 Plastic을 사용하는 3D 프린터, 겸용 프린터 => Generic(<>) 사용
// Generic은 자료형 변수로 데이터가 아니라 데이터의 타입을 받는다.
// 클래스를 사용하는 시점에서 실제로 사용할 자료형을 지정한다. 
// static에는 사용할 수 없다.
// E: Element, K: Key, V: Value, T: Template 등 여러 알파벳을 의미에 따라 사용할 수 있다.
public class GenericPrinter<M>
{
	// 겸용 3D 프린터는 Powder와 Plastic을 모두 재료로 받을 수 있어야 하기 때문에
	// Powder와 Plastic의 부모 클래스는 Object이므로 Object 타입으로 재료 필드를 
	// 선언한다.
	private M material; // upcasting 사용

	public M getMaterial()
	{
		return material;
	}
	public void setMaterial(M material)
	{
		this.material = material;
	}
	
}
