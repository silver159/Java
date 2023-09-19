package k20230413;

import java.util.Scanner;

public class CalendarTestEx
{
// 메서드의 형식, []로 묶는 내용은 생략이 가능하다.
// [접근 권한 지정자] [static] 리턴타입 메소드이름)([인수,...]) //메소드의 머리
//	{
//		메소드가 실행할 문장;
//		...;
//		[return 값;]
//	}//{}블록을 메소드의 몸통이라고 한다.
	
//	접근 권한 지정자 (파워 순)
//	private: 현재 클래스 외부에서 실행할 수 없다.
//	protected: 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 실행할 수 있다.
//	package: 접근 권한 지정자를 생략하면 package 권한으로 간주한다.
//			같은 패키지에서는 public 처럼 사용되고 다른 패키지에서는 private 처럼 사용된다.
//	public: 현재 클래스 내부, 외부 어디에서나 자유롭게 실행할 수 있다.
	
//	static(정적) 메소드는 메소드가 작성된 클래스 객체를 생성(new)하지 않고 클래스 이름에 "."
//	찍어서 실행할 수 있다. => 자주 사용하는 메소드들은 정적 메소드로 만들어 사용하면 편리하다.
	
//	리턴 타입은 메소드가 실행되고 난 후 결과의 자료형을 적는다.
//	메소드를 실행한 후 결과가 없다면 return을 생략할 수 있고 return을 생략하면 리턴 타입에는
//	"void"라고 적어준다.
	
//	년도를 인수를 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는 메소드
//	논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행이다.
	public static boolean isLeapYear(int year)
	{
		return year%4 ==0 && year%100!=0 || year%400==0;
	}
// 년, 월을 인수로 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year,int month)
	{
//		각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31,0,31,30,31,30,31,31,30,31,30,31};
//		2월의 마지막 날짜를 확정한다.
		m[1]= isLeapYear(year) ? 29:28;
//		마지막 날짜를 리턴한다.
		return m[month-1];
	}
	
//	년, 월, 일을 인수로 넘겨받아 1년 1월 1일부터 지난 날짜의 합계를 계산해 리턴하는 메소드
	public static int totalDay(int year, int month, int day)
	{
		int sum=0;
		sum = 365 * (year -1) + (year -1)/4 - (year -1)/100 + (year -1)/400;
		for (int i=1;i<month;i++)
		{
			sum += lastDay(year, i);
		}
		return sum += day;
	}
	public static int weekDay(int year, int month, int day)
	{
		return totalDay(year, month, day)%7;
	}
//	JVM은 자바 프로그램이 실행되기 전에 static으로 선언된 함수(메소드)나 변수를 메모리에 올려준다.
//	모든 메소드는 메소드가 실행되기 전에 메모리에 적재된어야 한다.
//	main 메소드가 메모리에 적재되어있지 않으면 프로그램의 시작점은 main() 메소드를 호출할 수 없으므로
//	프로그램을 실행할 수 없다. 그래서 main() 메소드는 누군가 호출하기 전에 JMV이 메모리에 적재시킨다.
	
	
	
	
	public static void main(String[] args)
	{
//		static 메소드는 static 메소드에만 접근할 수 있다.
//		System.out.println(isLeapYear(2023));
//		System.out.println(lastDay(2023, 4));
//		System.out.println(totalDay(2023, 4, 13));
//		System.out.println(weekDay(2023, 4, 13));
		
//		달력을 출력할 년, 월을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		System.out.println("===========================");
		System.out.printf("         %4d년%2d월%n",year,month);
		System.out.println("===========================");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("===========================");
		
		for(int i=1; i<=weekDay(year, month, 1);i++)
		{
			System.out.print("    ");
		}
		
		for(int i =1;i<=lastDay(year, month);i++)
		{
			System.out.printf(" %2d ",i);
			if(weekDay(year, month, i)==6 && i!=lastDay(year, month)){System.out.println();}
		}
		System.out.println("\n===========================");
	}
}





























