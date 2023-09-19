package k20230406;

import java.util.Scanner;

public class LeapYearTest
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년, 평년을 판단할 년도를 입력하세요:");
		int year = scanner.nextInt();
		
		boolean isLeapYear = year%4==0 && year%100!=0 || year%400==0; //리팩토리,모듈, 
//		%%가 ||보다 우선순위가 높다
		
		if(isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
//		형식:조건식 ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장
		
		System.out.println(isLeapYear ? "윤" : "평");
		System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
		System.out.printf("%d년은 %s년입니다.\n", year, isLeapYear ? "윤" : "평");
		System.out.printf("%d년은 %c년입니다.\n", year, isLeapYear ? '윤' : '평');
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		
	}

}
