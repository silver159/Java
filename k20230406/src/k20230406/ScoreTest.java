package k20230406;

import java.util.Scanner;

public class ScoreTest
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("국어점수: ");
		int kor = scanner.nextInt();
		System.out.print("영어점수: ");
		int eng = scanner.nextInt();
		System.out.print("수학점수: ");
		int math = scanner.nextInt();
		*/
		System.out.print("국어, 영어, 수학 순서대로 점수를 입력하세요:");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		int total = eng+math+kor;
		double avg = (double)total / 3;
		
		System.out.println("총점: " +total + "점, 평균: "+avg);
		System.out.printf("총점: %3d점, 평균: %6.2f%n", total,avg);
				
		if (avg >= 90) {
			System.out.println("당신의 학점은 A");
		}
		if (avg <90 && avg >= 80) {
			System.out.println("당신의 학점은 B");
		}
		if (avg <80 && avg >= 70) {
			System.out.println("당신의 학점은 C");
		}
		if (avg <70 && avg >= 60) {
			System.out.println("당신의 학점은 D");
		}
		if (avg <60 ) {
			System.out.println("당신의 학점은 F");
		}
		
		
		if (avg >= 90) {
			System.out.println("당신의 학점은 A");
		}
		else if (avg <90 && avg >= 80) {
			System.out.println("당신의 학점은 B");
		}
		else if (avg <80 && avg >= 70) {
			System.out.println("당신의 학점은 C");
		}
		else if (avg <70 && avg >= 60) {
			System.out.println("당신의 학점은 D");
		}else {
			System.out.println("당신의 학점은 F");
		}
		
		
		if (avg >= 90) {
			System.out.println("당신의 학점은 A");
		}
		else if (avg >= 80) {
			System.out.println("당신의 학점은 B");
		}
		else if (avg >= 70) {
			System.out.println("당신의 학점은 C");
		}
		else if (avg >= 60) {
			System.out.println("당신의 학점은 D");
		}else {
			System.out.println("당신의 학점은 F");
		}

	}

}
