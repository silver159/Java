package k20230412;

import java.util.Scanner;

public class SosooTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인가 판단할 숫자를 입력하세요: ");
		int n = scanner.nextInt();
		
		int i;
		for (i=2; i<=n;i++)
		{
			if(n%i == 0){break;}
		}
		
		if(i == n)
		{
			System.out.println(n+"은(는) 소수입니다");
		}
		else
		{
			System.out.println(n+ "은(는) 소수가 아닙니다.");
		}
	}
}
