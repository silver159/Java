package k20230412;

public class StringTestEx
{
	public static void main(String[] args)
	{
		String str1 = "AAA";
		String str2 = "AAA";
		
		if(str1 == str2) {
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		String str3 = new String("AAA");
		
		if(str1 == str3) {
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		if(str1.equals(str3)) {
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
	}
}
