package k20230406;

import java.util.Random;

public class RandomTest
{
	public static void main(String[] args)
	{
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println("======================================");
		Random random = new Random();
//		System.out.println(random.nextDouble());
		System.out.println(random.nextInt(45)+1);
		System.out.println(random.nextInt(45)+1);
		System.out.println(random.nextInt(45)+1);
		System.out.println(random.nextInt(45)+1);
		System.out.println(random.nextInt(45)+1);
		System.out.println(random.nextInt(45)+1);
		
	}
}
