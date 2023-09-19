package k20230407;

import java.util.Random;

public class DiceTest2Ex
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		int num[] = new int[6];
		
		for(int i=0;i<10;i++) 
		{
			int dice = random.nextInt(6)+1;
			num[dice -1]++;
		}
		for (int i=0;i<num.length; i++)
		{
			System.out.println(i+1+"의 개수 "+num[i]);
		}
	}
}
