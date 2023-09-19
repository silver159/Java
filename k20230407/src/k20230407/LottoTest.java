package k20230407;

import java.util.Random;

public class LottoTest
{
	public static void main(String[] args)
	{
		int lotto[] = new int[45];
		
		for (int i=0; i<lotto.length; i++)
		{
			lotto[i] = i+1;
		}
		for(int i=0; i<lotto.length; i++)
		{
			System.out.printf("%2d ",lotto[i]);
			if((i+1)%10 ==0) {
				System.out.println();
			}
		}
		System.out.println("\n=============================");
		
		Random random = new Random();
		for (int i=0; i<10000; i++)
		{
			int r = random.nextInt(44)+1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for(int i=0; i<lotto.length; i++)
		{
			System.out.printf("%2d ",lotto[i]);
			if((i+1)%10 ==0) {
				System.out.println();
			}
		}		
		System.out.println("\n=============================");
		System.out.print("1등 번호: ");
		for (int i=0; i <6; i++)
		{
			System.out.printf("%2d ",lotto[i]);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.printf("\n보너스 번호: %2d ",lotto[6]);
	}
}
