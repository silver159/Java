package k20230411;

import java.util.Arrays;

public class StnEx
{
	public static void main(String[] args)
	{
		int[] data = {5,2,3,1,4};
		int sum = 0;
		double avg = 0.0;
		double stn = 0.0;
		int n = data.length;
		for(int i=0;i<n-1;i++)
		{	for(int j=0;j<n-1-i;j++)
			{
				if(data[j]>data[j+1])
				{
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for (int i=1;i<n-1;i++)
		{
			sum += data[i];
		}	
			avg = (double)sum/(n-2);
		System.out.printf("합계: %d, 평균: %f%n",sum,avg);
			
		for (int i=1;i<n-1;i++)	
		{
			stn =  Math.pow(data[i]-avg,2);
			stn += stn;
		}
		stn =Math.sqrt(stn/(n-2));
		
		System.out.println("결과: "+stn);
	}
}
