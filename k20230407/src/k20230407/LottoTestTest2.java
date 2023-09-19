package k20230407;

import java.util.Random;

public class LottoTestTest2
{
	public static void main(String[] args)
	{
		int ball[] = new int[69];
		int bonus[] = new int[26];
		
		for (int i=0; i<ball.length; i++)
		{
			ball[i] = i+1;
		}
		for (int i=0; i<bonus.length; i++)
		{
			bonus[i] = i+1;
		}

		Random random = new Random();
		for (int i=0; i<10000; i++)
		{
			int r = random.nextInt(68)+1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		for (int i=0; i<10000; i++)
		{
			int r = random.nextInt(25)+1;
			int temp = bonus[0];
			bonus[0] = bonus[r];
			bonus[r] = temp;
		}
		
		for (int i = 0; i<5; i++) {
			System.out.printf("%3d",ball[i]);
		}
		System.out.printf("%3d",bonus[0]);
	}
}
