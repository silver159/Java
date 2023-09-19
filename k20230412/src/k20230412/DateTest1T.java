package k20230412;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest1T {

	public static void main(String[] args) {
		
//		현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
		Date date = new Date();
		System.out.println(date);
		
//		날짜, 시간 서식 지정하기
//		서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
//		SimpleDateFormat sdf = new SimpleDateFormat("날짜/시간 서식");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy.MM.dd(E) a h:mm:ss.SSS");
		System.out.println(sdf2.format(date));
//		SimpleDateFormat 생성자의 2번째 인수로 Locale을 지정할 수 있다.
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy.MM.dd(E) a h:mm:ss.SSS", Locale.US);
		System.out.println(sdf3.format(date));
		System.out.println("==========================================");
		
//		날짜, 시간 데이터에서 년, 월, 일, 시, 분, 초 얻어오기
//		Date 클래스는 1900년을 기준으로 날짜를 처리하므로 년도는 얻어와서 1900을 더해야 한다.
		System.out.println("년: " + (date.getYear() + 1900));
//		Date 클래스는 0 ~ 11월로 월을 처리하므로 월은 얻어와서 1을 더해야 한다.
		System.out.println("월: " + (date.getMonth() + 1));
		System.out.println("일: " + date.getDate());
		System.out.println("요일: " + date.getDay()); // 요일을 숫자로 얻어온다.
		System.out.println("시: " + date.getHours());
		System.out.println("분: " + date.getMinutes());
		System.out.println("초: " + date.getSeconds());
//		getTime(): 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초 단위로
//		얻어온다. => 13자리의 정수를 얻어온다.
		System.out.println(date.getTime());
		System.out.printf("밀리초: %03d\n", date.getTime() % 1000);
		System.out.println("==========================================");
		
//		=============================================================================================
		
		Calendar calendar = Calendar.getInstance(); //new 안됨 calendar는 만들어져 있는거 불러오는거임
		System.out.println(calendar);
		
//		System.out.println(sdf.format(calendar)); // 예외발생
//		Calendar 클래스 객체를 이용해서 날짜/시간을 출력할 서식을 적용하려면 getTime() 메소드를 실행해서
//		날짜/시간 정보만 얻어온 후 서식을 적용해야 한다.
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("년: " + calendar.get(Calendar.YEAR));
		System.out.println("월: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일: " + calendar.get(Calendar.DATE));
		System.out.println("일: " + calendar.get(Calendar.DAY_OF_MONTH));
//		Date와 다르게 일요일이 1부터 시작한다. 모든 요일이 Date보다 1 크다.
//		일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
		System.out.println("요일: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("시(12시각): " + calendar.get(Calendar.HOUR));
		System.out.println("시(24시각): " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: " + calendar.get(Calendar.MINUTE));
		System.out.println("초: " + calendar.get(Calendar.SECOND));
		System.out.println("밀리초: " + calendar.get(Calendar.MILLISECOND));
		System.out.println("==========================================");
		
//		=============================================================================================
		
//		currentTimeMillis(): 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지 지난 시간을 밀리초
//		단위로 얻어온다.
		System.out.println(System.currentTimeMillis());
		
//		currentTimeMillis() 메소드의 실행 결과는 13자리의 정수이므로 int 타입의 변수에 저장시킬 수 없고
//		long 타입의 변수에 저장해서 사용해야 한다.
//		int start = System.currentTimeMillis(); // 에러
		long start = System.currentTimeMillis(); // 시작 시간
		
//		Thread.sleep(1000); 작성후 try catch 선택
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis(); // 종료 시간
		System.out.println("실행 시간: " + (end - start) / 1000. + "초");
		SimpleDateFormat sdf4 = new SimpleDateFormat("실행 시간: HH:mm:ss.SSS초");
//		currentTimeMillis() 메소드를 이용해서 얻어온 시간 데이터를 연산할 경우 일반적인 사칙연산만
//		실행할 경우 별 문제가 발생되지 않지만 연산 결과에 SimpleDateFormat 클래스 객체를 사용해 서식을
//		지정하면 offset 값이 포함된 시간으로 서식이 적용된다. => 연산 결과에서 offset 값을 빼면 된다.
		System.out.println(sdf4.format(end - start - 32400000));
		
	}
	
}











