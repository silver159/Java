package k20230406;

import java.util.Scanner;

public class ScoreTestEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3;
		
		System.out.println("총점: "+total+"평균: "+avg);
		System.out.printf("총점: %3d 평균: %6.2f%n", total, avg);
		
		if(avg>=90) {
			System.out.println("당신의 학점은 A");
		}
		else if(avg>=80) {
			System.out.println("당신의 학점은 B");
		}
		else if(avg>=70) {
			System.out.println("당신의 학점은 C");
		}
		else if(avg>=60) {
			System.out.println("당신의 학점은 D");
		}
		else {
			System.out.println("당신의 학점은 F");
		}
	}
}
