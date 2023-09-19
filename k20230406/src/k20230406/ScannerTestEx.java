package k20230406;

import java.util.Scanner;

public class ScannerTestEx
{
	public static void main(String[] args)
	{
		int num;
		num = 100;
		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주소: ");
		String addr = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name+ "님의 주소는 "+addr+"입니다.");
	}
}
