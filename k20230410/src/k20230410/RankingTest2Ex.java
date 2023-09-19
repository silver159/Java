package k20230410;

public class RankingTest2Ex
{
	public static void main(String[] args)
	{
		int score[] = {87,100,72,95,94};
		int rank[] = new int[score.length];
		for (int i = 0; i<rank.length; i++)
		{
			rank[i] = 1; 
		}
		for (int i=0; i<score.length-1;i++)
		{
			for(int j=i+1; j<score.length;j++)
			{
				if(score[i]>score[j])
				{
					rank[j]++;
				}
				else if(score[i]<score[j])
				{
					rank[i]++;
				}
			}
		}
		for(int i=0;i<score.length;i++)
		{
			System.out.printf("%3d점은 %d등입니다.", score[i],rank[i]);
			for (int j=0;j<score[i]/10;j++)
			{
				if(j == 5) 
				{
					System.out.print(" ");
				}
				System.out.print("★");
			}
			if(score[i]%10>=5)
			{
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("==============================");
		for(int i=0;i<score.length;i++)
		{
			System.out.printf("%3d점은 %d등입니다.", score[i],rank[i]);
			int count = 10 - (score[i] / 10 + (score[i] % 10 >= 5?1:0));
			for(int j=0; j<count;j++) {
				System.out.print(" ");
			}
			if(score[i]%10>=5)
			{
				System.out.print("☆");
				count++;
			}
			for (int j=0;j<score[i]/10;j++)
			{
				System.out.print("★");
				count++;
				if(count %5 == 0)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
