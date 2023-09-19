package k20230412;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodT {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "    tjoeunit    ";
//		length(): 문자열을 구성하는 문자의 개수를 얻어온다.
		System.out.println("문자 개수: " + str.length());
		
		str = "    tjoeunit    ";
		System.out.println(str);
//		trim(): 문자열 앞, 뒤의 불필요한 빈칸(공백)을 제거한다.
		System.out.println(str.trim());
		System.out.println("불필요한 빈칸을 제거한 문자 개수: " + str.trim().length());
		
//		System.out.print("문자열 입력: ");
//		데이터 입력 단계에서 불필요한 공백을 제거하고 입력받으려면 아래와 같이 trim() 메소드를
//		사용하면 된다.
//		String name = scanner.nextLine().trim();
//		System.out.println(name);
		
		str = "8304223185600";
//		charAt(index): 문자열에서 지정된 index 번째 위치의 문자를 얻어온다.
//		index는 0부터 시작한다.
		System.out.println("성별: " + str.charAt(6));
		
//		키보드로 1문자만 입력받으려면 아래와 같이 실행한다.
//		char ch = scanner.nextLine().charAt(0);
//		System.out.println(ch);
		
		str = "TjoeunIT";
//		toUpperCase() 메소드는 영문자를 무조건 대문자로 변환하고 toLowerCase() 메소드는 영문자를
//		무조건 소문자로 변환한다.
		System.out.println("무조건 대문자로: " + str.toUpperCase());
		System.out.println("무조건 소문자로: " + str.toLowerCase());
		
		str = "8304223185600";
//		substring(a): 문자열의 a번째 index의 문자부터 문자열의 끝까지 얻어온다.
//		substring(a, b): 문자열의 a번째 index의 문자부터 b - 1번째 index의 문자까지 얻어온다.
		System.out.println("주민등록번호 뒷자리: " + str.substring(6));
		System.out.println(str.substring(0, 7) + "******");
		System.out.println("생년: " + str.substring(0, 2));
		System.out.println("월: " + str.substring(2, 4));
		System.out.println("일: " + str.substring(4, 6));
		
		str = "itTjoeunit";
//		indexOf(): 문자열의 왼쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는 index를 얻어온다.
//		lastIndexOf(): 문자열의 오른쪽부터 검색해서 인수로 지정한 문자열이 최초로 나타나는 index를 얻어온다.
		System.out.println(str.indexOf("it"));
		System.out.println(str.lastIndexOf("it"));
//		indexOf(), lastIndexOf() 메소드의 인수로 지정한 문자열이 없으면 -1을 리턴한다.
		System.out.println(str.indexOf("It"));
		System.out.println(str.lastIndexOf("IT"));
//		indexOf(), lastIndexOf() 메소드의 실행 결과가 0이상이면 인수로 지정된 문자열이 포함되었다는
//		의미로 사용할 수 있다.
		
		str = "itTjoeunit";
//		contains(): 문자열에 인수로 지정한 문자열이 포함되어 있으면 true, 없으면 false를 리턴한다.
		System.out.println(str.contains("it"));
		System.out.println(str.contains("IT"));
		
		str = "abc 123 가나다";
//		split("구분자"): 문자열을 구분자를 경계로 나눠서 배열로 리턴한다.
		System.out.println(str.split(" "));
		System.out.println(str.split(" ").length);
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(str.split(" ")[0]);
		
		str = "itTjoeunit";
//		replace(a, b): 문자열의 모든 a를 b로 치환한다.
		System.out.println(str.replace("i", "아이"));
		
		str = "8304223185600";
//		repeat(): 문자열을 인수로 지정한 개수만큼 반복한다.
		System.out.println(str.substring(0, 7) + "*".repeat(6));
		
		str = "123-45678-12345";
		
		
	}
	
}











