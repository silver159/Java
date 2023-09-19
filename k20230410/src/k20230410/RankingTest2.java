package k20230410;

public class RankingTest2
{
	public static void main(String[] args)
	{
		int score[] = {86,100,70,95,94};
		int rank[] = new int[score.length];
		for (int i = 0; i<rank.length; i++)
		{
			rank[i] = 1; 
		}
//		선택정렬 이용
		for (int i=0; i<score.length-1; i++) // -1 빼먹지 말기!!!
		{
			for(int j=i+1; j<score.length; j++)
			{
				if(score[i]<score[j]) 
				{
					rank[i]++;
				}
				else if(score[i]>score[j])
				{
					rank[j]++;
				}
			}
		}
		for (int i=0;i<score.length;i++)
		{
			System.out.printf("%3d점은 %d등 입니다.", score[i], rank[i]);
//			별점 출력
			for (int j=0;j<score[i]/10;j++)
			{
				System.out.print("★");
			}
			if (score[i]%10>=5) 
			{
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}
}
