package k20230413;

import java.util.Scanner;

public class JuminNoTest4T {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		8304221185600 => 아기공룡 둘리 주민등록번호
//		String check = "234567892345"; // 가중치
		int sum = 0;
		for (int i=0; i<12; i++) {
//			sum += Integer.parseInt(jumin.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "");
//			sum += Integer.parseInt(jumin.charAt(i) + "") * (i < 8 ? i + 2 : i - 6);
			sum += Integer.parseInt(jumin.charAt(i) + "") * (i % 8 + 2);
		}
		System.out.println(sum); // 143
		int result = (11 - sum % 11) % 10;
//		if (result == jumin.charAt(12) - 48) {
//			System.out.println("정상");
//		} else {
//			System.out.println("오류");
//		}
		System.out.println(result == jumin.charAt(12) - 48 ? "정상" : "오류");
		
	}
	
}







