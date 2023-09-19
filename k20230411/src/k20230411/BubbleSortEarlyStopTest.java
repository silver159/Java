package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTest
{
	public static void main(String[] args)
	{
		
//		int[] data = {8,3,4,9,1};
		int[] data = {9,1,3,4,8};
		for (int i=0; i<data.length-1; i++) // 회전수
		{
//			a
//			int flag = 0; //boolean 사용 가능
			boolean isFlag = true;
			for(int j=0; j<data.length-1-i; j++) // 비교 위치 설정
			{
				if(data[j]>data[j+1])
				{
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
//					b
					isFlag = false;
				}
			}
//			c
			if (isFlag) 
			{
				break;
			}
			System.out.println(i+1+"회전 결과: "+Arrays.toString(data));
		}
		System.out.println(" 정렬 결과: "+Arrays.toString(data));
	}
}
