package k20230410;

import java.util.Scanner;

public class FibonacciTestEx
{
	public static void main(String[] args)
	{
		int a=1,b=1,y=2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("n입력: ");
		int n = scanner.nextInt();
		
		for (int k = 3; k<=n; k++)
		{
			int c = a + b;
			y += c;
			a = b;
			b = c;
		}
		System.out.println(y);
		
	}
}
