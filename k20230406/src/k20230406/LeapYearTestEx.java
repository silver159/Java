package k20230406;

import java.util.Scanner;

public class LeapYearTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년, 평년을 판단할 년도를 입력하세요:");
		int year = scanner.nextInt();
//		년도가 4로 나눠 떨어지고(&&) 100으로 나눠 떨어지지 않거나(||) 
//		400으로 나눠 떨어지면 윤년,
		boolean isLeapYear = year%4==0 && year%100!=0 || year%400==0; 
		
		if(isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
//		삼항연산자
//		(조건식)? "  " : "   "
		
		System.out.println(isLeapYear?"윤년":"평년");
		System.out.println(year + "년은 "+(isLeapYear?"윤년":"평년")+"입니다" );
		System.out.printf("%d년은 %s입니다.%n",year,isLeapYear?"윤년":"평년");
		System.out.printf("%d년은 %c년입니다.%n",year,isLeapYear?'윤':'평');
		
		long time = System.currentTimeMillis();
		System.out.println(time);		
		
	}
}
