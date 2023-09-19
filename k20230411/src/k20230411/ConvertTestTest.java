package k20230411;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTestTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("변환할 숫자와 진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int abc = scanner.nextInt();
		int number = dec;
		
		int[] hex = new int[8];
		int index = 0;
		
		while(true)
		{
			int m = dec/abc; // 몫
			int r = dec%abc; // 나머지
			hex[index++] = r;
			if (m == 0) {break;}
			dec = m;
		}
		
		char[] h = new char[36];
		for (int i=0;i<36;i++)
		{
			if(i<10)
			{
				h[i] = (char) (i+48);
			}
			else
			{
				h[i] = (char) (i+55);
			}
		}
		System.out.println(Arrays.toString(h));
		
		
		System.out.print(number + "를(을)" +abc+"진수로 변환하면 ");
		for(int i=index -1;i>=0;i--)
		{
			System.out.print(h[hex[i]]);
		}
		System.out.println(" 입니다.");
	}
}
