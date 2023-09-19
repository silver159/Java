package k20230406;

import java.util.Random;
import java.util.Scanner;

public class MukJjiBba
{

	public static void main(String[] args)
	{
//		가위(1),바위(2),보(3)
		Random random = new Random();
		int cpu = random.nextInt(3)+1;
//		System.out.println(cpu);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(1),바위(2),보(3):");
		int user = scanner.nextInt();
		
		// &&가 ||보다 우선순위 높다.
		if (cpu == 1 && user ==2 || cpu == 2 && user ==3 || cpu == 3 && user ==1){  
			System.out.println("이겼습니다.");
		}else if (cpu == user) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}

	}

}
