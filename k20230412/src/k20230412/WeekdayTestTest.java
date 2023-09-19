package k20230412;

import java.util.Scanner;

public class WeekdayTestTest
{
	public static void main(String[] args)
	{
//		요일을 계산할 년, 월, 일을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일을 입력하네요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int sum = 0;
		
//		서기 1년 1월 1일부터 요일을 계산하기 위해 입력한 날짜까지 지난 날짜수를 계산한다.
//		계산된 날짜를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일, ..., 6이면 토요일
		
		
//		서기 1년 1월 1일부터 전년도 12월 31일까지 지난 날짜수를 계산한다.

		for(int i=1; i<year; i++)
		{
			sum += 365;
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {sum++;}
		}
//		System.out.println(sum % 7);
		for(int i=1; i<month; i++)
		{
			switch(i)
			{
			case 1:case 3:case 5:case 7:case 8:case 10:
				sum+=31;break;
			case 4:case 6:case 9:case 11:
				sum+=30;break;
			case 2:
				sum+=28;
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {sum++;}
				break;
			}
		}
		sum +=day;
//		요일을 출력한다.
		char[] abc = {'일','월','화','수','목','금','토','일'};
		System.out.println(abc[sum % 7]);
	}
}
