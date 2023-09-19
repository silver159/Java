package k20230410;

public class StarTestEx
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j+i<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j+i<4;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j+i<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j+2*i<7 ;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==4)break;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
