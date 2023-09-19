package k20230417;

import java.util.Scanner;

public class MagicSquareTestTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("마방진 차수를 입력하세요: ");
		int row = scanner.nextInt();

		int[][] a = new int[row][row];
		int n = 1, i = 0, j = row / 2;

		a[i][j] = n;
			for (int p = 1; p < Math.pow(row, 2); p++)
			{
				if(n%row==0){++i;}
				else 
				{
				if (--i < 0){i = row-1;}
				if (++j > row-1){j = 0;}
				}
				a[i][j] = ++n;
			}
		for (i = 0; i < a.length; i++)
		{
			for (j = 0; j < a[i].length; j++)
			{
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
