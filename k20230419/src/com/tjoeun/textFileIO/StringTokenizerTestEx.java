package com.tjoeun.textFileIO;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTestEx
{
	public static void main(String[] args)
	{
//		StringTokenizer 클래스는 사용자가 지정하는 구분자를 경계로 데이터를 분리한다.
//		구분자를 생략하면 공백과 탭을 기본 구분자로 사용하며 구분자로 분리된 데이터를
//		token이라 한다.
		
//		문자열이 공백이나 탭으로 구분된 경우
		String str1 = "사과 배 복숭아	밤 대추";
		StringTokenizer st1 = new StringTokenizer(str1);
		
//		hasMoreTokens() 메소드는 StringTokenizer 클래스 객체에 다음에 읽을 token이 있으면
//		true, 없으면 false를 리턴한다.
		while (st1.hasMoreTokens())// 다음에 읽을 데이터(token)가 있는 동안 반복한다.
		{
//			nextToken() 메소드는 StringTokenizer 클래스의 다음 token을 읽어들인다.
			System.out.println(st1.nextToken());
		}
		System.out.println("=======================================");
		
//		문자열이 ","로 구분된 경우
		String str2 = "사과,배,복숭아,밤,대추";
//		StringTokenizer 클래스 생성자의 2번째 인수로 구분자를 지정할 수 있다.
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		System.out.println("=======================================");
		
//		문자열이 ","와 "."으로 구분된 경우
		String str3 = "사과,배,복숭아.밤,대추";
		StringTokenizer st3 = new StringTokenizer(str3, ",.");
		
		while(st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}
		System.out.println("=======================================");
		
//		문자열이 "="와 ","으로 구분된 경우
		String str4 = "사과=1000,배=2000,복숭아=3000,밤=4000,대추=5000";
//		StringTokenizer 클래스 생성자의 3번째 인수로 구분자를 token에 포함시키는 여부를
//		지정할 수 있다.
//		생략시 false가 기본값으로 구분자를 token에 포함시키지 않지만 true를 쓰면 token을
//		구분자에 포함시킨다.
		StringTokenizer st4 = new StringTokenizer(str4, "=,", true);
		
		while(st4.hasMoreTokens())
		{
			System.out.println(st4.nextToken());
		}
		
//		사과(1,000원)
		StringTokenizer st5 = new StringTokenizer(str4, "=,");
		String str = "";
		
		while(st5.hasMoreTokens())
		{
			str += st5.nextToken() + " ";
		}
		System.out.println(str);
		String[] data = str.split(" ");
		System.out.println(Arrays.toString(data));
		
		for(int i=0;i<data.length;i++) {
			if (i%2 == 0) {
				System.out.print(data[i]+" ");
			}
			else {
				DecimalFormat df = new DecimalFormat("(#,##0원)");
				System.out.println(df.format(Integer.parseInt(data[i])));
			}
		}
	}
}
