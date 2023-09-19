package k20230410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTest2T {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
//		복권 구매 금액을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("복권 구매 금액을 입력하세요: ");
		int money = scanner.nextInt();
		
//		입력한 금액만큼 반복하며 자동 로또 번호를 생성한다.
		for (int j=0; j<money/1000; j++) {
			
			for (int i=0; i<1000000; i++) {
				int r = random.nextInt(44) + 1;
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
			
//			정렬한다.
			int[] lottoNumber = new int[6];
			for (int i=0; i<6; i++) {
				lottoNumber[i] = lotto[i];
			}
//			Arrays.sort(lottoNumber);
			
			for (int i=0; i<5; i++) {
				for (int k=i+1; k<6; k++) {
					if (lottoNumber[i] > lottoNumber[k]) {
						int temp = lottoNumber[i];
						lottoNumber[i] = lottoNumber[k];
						lottoNumber[k] = temp;
					}
				}
			}
			
			System.out.printf("%3d GAME: ", j + 1);
			for (int i=0; i<6; i++) {
				System.out.printf("%02d ", lottoNumber[i]);
			}
			System.out.println();
			
			if ((j + 1) % 5 == 0) {
				System.out.println("----------------------------");
			}
			
		}
		
		
	}
	
}




