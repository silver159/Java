package k20230406;

import java.util.Scanner;

public class ScannerTest3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("continue?(y/n)");
		char confirm = scanner.next().charAt(0);
		System.out.println(confirm);
	}
}
