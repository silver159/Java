package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciTest2
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 항수를 입력하세요: ");
		int n = scanner.nextInt();
		int fibo[] = new int[n];
//		System.out.println(Arrays.toString(fibo));
		fibo[0] = 1;
		fibo[1] = 1;
		int y=2;
		
		for(int k = 2; k < n; k++)
		{
			fibo[k] = fibo[k-2] + fibo[k-1];
			y += fibo[k];
		}
		System.out.println(Arrays.toString(fibo));
		System.out.printf("피보나치 수열의 %d번째 항 까지의 합계: %d = ",n,y);
		
		for(int i =0; i<fibo.length-1; i++)
		{
			System.out.print(fibo[i]+ " + ");
		}
		System.out.println(fibo[fibo.length-1]);
		System.out.println("==========================");
		for(int i =0; i<fibo.length; i++)
		{
			if(i>0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		System.out.println();
	}
}
