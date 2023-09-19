package k20230407;

public class PerfectNumber2
{

	public static void main(String[] args)
	{
		int lm = 0;
		for(int n = 4; n<=10000; n++)
		{
			int sum = 0;
			int k = n/2;
			for (int j=1;j<=k;j++) 
			{
				int r = n % j;
				if (r==0)
				{
					sum += j;
				}
				
			}
			if ( n == sum) 
			{
				System.out.printf("%d번째 완전수 => %4d%n", lm + 1, n);
				lm++;
			}
		}
		System.out.printf("4 ~ 10000 사이의 완전수는 %d개 입니다.%n", lm );
		
	}

}
