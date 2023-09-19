package k20230414;

public class VarArgsMethodTestEx
{
	public static void main(String[] args)
	{
//		오버로드는 같은 이름을 가진 메서드를 여러개를 만드는 것이다.
//		구별방법은 먼저 인수의 개수로 구별하고 개수가 같으면 인수 타입으로 구별한다.
		System.out.println("sum(1,2) = "+sum(1,2));
//		메소드의 인수를 배열로 구현하면 많은 수의 오버로딩은 필요없지만
//		인수를 배열로 선언하고 선언한 배열에 초기치를 지정해서
//		전달해야 하는 번거로움이 있다.
		System.out.println("sum(1,2) = "+sum(new int[] {1,2}));
		System.out.println("sum(1,2,3) = "+ sum(new int[] {1,2,3}));
		System.out.println("sum(1,2,3,4) = "+ sum(new int[] {1,2,3,4}));
		System.out.println("sum(1,2,3,4,5) = "+ sum(new int[] {1,2,3,4,5}));
		
//		위에 2가지 방법의 단점을 해결하는 가장 좋은 방법은 가변 인수를 만들어 사용하는 방법이다.
		System.out.println("total(1,2,3,4,5) = "+ total(1,2,3,4,5));
		System.out.println("total(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15) = "+ 
				total(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
	}
//	메소드 오버로딩: 같은 이름을 가지는 서로 다른 기능을 실행하는 메속드가 여러개 나올수 있다.
//	메소드 이름이 같으면 인수의 개수로 메소드를 식별하고 만약에 인수의 개수도 같다면 인수의 데이터
//	타입으로 메소드를 식별한다.


	private static int sum(int i, int j)
	{
		return i+j;
	}
	private static int sum(int[] data)
	{
		int total = 0;
		for(int i =0; i<data.length; i++)
		{
			total+=data[i];
		}
		return total;
	}
//	가변 인수를 사용하는 메소드 => 가변 인수는 자료형 뒤에 "..."을 쓰고 배열 이름을 입력한다.
//	가변 인수는 인수 목록의 맨 뒤에 딱 1번만 사용할 수 있다.(int a, int b, int ... data) 가능
//	(int ... data, int a) 불가능
	private static int total(int...data)
	{
		int total= 0;
		for(int i=0;i<data.length;i++)
		{
			total+=data[i];
		}
		return total;
	}
	
}






















