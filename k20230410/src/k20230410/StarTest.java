package k20230410;

import java.util.Scanner;

public class StarTest
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		System.out.println("=======");
//		선생님 방법
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+i<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("=======");
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+i<=3;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======");
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+1<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j+i<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("==========");
		
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			for(int j=0;j+2*i<7;j++)
			{
				System.out.print(" ");
			}

			
			for(int j=0;j<=i;j++)
			{
				if(j==4) { break;}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+1<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j+2*i<=8;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+i<=3;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=0; i<5; i++)
		{
			for(int j=0;j+i<=3;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j+2*i<=6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		내 방법
//		for(int i=4; i>=0; i--)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		System.out.println("=======");
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요: ");
//		int num = scanner.nextInt();
//		
//		for(int i=0; i<num; i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//				
//		}
//		for(int i=num-2; i>=0; i--)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		
	}
}
