package k20230412;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTestEx
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy.MM.dd(E) a h:mm:ss.SSS");
		System.out.println(sdf2.format(date));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy.MM.dd(E) a h:mm:ss.SSS", Locale.US);
		System.out.println(sdf3.format(date));
		
		char[] week = {'일','월','화','수','목','금','토','일'};
		System.out.println("년: "+(date.getYear()+1900));
		System.out.println("월: "+(date.getMonth()+1));
		System.out.println("일: "+date.getDate());
		System.out.println("요일: "+week[date.getDay()]);
		System.out.println("시 "+date.getHours());
		System.out.println("분 "+date.getMinutes());
		System.out.println("초 "+date.getSeconds());
		
		System.out.println(date.getTime());
		System.out.printf("밀리초: %03d%n",date.getTime()%1000);
		
		//new 사용x
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println("년: "+calendar.get(calendar.YEAR));
		System.out.println("월: "+(calendar.get(calendar.MONTH)+1) );
		System.out.println("일: "+calendar.get(calendar.DATE) );
		System.out.println("일: "+calendar.get(calendar.DAY_OF_MONTH) );
//		기존의 date 보다 1 크게 나온다. 일(1), 월(2)...토(7)
		System.out.println("요일: "+calendar.get(calendar.DAY_OF_WEEK) );
		System.out.println("시(12시각): "+ calendar.get(calendar.HOUR) );
		System.out.println("시(24시각): "+ calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("분: "+calendar.get(calendar.MINUTE) );
		System.out.println("초: "+calendar.get(calendar.SECOND) );
		System.out.println("밀리초: "+calendar.get(calendar.MILLISECOND) );
		
		long start = System.currentTimeMillis();
		
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("실행시간: " +(end-start)/1000. +"초");
		SimpleDateFormat sdf4 = new SimpleDateFormat("실행 시간: HH:mm:ss.SSS초");
		System.out.println(sdf4.format(end-start-32400000));
	}
}



























