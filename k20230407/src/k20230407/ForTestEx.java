package k20230407;

public class ForTestEx
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=1;i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10의 합계 = "+sum);
		
		int a =1,b,c;
		b = a++;
		c = ++a;
		
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		
		int d=1, e;
		e = ++d + ++d+ ++d+ ++d;
				System.out.println("d = "+d+", e = "+e);
	}
}
