package com.tjoeun.memoList;

import java.text.SimpleDateFormat;
import java.util.Date;

//	메모 1건을 기억할 클래스
public class MemoVOTest
{
	public static int count;	//	글번호 자동 증가에 사용할 정적 필드
	private int idx;	//	자동으로 1씩 증가하는 글번호
	private String name;	//	작성자 이름
	private String password;	//	비밀번호
	private String memo;	//	메모
	private Date writeDate; //	메모 작성일 => 컴퓨터 시스템의 날짜와 시간으로 자동 설정
	
	public MemoVOTest()	{}

	public MemoVOTest(String name, String password, String memo)
	{
		super();
		idx = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}

	public int getIdx()
	{
		return idx;
	}
	public void setIdx(int idx)
	{
		this.idx = idx;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getMemo()
	{
		return memo;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public Date getWriteDate()
	{
		return writeDate;
	}
	public void setWriteDate(Date writeDate)
	{
		this.writeDate = writeDate;
	}

	@Override
	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		return String.format("%d. %s(%s)님이 %s에 남길글%n%s", idx,name,password,sdf.format(writeDate),memo);
		
	}

}
