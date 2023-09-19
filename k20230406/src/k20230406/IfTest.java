package k20230406;

import java.util.Scanner;

public class IfTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();

		if (age >= 18)
		{
			System.out.println("투표권이 있습니다.");
		} else
		{
			System.out.println("투표권이 없습니다.");
		}

	}
}
