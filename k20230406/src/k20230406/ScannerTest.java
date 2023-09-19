package k20230406;

import java.util.Scanner;

public class ScannerTest
{

	public static void main(String[] args)
	{
		int num;
		num = 100;
		System.out.println(num);

// ctrl + shift + f : 정렬

		Scanner scanner = new Scanner(System.in);// in 키보드 out 모니터

		System.out.print("주소: ");
		
		String addr = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 "+ addr + "에 삽니다.");

	}

}
