package k20230407;

import java.util.Random;
import java.util.Scanner;

public class LottoTestTest
{
	public static void main(String[] args)
	{
		int ball[] = new int[45];
		
		for (int i=0; i<ball.length; i++)
		{
			ball[i] = i+1;
		}
//		for(int i=0;i<45;i++) 
//		{
//			System.out.printf("%3d",ball[i]);
//		}
//		System.out.println();
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("랜덤 몇장?");
		getLotto(ball, random);System.out.println();
		getLotto(ball, random);System.out.println();
		getLotto(ball, random);System.out.println();
		getLotto(ball, random);System.out.println();
		getLotto(ball, random);System.out.println();
		
	}

	private static void getLotto(int[] ball, Random random)
	{
		for (int i=0; i<10000; i++)
		{
			int r = random.nextInt(44)+1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		for (int i = 0; i<6; i++) {
			System.out.printf("%3d",ball[i]);
		}
	}
}
