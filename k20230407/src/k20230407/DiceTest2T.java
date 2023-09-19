package k20230407;

import java.util.Random;

public class DiceTest2T {

	public static void main(String[] args) {
		
		Random random = new Random();
//		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
//		주사위 눈의 개수를 기억할 배열을 선언만 한다. => 모두 0으로 자동 초기화 된다.
//		num[0] => 1의 개수, num[1] => 2의 개수, ..., num[5] => 6의 개수
		int[] num = new int[6];
		
		for (int i=0; i<10; i++) {
			int dice = random.nextInt(6) + 1;
			System.out.println(dice);
			
//			switch (dice) {
//				case 1:
//					num[0]++; break;
//				case 2:
//					num[1]++; break;
//				case 3:
//					num[2]++; break;
//				case 4:
//					num[3]++; break;
//				case 5:
//					num[4]++; break;
//				case 6:
//					num[5]++; break;
//			}
			num[dice - 1]++;
		}
		
//		System.out.println("1의 개수: " + num[0]);
//		System.out.println("2의 개수: " + num[1]);
//		System.out.println("3의 개수: " + num[2]);
//		System.out.println("4의 개수: " + num[3]);
//		System.out.println("5의 개수: " + num[4]);
//		System.out.println("6의 개수: " + num[5]);
		
		for (int i=0; i<num.length; i++) {
			System.out.println(i + 1 + "의 개수: " + num[i]);
		}
		
	}
	
}












