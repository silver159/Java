package k20230410;

import java.util.Random;

public class PowerballTestEx
{
	public static void main(String[] args)
	{
		int[] powerball = new int[69];
		
		for(int i=0;i<powerball.length;i++)
		{
			powerball[i]=i+1;
		}
		
		Random random = new Random();
		for(int i = 0; i<100000; i++)
		{
			int r = random.nextInt(68)+1;
			int temp = powerball[0];
			powerball[0] = powerball[r];
			powerball[r] = temp;
		}
		System.out.print("흰공: ");
		for (int i =0;i<5;i++)
		{
			System.out.printf("%2d ",powerball[i]);
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.printf("빨간공: %2d", random.nextInt(26)+1);
		
	}
}
