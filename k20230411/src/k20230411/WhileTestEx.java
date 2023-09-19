package k20230411;

public class WhileTestEx
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=1;i<=10;i++) 
		{
			sum+=i;
		}
		System.out.println("1 ~ 10의 합계: " + sum);
		
		sum = 0;
		int i = 1;
		while(i<=10)
		{
			sum += i++; // sum +=i; i++ 한번에!!!
		}
		System.out.println("1 ~ 10의 합계: " + sum);
		
		sum = i = 0;
		do
		{
			i++;
			sum+=i;
		}
		while(i<10);
		System.out.println("1 ~ 10의 합계: " + sum);
	}
}
