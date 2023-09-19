package k20230413;

import java.util.Scanner;

public class JuminNoTest
{
	public static void main(String[] args)
	{
//		주민등록번호 13자리를 '-'없이 입력받아 성별 판단하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		8304221185600 => 아기공룡 둘리 주민등록번호
		System.out.println(jumin.charAt(6));
		System.out.println((int)jumin.charAt(6));
		
//		숫자와 문자는 표현하는 방법이 다르다.
//		문자 '1'(0110001)(49)과 숫자 1(00000001)
//		if(jumin.charAt(6) == 1 || jumin.charAt(6) ==3) // 무조건 거짓
		if(jumin.charAt(6) == '1' || jumin.charAt(6) == 51)
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("여자");
		}
		
		if(jumin.charAt(6)-48 == 1 || jumin.charAt(6)-'0' == 3)
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("여자");
		}
//		기억하기
		if(jumin.charAt(6)%2 == 1 )
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("여자");
		}
		
		
		
	}
}
