package k20230412;

import java.util.Scanner;

public class SoinsooTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("소인수 분해를 할 숫자를 입력하세요: ");
			int n = scanner.nextInt();
			if (n < 2)
			{
				break;
			}
			int[] s = new int[20];
			int number = n;
			int c = 0;
			while (true)
			{
				int k = 2;
				while (true)
				{
					if (n % k == 0)
					{
						break;
					}
					k++;
				}
				s[c++] = k;
				n /= k;

				if (n == 1)
				{
					break;
				}
			}
			if (c == 1)
			{
				System.out.println(number + "는(은) 소수입니다.");
			}
			else
			{
				System.out.print(number+ " = ");
				for(int y=0;y<c-1;y++)
				{
					System.out.print(s[y] + " * ");
				}
				System.out.println(s[c-1]);
			}

		}
		System.out.println("프로그램 종료");
	}
}
