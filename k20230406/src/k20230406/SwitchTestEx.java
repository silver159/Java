package k20230406;

import java.util.Scanner;

public class SwitchTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 순서대로 점수를 입력하세요:");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();

		int total = eng+math+kor;
		double avg = (double)total / 3;
		
		switch((int)avg/10) {
		case 10:
			System.out.println("참 잘했어요");
		case 9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		case 6:
			System.out.println("D학점");break;
		default:
			System.out.println("F학점");
		}
	}
}
