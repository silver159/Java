package k20230411;

import java.util.Scanner;

public class EuclidTest2Ex
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 수를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = 1;
		int high;
		int low;
		if(a>b)
		{
			high = a;
			low = b;
		}
		else
		{
			high = b;
			low = a;
		}
		while(r>0)
		{
			r = high % low;
			high = low;
			low = r;
		}
		int l = a*b/high;
		System.out.println("최대공약수: "+high+"최소공배수: "+l);
		
		
	}
}
