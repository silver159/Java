package k20230414;

import java.util.Scanner;

public class SnailTest2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("행렬의 차수를 입력하세요: ");
		int row = scanner.nextInt();
		
		int[][] a = new int[row][row];		
		int n=1;
		int s=1;
		int i=row/2;
		int j=row/2;
		int k=0;
		
		a[i][j]=n;
//		boolean flag = false;
		
		
		EXIT: // while(true) 반복에 레이블을 지정한다.
		while(true)
		{
//			k++; //3시 방향부터 채우기
			for(int p=1;p<=k;p++)
			{
				if (++n>Math.pow(row, 2))
				{
//					flag = true;
//					break;// for(int p=1;p<=k;p++) 반복을 탈출한다.
					break EXIT; //break 뒤에 레이블을 적어주면 레이블이 지정된 반복을 탈출한다.
				}
				j+=s;
				a[i][j] = n;
			}
//			if (flag) {break;}
			for(int p=1;p<=k;p++)
			{
				i+=s;
				a[i][j] = ++n;
			}
			s*=-1; //부호 변경
			k++; //9시 방향부터 채우기
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