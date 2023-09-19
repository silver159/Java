package k20230407;

import java.util.Random;

public class CardShuffle
{
	public static void main(String[] args)
	{
//		두 기억장소에 저장된 값 교환하기
//		int a = 3, b = 4;
//		System.out.println("a = "+ a+", b = "+b);
//		
//		int temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a = "+ a+", b = "+b);
		
//		cards 라는 int형 배열을 만들고 0~51로 초기화 한다.
		
		int cards[] = new int[52];
		
		for (int i=0; i<cards.length; i++)
		{
			cards[i] = i;
		}
//		System.out.println(Arrays.toString(cards));
		
//		카드 출력에 사용할 숫자와 무늬를 기억하는 배열을 만든다.

		
		
//		섞기전 상태를 출력한다.
		
		for(int i=0; i<13; i++)
		{
			System.out.printf("%2d ",cards[i]);
		}
		System.out.println();
		for(int i=13; i<26; i++)
		{
			System.out.print(cards[i]+" ");
		}
		System.out.println();
		for(int i=26; i<39; i++)
		{
			System.out.print(cards[i]+" ");
		}
		System.out.println();
		for(int i=39; i<52; i++)
		{
			System.out.print(cards[i]+" ");
		}
		System.out.println();
		
		System.out.println("======================================");
		
		for (int i=0; i<cards.length; i++)
		{
			if (!(i%13 == 0)) 
			{
				System.out.printf("%2d ",cards[i]);
			}
			else 
			{
				System.out.printf("%n%2d ",cards[i]);
			}
		}
		System.out.println();
		System.out.println("======================================");

		String number[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String symbol[] = {"♠","◇","♥","♧"};
		extracted(cards, number, symbol);
		System.out.println();
		System.out.println("=========================================섞기전");
		
		Random random = new Random();
		for (int i=0; i<10000; i++)
		{
			int r = random.nextInt(51)+1;
			int temp = cards[0];
			cards[0] = cards[r];
			cards[r] = temp;
			
		}
		
		extracted(cards, number, symbol);
		
		System.out.println();
		System.out.println("=========================================섞은후");
		
		
	}

	private static void extracted(int[] cards, String[] number, String[] symbol)
	{
		for (int i=0; i<cards.length; i++)
		{
//			System.out.printf("%s ",symbol[cards[i]/13]);
//			System.out.printf("%2s ",number[cards[i]%13]);
			System.out.printf("%s%-2s ",symbol[cards[i]/13],number[cards[i]%13]);
			if((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
