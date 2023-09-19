package k20230410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTest2
{

	public static void main(String[] args)
	{

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = i + 1;
		}
		Random random = new Random();

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력해주세요 :");
		int money = scanner.nextInt();
		int num = money / 1000;

		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < 1000000; j++)
			{
				int r = random.nextInt(44) + 1;
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
//			정렬한다.
		
			int data[] = new int[6];
			for(int j=0;j<6;j++)
			{
				data[j] = lotto[j];
			}
//			Arrays.sort(data);
			
			for (int j=0; j<5; j++) 
			{
				for(int k=j+1; k<6; k++)
				{
					if(data[j]>data[k])
					{
						int temp = data[j];
						data[j] = data[k];
						data[k] = temp;
					}
				}
			}

			System.out.printf("%3d GAME: ", i +1);
			for (int j = 0; j < 6; j++)
			{
				System.out.printf("%02d ", data[j]);

			}
			System.out.println();
			if ((i + 1) % 5 == 0) {
				System.out.println("============================");
			}
		}

	}

}
