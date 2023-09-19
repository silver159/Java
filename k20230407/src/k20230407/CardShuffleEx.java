package k20230407;

import java.util.Arrays;
import java.util.Random;

public class CardShuffleEx
{
	public static void main(String[] args)
	{
		int cards[] = new int[52];
		for(int i=0;i<cards.length;i++)
		{
			cards[i]=i;
		}
		
//		for(int i=0; i<cards.length;i++) {
//			if(i%13==0)
//			{
//				System.out.printf("%n%2d ", cards[i]);
//			}else
//			{
//				System.out.printf("%2d ", cards[i]);
//			}
//		}
		String number[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String symbol[] = {"♠","◇","♥","♧"};
		
		cardSuffle(cards, number, symbol);
		System.out.println("====================================================섞기전");
		Random random = new Random();
		for(int i=0;i<=10000;i++)
		{
			int r = random.nextInt(51)+1;
			int temp = cards[0];
			cards[0] = cards[r];
			cards[r] = temp;
		}
		
		cardSuffle(cards, number, symbol);
		System.out.println("====================================================섞은후");
	}

	private static void cardSuffle(int[] cards, String[] number, String[] symbol)
	{
		for(int i=0; i<cards.length;i++)
		{
			System.out.printf("%s%2s ",symbol[cards[i]/13],number[cards[i]%13]);
			if((i+1)%13 == 0)
			{
				System.out.println();
			}
		}
	}	
}
