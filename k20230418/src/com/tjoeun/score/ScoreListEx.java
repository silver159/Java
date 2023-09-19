package com.tjoeun.score;

import java.util.ArrayList;

public class ScoreListEx
{
	ArrayList<ScoreVOEx> scoreList = new ArrayList<>();
	
	public ScoreListEx()
	{
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ScoreVOEx> getScoreList()
	{
		return scoreList;
	}

	public void setScoreList(ArrayList<ScoreVOEx> scoreList)
	{
		this.scoreList = scoreList;
	}

	@Override
	public String toString()
	{
		String str = "";
		str += "=====================================================================\n";
		str += "번호 이름 java jsp spring 총점 평균 석차\n";
		str += "=====================================================================\n";
		for(int i=0; i<scoreList.size()-1;i++)
		{
			for(int j=i+1; j<scoreList.size();j++) {
				if(scoreList.get(i).getTotal()>scoreList.get(j).getTotal()) {
					scoreList.get(j).setRank(scoreList.get(j).getRank()+1);;
				}else if(scoreList.get(i).getTotal()<scoreList.get(j).getTotal()) {
					scoreList.get(i).setRank(scoreList.get(i).getRank()+1);
				}
			}
		}
		for (ScoreVOEx vo : scoreList)
		{
			str += vo +"\n";
		}
		str += "=====================================================================\n";
		return str;
	}

	public void addScore(ScoreVOEx score)
	{
		scoreList.add(score);
	}
	
	
}
