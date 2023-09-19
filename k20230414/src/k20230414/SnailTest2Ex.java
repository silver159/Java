package k20230414;

import java.util.Scanner;

public class SnailTest2Ex
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int[row][row];
		int n=1,s=1,i=row/2,j=row/2,k=0;
		a[i][j] = n;
		EXIT:
		while(true)
		{
//			k++;//3시 방향부터 채우기
			for(int p=1;p<=k;p++)
			{
				if(++n>Math.pow(row, 2)) {break EXIT;}
				j+=s;
				a[i][j] = n;
			}
			for(int p=1;p<=k;p++)
			{
				i+=s;
				a[i][j] = ++n;
			}
			s*=-1;
			k++;//9시방향부터 채우기
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.printf(" %2d ",a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
