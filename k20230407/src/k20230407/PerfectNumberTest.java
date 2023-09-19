package k20230407;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectNumberTest
{
	public static void main(String[] args)
	{
		int perfect = 0;
//		int perNum[] = new int[4];
		//4~10000까지 완전수 찾기
		for (int i =4; i<=10000; i++)
		{ 	int sum = 0;
			for( int j = 1; j<=i/2;j++ ) 
			{ 
				if (i%j == 0) 
				{
					sum += j;
				}
				
			}
			if(sum == i) 
			{
				System.out.println(i);
//				perNum[perfect] = i;
				perfect++;
			}
			
		}
		System.out.println("4~10000 사이의 완전수의 갯수는: " + perfect);
//		System.out.println(Arrays.toString(perNum));
		
	}
}
