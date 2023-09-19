package com.tjoeun.score;

public class ScoreVOEx
{
//	정적(static) 멤버 변수(필드)
//	static을 붙여서 선언한 변수는 현재 클래스 객체가 생성될 때 최초 1번만 메모리에 만들어지고
//	현재 클래스의 객체가 또 생성되더라도 다시 생성하지 않는다.
//	static을 붙여서 선언한 변수나 메소드는 클래스 객체를 생성하지 않고 클래스 이름에 "."을
//	찍어서 접근할 수 있다.
//	static을 붙여서 선언한 변수는 현재 클래스로 생성하는 모든 객체에서 공유해서 사용한다.
//	=>따라서 public으로 만든다
	public static int count;
	
//	인스턴스 멤버 변수(필드)
//	인스턴스 필드는 현재 클래스로 생성하는 모든 객체에서 독립된 기억공간을 가진다.
	private int idx;//자동으로 1씩 증가하는 일련번호
	private String name;//이름
	private int java;//java 점수
	private int jsp;//jsp 점수
	private int spring;//spring 점수
	private int total;//총점
	private double mean;//평균
	private int rank = 1;//석차를 기억할 변수의 초기치는 1로 준다.
	
	public ScoreVOEx()
	{
		// TODO Auto-generated constructor stub
	}

	public ScoreVOEx(String name, int java, int jsp, int spring)
	{
		super();
		idx = ++count;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		total = java+jsp+spring;
		mean = (double)total/3;
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

	public int getJava()
	{
		return java;
	}

	public void setJava(int java)
	{
		this.java = java;
	}

	public int getJsp()
	{
		return jsp;
	}

	public void setJsp(int jsp)
	{
		this.jsp = jsp;
	}

	public int getSpring()
	{
		return spring;
	}

	public void setSpring(int spring)
	{
		this.spring = spring;
	}

	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}

	public double getMean()
	{
		return mean;
	}

	public void setMean(double mean)
	{
		this.mean = mean;
	}

	public int getRank()
	{
		return rank;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}

	@Override
	public String toString()
	{
		return String.format("%d %s %3d %3d %3d %3d %6.2f %d",
				idx,name,java,jsp,spring,total,mean,rank);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
