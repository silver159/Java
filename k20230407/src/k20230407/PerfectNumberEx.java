package k20230407;

import java.util.Scanner;

public class PerfectNumberEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("완전수인가 판단할 숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(num==sum)
		{
			System.out.println(num + "는(은) 완전수입니다.");
		}
		else
		{
			System.out.println(num + "는(은) 완전수가 아닙니다.");
		}
	}
}
