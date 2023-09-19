package k20230410;

import java.util.Arrays;

public class SelectionSortTestEx
{
	public static void main(String[] args)
	{
		int[] data = {8,3,4,9,1};
		for(int i = 0; i<data.length-1; i++)
		{
			for(int j=i+1;j<data.length; j++)
			{
				if(data[i]>data[j])
				{
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(i+1+"회전 결과: "+Arrays.toString(data));
		}
		System.out.println("정렬 결과: "+Arrays.toString(data));
		
	}
}
