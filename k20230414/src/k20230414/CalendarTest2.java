package k20230414;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("이번달(1), 특정달(2): ");
		int confirm = scanner.nextInt();
		int year,month;
		if (confirm ==1)
		{
			Date date = new Date();
			year = date.getYear() +1900;
			month = date.getMonth() +1;
		}
		else
		{
		System.out.print("달력을 출력할 년, 월을 입력하세요: ");
		year = scanner.nextInt();
		month = scanner.nextInt();		
		}
		System.out.println("===========================");
		System.out.printf("         %4d년%2d월%n",year,month);
		System.out.println("===========================");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("===========================");

//		1일이 출력될 위치(요일)을 맞추기 위해 요일만큼 반복하며 빈 칸(날짜당 4칸)을 출력한다.
//		for(int i=1; i<=MyCalendar.weekDay(year, month, 1); i++)
//		{
//			System.out.print("    ");
//		}
			
			
//			1일이 출력될 요일을 맞추기 위해서 요일만큼 반복하며 전달 날짜를 출력한다.
		int week = MyCalendar.weekDay(year, month, 1);
		int start;
		if(month == 1)
		{
//			start = MyCalendar.lastDay(year-1, 12)-week;
			start = 31 - week;
		}
		else
		{
			start = MyCalendar.lastDay(year, month-1)-week;//2~12월
		}
		for(int i=1; i<=week; i++)
		{
			System.out.printf(" %2d ", ++start);
		}	
		for(int i=1;i<=MyCalendar.lastDay(year, month);i++)
		{
			System.out.printf(" %2d ", i);
			if(MyCalendar.weekDay(year, month, i)==6 && i!=MyCalendar.lastDay(year,month)) {System.out.println();}
		}
//		날짜를 다 출력하고 남은 빈 칸에 다음달 1일의 요일부터 토요일까지 반복하며 다음달 날짜를 출력한다.
//		if(month == 12)
//		{
//			week = MyCalendar.weekDay(year+1, 1, 1);
//		}
//		else
//		{
//			week = MyCalendar.weekDay(year, month+1, 1);
//		}
//		if (week !=0) 
//		{
//			start =1;
//			for(int i=week; i<=6; i++)
//			{
//				System.out.printf(" %2d ", start++);
//			}
//		}
		week = MyCalendar.weekDay(year, month, MyCalendar.lastDay(year, month))+1;
		start =1;
		for(int i=week; i<=6; i++)
		{
			System.out.printf(" %2d ", start++);
		}
		System.out.println("\n===========================");
	}
}


















