package k20230411;

import java.util.Arrays;

public class BubbleSortTest
{
	public static void main(String[] args)
	{
		int[] data = {9,1,3,4,8};
		for (int i=0; i<data.length-1; i++) // 회전수
		{
			for(int j=0; j<data.length-1-i; j++) // 비교 위치 설정
			{
				if(data[j]>data[j+1])
				{
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			System.out.println(i+1+"회전 결과: "+Arrays.toString(data));
		}
		System.out.println(" 정렬 결과: "+Arrays.toString(data));
	}
}
