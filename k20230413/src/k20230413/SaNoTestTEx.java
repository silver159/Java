package k20230413;

import java.util.Scanner;

public class SaNoTestTEx
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("사업자등록번호 10자리를 '-'없이 입력하세요: ");
		String sa = scanner.nextLine().trim();
//		2208162517 => 네이버 사업자등록번호
		String check = "137137135"; // 가중치
		int sum = 0;
		
		for (int i =0;i<9;i++)
		{
			sum+=Integer.parseInt(sa.charAt(i)+"")*Integer.parseInt(check.charAt(i)+"")%10;
		}
		sum+=Integer.parseInt(sa.charAt(8)+"")*Integer.parseInt(check.charAt(8)+"")/10;
		sum+=Integer.parseInt(sa.charAt(9)+"");
		System.out.println(sum%10 ==0?"정상":"오류");
	}
}
