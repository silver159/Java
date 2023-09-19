package k20230413;

import java.util.Scanner;

public class JuminNoTest3Ex
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		8304221185600 => 아기공룡 둘리 주민등록번호
//		주민등록번호의 각 자리 숫자에 가중치를 곱한 합계를 계산한다.
		String check = "234567892345";//가중치
		int sum=0;
		for (int i=0;i<12;i++)
		{
//			sum += (jumin.charAt(i)-'0')*(check.charAt(i)-48);
//			System.out.printf("%d*%d = %d%n",(jumin.charAt(i)-'0'),(check.charAt(i)-48),
//					(jumin.charAt(i)-'0')*(check.charAt(i)-48));
//			야메: 문자를 문자열로
			sum+=Integer.parseInt(jumin.charAt(i)+"")*Integer.parseInt(check.charAt(i)+"");
		}
		System.out.println(sum);
		int r = (11-sum%11)%10;
//		if (r == jumin.charAt(12)-48)
//		{
//			System.out.println("정상");
//		}
//		else
//		{
//			System.out.println("오류");
//		}
		System.out.println(r == Integer.parseInt(jumin.charAt(12)+"")?"정상":"오류");
	}
}


























