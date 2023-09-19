package k20230411;

import java.util.Arrays;

public class StnT {

	public static void main(String[] args) {
		
		int[] data = {4, 2, 5, 1, 3};
		
		/*
//		최대값을 기억할 기억장소는 아주 작은 값을, 최소값을 기억할 기억장소는 아주 큰 값을 초기치로 지정한다.
		int max = 0;
		int min = 100;
		
		for (int i=0; i<data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			}
		}
		*/
		
		/*
//		최대값과 최소값을 기억할 기억장소에 각각 데이터가 저장된 배열의 0번째 인덱스 요소의 값으로 초기화 한다.
		int max = data[0];
		int min = data[0];
		
//		i가 1부터 시작하는 이유는 최대값과 최소값을 기억할 변수에 배열의 0번째 인덱스의 값을 초기치로 지정했고
//		자기 자신끼리 비교해봐야 최대값과 최소값을 판별하는데 전혀 도움이 되지 않기 때문이다.
		for (int i=1; i<data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			} else if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.printf("최대값: %d, 최소값: %d\n", max, min);

//		전체 데이터의 합계를 계산한 후 최대값과 최소값을 뺀다.
		int sum = 0;
		for (int i=0; i<data.length; i++) {
			sum += data[i];
		}
		sum -= max + min;
		double avg = (double) sum / (data.length - 2);
		System.out.printf("합계: %d, 평균: %f\n", sum, avg);
		*/
		
//		오름차순으로 정렬하면 0번째 인덱스의 값이 최소값, n-1번째 인덱스의 값이 최대값이 된다.
//		내림차순으로 정렬하면 0번째 인덱스의 값이 최대값, n-1번째 인덱스의 값이 최소값이 된다.
		for (int i=0; i<data.length - 1; i++) {
			for (int j=0; j<data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(data));
		
//		최대값과 최소값을 제외한 나머지 데이터의 평균을 계산한다.
		int sum = 0;
//		0번째 인덱스에는 최소값이 n-1번째 인덱스에는 최대값이 저장되어 있으므로 최대값과 최소값이 저장된
//		인덱스는 제외하고 합계를 계산한다.
		for (int i=1; i<data.length - 1; i++) {
			sum += data[i];
		}
		double avg = (double) sum / (data.length - 2);
		System.out.printf("합계: %d, 평균: %f\n", sum, avg);
		
//		분산과 표준편차를 계산한다.
		double stn = 0.0;
		for (int i=1; i<data.length - 1; i++) {
//			최대값과 최소값을 제외한 각 데이터에서 평균을 뺀 편차
			double temp = data[i] - avg;
//			최대값과 최소값을 제외한 각 데이터에서 평균을 뺀 편차의 제곱
//			stn += temp * temp;
			stn += Math.pow(temp, 2);
		}
		
		double var = stn / (data.length - 2);
		System.out.printf("최대값과 최소값을 제외한 나머지 데이터의 분산: %f\n", var);
//		double std = Math.pow(var, 0.5);
		double std = Math.sqrt(var);
		System.out.printf("최대값과 최소값을 제외한 나머지 데이터의 표준편차: %f\n", std);
		
	}
	
}







