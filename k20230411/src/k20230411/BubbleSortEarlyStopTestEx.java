package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTestEx
{
	public static void main(String[] args)
	{
		int[] data = {9,1,3,4,8};
		for(int i=0;i<data.length-1;i++) 
		{
			boolean isFlag = true;
			for(int j=0;j<data.length-1-i;j++)
			{
				if(data[j]>data[j+1])
				{
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					isFlag = false;
				}
				
			}
			if(isFlag) {break;}
			System.out.println(i+1+"회전 결과: "+Arrays.toString(data));
		}
		System.out.println(" 정렬 결과: "+Arrays.toString(data));
		
	}
}
