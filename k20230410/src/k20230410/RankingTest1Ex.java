package k20230410;

public class RankingTest1Ex
{
	public static void main(String[] args)
	{
		int score[] = {80,100,70,100,90};
		int rank[] = new int[score.length];
		for(int i=0; i<rank.length; i++)
		{
			rank[i] = 1;
		}
		for (int i = 0;i<score.length; i++)
		{
			for(int j=0; j<score.length;j++)
			{
				if(score[i]<score[j])
				{
					rank[i]++;
				}
			}
		}
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%3d점은 %d등 입니다.%n", score[i],rank[i]);
		}
	}
}
