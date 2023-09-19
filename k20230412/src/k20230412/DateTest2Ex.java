package k20230412;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest2Ex
{
	public static void main(String[] args)
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) a h:mm:ss.SSS");
		System.out.println(sdf.format(date));
		
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(date2));
		
		Date date3 = new Date("1983/04/22");
		System.out.println(sdf.format(date3));
		
		Date date4 = new Date(2023-1900, 11-1, 22);
		System.out.println(sdf.format(date4));
		
		Date date5 = new Date(123, 10 , 22 , 18 ,1);
		System.out.println(sdf.format(date5));
		
		Date date6 = new Date(132, 10, 22, 18, 1, 10);
		System.out.println(sdf.format(date6));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일을 입력하세요.");
		int year = scanner.nextInt()-1900;
		int month = scanner.nextInt()-1;
		int day = scanner.nextInt();
		
		Date date7 = new Date(year, month, day);
		System.out.println(sdf.format(date7));
		
		date7.setYear(2024-1900);
		date7.setMonth(12-1);
		date7.setDate(25);
		date7.setHours(12);
		date7.setMinutes(25);
		date7.setSeconds(30);
		System.out.println(sdf.format(date7));
	}
}















