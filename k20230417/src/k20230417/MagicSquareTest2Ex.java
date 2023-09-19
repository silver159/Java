package k20230417;

import java.util.Scanner;

public class MagicSquareTest2Ex
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n;
		while(true)
		{
			System.out.print("3이상의 홀수를 입력해주세요: ");
			n = scanner.nextInt();
			if(n%2!=0 && n>=3) {break;}
			System.out.println("오류입니다.");
		}
		int[][] a = new int[n][n];

		int i=0,j=n/2;

		for(int k=1;k<=Math.pow(n, 2);k++)
		{
			a[i][j] = k;
			if(k%n==0) {
				i++;
			}
			else
			{
				if(--i == -1)
				{
					i=n-1;
				}

				if(++j==n)
				{
					j=0;
				}
			}
		}
		for(i=0; i<a.length;i++)
		{
			for(j=0; j<a[i].length;j++)
			{
				System.out.printf("%3d ",a[i][j]);
			}
			System.out.println();
		}
	}
}
