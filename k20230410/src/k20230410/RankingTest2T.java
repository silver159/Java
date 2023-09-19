package k20230410;

public class RankingTest2T {

	public static void main(String[] args) {
		
		int[] score = {80, 100, 70, 95, 94};
		int[] rank = new int[score.length];
		for (int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
		for (int i=0; i<score.length - 1; i++) {
			for (int j=i+1; j<score.length; j++) {
				
//				i번째 점수가 크면 j번째 석차를 증가시키고 j번째 점수가 크면 i번째 석차를 증가시킨다.
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
				
			}
		}
		
		for (int i=0; i<score.length; i++) {
			System.out.printf("%3d점은 %d등 입니다.", score[i], rank[i]);
//			별점 출력
			for (int j=0; j<score[i] / 10; j++) {
				System.out.print("★");
			}
			if (score[i] % 10 >= 5) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}
	
}






