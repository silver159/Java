package k20230413;

import java.util.Arrays;
import java.util.Scanner;

public class JuminNoTestTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		String num = scanner.nextLine().replace("-", "").trim();
		char[] ch = new char[13];
		for(int i=0; i<13;i++)
		{
			ch[i] = num.charAt(i); 
		}
		int sum = 0;
		for(int i=0; i<12;i++)
		{
			if(i<8)
			{
				sum+=(int)(ch[i]-48) * (i+2);
			}
			else
			{
				sum+=(int)(ch[i]-48) * (i-6);
			}
		}
		int r = (11-sum % 11)%10;
		if(r == (int)(ch[12]-48))
		{
			System.out.println("적절한 주민번호입니다.");
		}
		else
		{
			System.out.println("부적절한 주민번호입니다.");
		}
	}
}
