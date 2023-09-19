package com.tjoeun.memoList;

import java.util.ArrayList;

public class MemoListTest
{
	private ArrayList<MemoVOTest> memoList = new ArrayList<>();

	public ArrayList<MemoVOTest> getMemoList()
	{
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVOTest> memoList)
	{
		this.memoList = memoList;
	}

	@Override
	public String toString()
	{
		String str = "";
		if (memoList.size() == 0)
		{
			str += "저장된 메모가 없습니다.\n";
		} else
		{
			for (int i = memoList.size() - 1; i >= 0; i--)
			{
				str += memoList.get(i) + "\n";
			}
		}
		return str;
	}

	public void addMemo(MemoVOTest memo)
	{
		memoList.add(memo);
	}

	public MemoVOTest selectMemo(int idx)
	{
		try
		{
			return memoList.get(idx - 1);
		} catch (IndexOutOfBoundsException e)
		{
			return null;
		}
	}

	public void deleteMemo(int idx)
	{
		memoList.remove(idx - 1);
		MemoVOTest.count--;
		for (int i = 0; i < memoList.size(); i++)
		{
			memoList.get(i).setIdx(i + 1);
		}

	}

	public void updateMemo(int idx, String memo)
	{
		memoList.get(idx - 1).setMemo(memo);
	}
}
