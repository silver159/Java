package k20230411;

import java.util.Arrays;

public class StnEx1
{
	public static void main(String[] args)
	{
		int[] data = {4,1,3,5,2};
		
//		int max = 0;
//		int min = 100;
//		for(int i=0;i<data.length;i++)
//		{
//			if(data[i]>max) 
//			{
//				max = data[i];
//			}
//			if(data[i]<min)
//			{
//				min = data[i];
//			}
//		}
//		
//		int max = data[0];
//		int min = data[0];
//		for(int i=1;i<data.length;i++)
//		{
//			if(data[i]>max) 
//			{
//				max = data[i];
//			}
//			else if(data[i]<min)
//			{
//				min = data[i];
//			}
//		}	
//		System.out.printf("최대값: %d, 최소값: %d%n",max,min);
//		int sum = 0;
//		for (int i = 0; i<data.length;i++)
//		{
//			sum += data[i];
//		}
//		sum-= max+min;
//		double avg = sum/(data.length-2);
//		
		
//		진짜 코드
		int sum = 0;
		double stn = 0;
		double avg;
		for(int i=0; i<data.length-1;i++)
		{
			for(int j=0; j<data.length-1-i;j++)
			{
				if(data[j]>data[j+1])
				{
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int i = 1; i<data.length-1;i++)
		{
			sum+=data[i];
		}
		avg = (double)sum / (data.length-2);
		
		for(int i = 1; i<data.length-1;i++)
		{
			double temp = data[i]-avg;
			stn += Math.pow(temp, 2);
		}
		stn = Math.sqrt(stn/(data.length-2));
		System.out.println(stn);
		
	}
}
