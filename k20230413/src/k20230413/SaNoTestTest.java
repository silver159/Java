package k20230413;

import java.util.Scanner;

public class SaNoTestTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("사업자등록번호 10자리를 '-'없이 입력하세요: ");
		String num = scanner.nextLine().trim();
		int sum = 0;
		
		for (int i=0; i<9; i++)
		{
			switch(i)
			{
			case 0:case 3:case 6:
				sum += (Integer.parseInt(num.charAt(i)+""))%10;System.out.println(sum);break;
			case 1:case 4:case 7:
				sum += (Integer.parseInt(num.charAt(i)+"") * 3)%10;System.out.println(sum);break;
			case 2:case 5:
				sum += (Integer.parseInt(num.charAt(i)+"") * 7)%10;System.out.println(sum);break;
			default:
				sum += (Integer.parseInt(num.charAt(8)+"")*5)%10;
				sum += (Integer.parseInt(num.charAt(8)+"")*5)/10;
				
			}
		}
		System.out.println(sum);

		System.out.println((Integer.parseInt(num.charAt(9)+"")+sum)%10==0? "정상":"오류");
		
	}
}
