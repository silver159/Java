package k20230410;

import java.util.Arrays;

public class SelectionSortTest
{
	public static void main(String[] args)
	{
		int[] data = {8,3,4,9,1};
		for (int i=0; i<data.length-1; i++) //i의 의미: 선택 위치, 회전수
		{
			for(int j=i+1; j<data.length; j++)// 선택 위치의 데이터와 비교할 대상이 되는 데이터 위치
			{
//				오름차순 정렬
//				앞(i번째)의 데이터가 뒤(j번째)의 데이터보다 크다면 두 기억장소의 값을 교환
//				내림차순 정렬
//				앞(i번째)의 데이터가 뒤(j번째)의 데이터보다 작다면 두 기억장소의 값을 교환
//				부등호가 >면 오름차순 정렬, <면 내림차순 정렬
				if(data[i]>data[j])
				{
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}//회전 종료
			System.out.println(i+1+"회전 결과: "+Arrays.toString(data));
		}//정렬 종료
		System.out.println("정렬 결과: "+Arrays.toString(data));
	}
}
