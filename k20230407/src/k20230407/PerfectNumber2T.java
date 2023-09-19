package k20230407;

public class PerfectNumber2T {

	public static void main(String[] args) {
		
		int lm = 0; // 완전수의 개수를 기억할 변수
		
		for (int n=4; n<=10000; n++) { // 완전수인가 판단할 수
			int sum = 0; // 자신을 제외한 약수의 합계를 기억할 변수
//			모든 숫자는 자기 자신을 제외하고 나눠서 떨어뜨릴 수 있는 가장 큰 수는 자신의 절반을
//			넘지 않는다.
			int k = n / 2;
			
			for (int j=1; j<=k; j++) {
//				완전수인가 판단할 수(n)의 약수를 판단하기 위해 j로 나눈 나머지를 계산한다.
				int r = n % j;
				if (r == 0) { // j가 n의 약수인가?
//					j가 n의 약수면 n의 약수의 합계를 계산한다.
					sum += j;
				}
			}
			
//			완전수인가 판단한다.
			if (n == sum) { // n이 완전수인가?
				System.out.printf("%d번째 완전수 => %4d\n", lm + 1, n);
				lm++; // 완전수의 개수를 1증가 시킨다.
			}
			
		}
		
		System.out.printf("4 ~ 10000 사이의 완전수는 %d개 입니다.\n", lm);
		
	}
	
}



