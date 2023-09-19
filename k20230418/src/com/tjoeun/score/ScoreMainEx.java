package com.tjoeun.score;

public class ScoreMainEx
{
	public static void main(String[] args)
	{
//		ScoreVO score1 = new ScoreVO();
//		ScoreVO score2 = new ScoreVO();
//		ScoreVO score3 = new ScoreVO();
//		
//		System.out.println("score1.count: " + score1.count); // 0
//		score2.count = 100;
//		System.out.println("score2.count: " + score2.count); // 100
////		static 변수는 현재 클래스로 생성하는 모든 객체에서 공유하므로 score3과
////		score1의 count도 수정된다.
//		System.out.println("score3.count: " + score3.count); // 100
//		System.out.println("score1.count: " + score1.count); // 100
//		System.out.println("ScoreVO.count: " + ScoreVO.count); // 100
		
		ScoreVOEx score1 = new ScoreVOEx("홍길동", 100, 100, 90);
		ScoreVOEx score2 = new ScoreVOEx("임꺽정",91,87,79);
		ScoreVOEx score3 = new ScoreVOEx("장길산",91,87,79);
		ScoreVOEx score4 = new ScoreVOEx("일지매",82,98,95);
		ScoreVOEx score5 = new ScoreVOEx("손오공",67,85,91);
		
		ScoreListEx scoreList = new ScoreListEx();
		
		scoreList.addScore(score1);
		scoreList.addScore(score2);
		scoreList.addScore(score3);
		scoreList.addScore(score4);
		scoreList.addScore(score5);
		
		System.out.println(scoreList);
		
		
		
		
		
	}
}
