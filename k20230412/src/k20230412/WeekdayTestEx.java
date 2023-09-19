package k20230412;

import java.util.Scanner;

public class WeekdayTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		int sum = (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		int[] m = {31,0,31,30,31,30,31,31,30,31,30,31};
		
		m[1] = year%4==0 && year%100!=0 ||year%400==0 ? 29:28;
		
		for(int i=1; i<month;i++)
		{
			sum +=m[i-1];
		}
		sum+=day;
		
		char[] week = {'일','월','화','수','목','금','토','일'};
		System.out.println(week[sum%7]+"요일");
	}
}
