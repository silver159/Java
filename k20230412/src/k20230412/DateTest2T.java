package k20230412;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest2T {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) a h:mm:ss");
		System.out.println(sdf.format(date));
		
//		날짜, 시간 데이터 만들기  (안쓰임)
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(date2));
		
		Date date3 = new Date("1983/04/22"); // 구분자는 '/'만 사용 가능
		System.out.println(sdf.format(date3));

//		필요하면 사용함
		Date date4 = new Date(2023 - 1900, 11 - 1, 22);
//		Date 클래스 객체에 년도를 저장할 때는 1900을 빼서 넣어야 하고 월을 저장할 때는 1을 빼서
//		넣어야 한다.
		System.out.println(sdf.format(date4));
		
		Date date5 = new Date(123, 10, 22, 18, 1);
		System.out.println(sdf.format(date5));
		
		Date date6 = new Date(123, 10, 22, 18, 1, 10);
		System.out.println(sdf.format(date6));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("년, 월, 일을 입력하세요: ");
		int year = scanner.nextInt() - 1900;
		int month = scanner.nextInt() - 1;
		int day = scanner.nextInt();
		
		Date date7 = new Date(year, month, day);
		System.out.println(sdf.format(date7));
		
//		=============================================================================================
		
//		날짜, 시간 데이터 수정하기
		date7.setYear(124); // 2024-1900
		date7.setMonth(11); //12-1
		date7.setDate(25);
		date7.setHours(12);
		date7.setMinutes(25);
		date7.setSeconds(30);
		System.out.println(sdf.format(date7));
		
	}
	
}









