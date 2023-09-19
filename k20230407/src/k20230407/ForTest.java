package k20230407;

public class ForTest
{

	public static void main(String[] args)
	{
//		for {} 블록을 조건이 만족하는 동안 반복해서 실행한다.
//		반복 횟수가 알려져있는 경우 주로 사용한다.
//		
//		for(자료형 변수이름 = 초기치; 조건식; 증감치){
//		    조건이 참인 동안 실행할 문장;
//			...;
//		}
		int sum = 0;
		for(int i=1; i<=10; i++) // ++i나 i++이나 상관없다.
		{
//			System.out.println(i);
			sum +=i;
		}
		System.out.println("1에서 10의 합계 = " + sum);
		
//		증감 연산자: ++(1증가), --(1감소) => 단항 연산자
//		a++ : 사용 후 1증가, a 변수에 저장된 값을 사용(연산)하고 ";"을 만나서 문장이 종료될 때 1증가
//		++a : 1증가 후 사용, a에 저장된 값을 1증가시키고 사용한다.
//		a-- : 사용 후 1감소, a 변수에 저장된 값을 사용(연산)하고 ";"을 만나서 문장이 종료될 때 1감소
//		--a : 1감소 후 사용, a에 저장된 값을 1감소시키고 사용한다.
		
		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a = "+ a +", b = "+ b +", c =" + c);
		
		int d =1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + " ,e = "+e); // d = 5, e = 14 c언어는 5
		
		
	}

}
