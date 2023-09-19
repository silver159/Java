package k20230411;

import java.util.Scanner;

public class ConvertTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("2진수로 변환할 10진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int number = dec;
		
		int[] bin = new int[8];
		int index = 0;
		
		while(true)
		{
			int m = dec/2; // 몫
			int r = dec%2; // 나머지
			bin[index++] = r;
			if (m == 0) {break;}
			dec = m;
		}
		
		System.out.print(number + "를(을) 2진수로 변환하면 ");
		for(int i=bin.length-1;i>=0;i--)
		{
			System.out.print(bin[i]);
		}
		System.out.println(" 입니다.");
		
		System.out.print(number + "를(을) 2진수로 변환하면 ");
		for(int i=index -1;i>=0;i--)
		{
			System.out.print(bin[i]);
		}
		System.out.println(" 입니다.");

		
		
	}
}
