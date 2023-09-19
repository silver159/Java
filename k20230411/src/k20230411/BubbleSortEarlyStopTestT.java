package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTestT {

	public static void main(String[] args) {
		
//		int[] data = {8, 3, 4, 9, 1};
		int[] data = {9, 1, 3, 4, 8};
		
		for (int i=0; i<data.length - 1; i++) {
			
//			flag라는 이름의 변수를 만들어 true로 초기화 한다.
			boolean isFlag = true;
			
			for (int j=0; j<data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					
//					값 교환이 이루어지면 flag 변수에 false를 저장한다.
					isFlag = false;
					
				}
			}
			
//			정렬이 완료된 경우 값교환 작업이 진행되지 않기때문에 flag 변수는 true를 유지하게 된다.
			if (isFlag) {
//				정렬이 완료된 상태라면 더 이상 회전할 필요가 없으므로 i반복을 탈출한다.
				break;
			}
			
			System.out.println(i + 1 + "회전 결과: " + Arrays.toString(data));
			
		}
//		System.out.println("정렬 결과: " + Arrays.toString(data));
		
	}
	
}
