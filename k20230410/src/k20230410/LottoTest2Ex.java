package k20230410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTest2Ex
{
	public static void main(String[] args)
	{
		int[] lotto = new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력해주세요: ");
		int money = scanner.nextInt();
		
		for(int i=0;i<money/1000;i++)
		{
			for(int j=0; j<100000; j++) {
			int r = random.nextInt(44)+1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
			}
			
			for (int j=0; j<5; j++) 
			{
				for(int k=j+1; k<6; k++)
				{
					if(lotto[j]>lotto[k])
					{
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
					}
				}
			}
			
			
			System.out.printf("%3d GAME: ", i+1);
			for(int j=0; j<6;j++)
			{
				System.out.printf("%02d ",lotto[j]);
			}
			System.out.println();
			if ((i+1)%5==0) {
				System.out.println("============================");
			}
			
		}
		
		
	}
}
