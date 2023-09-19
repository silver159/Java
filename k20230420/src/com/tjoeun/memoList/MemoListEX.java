package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoListEX
{
	private ArrayList<MemoVOEx> memoList = new ArrayList<>();

	public ArrayList<MemoVOEx> getMemoList()
	{
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVOEx> memoList)
	{
		this.memoList = memoList;
	}

	@Override
	public String toString()
	{
		String str = "";
		if(memoList.size() == 0) {
			str += "저장된 메모가 없습니다.\n";
		}else {

			for (int i=memoList.size()-1; i>=0;i--)//마지막부터 처음까지
			{
				str += memoList.get(i) + "\n";

			}
		}
		return str;
	}
	public void addmemo(MemoVOEx vo)
	{
		memoList.add(vo);
		
	}
	public MemoVOEx selectMemo(int idx)
	{
		try {
			return memoList.get(idx-1); 
		}catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void deleteMemo(int idx)
	{
		memoList.remove(idx-1);
		for(int i = 0;i<memoList.size();i++)
		{
			memoList.get(i).setIdx(i+1);
		}
		MemoVOEx.count = memoList.size();
	}
	public void updateMemo(int idx, String memo)
	{
		memoList.get(idx-1).setMemo(memo);
	}

//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 MemoList ArrayList에 저장된
//	데이터를 텍스트 파일로 출력하는 메소드
	public void writeMemo(String filename)
	{
		PrintWriter printWriter = null;
		//선언만 한다. try 블록 안에서 객체를 만들어야 한다.
		//만약 블록에서 선언하면 밖에서 사용하지 못하기 때문이다.
		
		//텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = ".\\k20230420\\src\\com\\tjoeun\\memoList\\"+filename+".txt";
		String filepath = String.format(".\\src\\com\\tjoeun\\memoList\\%s.txt", filename);
//		System.out.println(filepath);
		
		try
		{
			//출력용 파일 만들기
			printWriter = new PrintWriter(filepath);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
			//ArrayList 저장된 데이터를 공백으로 구분해서 텍스트 파일에 
			//1줄로 연결해서 출력한다.
			//일반 for
			for (int i=0;i<memoList.size();i++)
//			{
//				MemoVOEx vo = memoList.get(i);
////				String str = "";
////				str += vo.getIdx() + " ";
////				str += vo.getName().replace(" ", "`")+ " ";
////				str += vo.getPassword()+ " ";
////				str += vo.getMemo().replace(" ", "`")+ " ";
////				str += sdf.format(vo.getDate());
//				String str = String.format("%s %s %s %s %s",vo.getIdx(),vo.getName().replace(" ", "`"),
//						vo.getPassword(),vo.getMemo().replace(" ", "`"),sdf.format(vo.getDate()));
////				System.out.println(str);
//				printWriter.write(str + "\n");
//			}
			//향상된 for
			for (MemoVOEx vo : memoList)
			{
				String str = String.format("%d %s %s %s %s", vo.getIdx(),vo.getName().replace(" ", "`"),
						vo.getPassword(), vo.getMemo().replace(" ", "`"),sdf.format(vo.getDate()));
				printWriter.write(str + "\n");
			}
			System.out.println(filename + ".txt 파일에 쓰기 완료!!!");
		} catch (FileNotFoundException e)
		{
//			e.printStackTrace();
			
		}finally {
			if(printWriter != null) {
				printWriter.close();
			}
		}
	}

	public void readMemo(String filename)
	{
		Scanner scanner = null;
		//텍스트 파일의 경로와 이름을 연결한다.
		String filepath = String.format(".\\src\\com\\tjoeun\\memoList\\%s.txt", filename);
		
		try
		{
			scanner = new Scanner(new File(filepath));//익명으로
			
//			텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 MemoList ArrayList에 저장한다.
			while(scanner.hasNextLine())
			{
				String str = scanner.nextLine().trim();
				Scanner scan = new Scanner(str);
				int idx = scan.nextInt();
				String name = scan.next().replace("`", " ");
				String password = scan.next();
				String memo = scan.next().replace("`", " ");
				String temp = scan.nextLine().trim();
				//마지막은 엔터 흡수& 혹시 모를 공백 제거
				//텍스트 파일에서 읽어들인 문자열로 변환되서 저장된 날짜 데이터를
				//Date 클래스 객체를 사용해서 날짜 데이터로 변환한다.	
				
				//split() 메소드의 구분자를 "."으로 지정하면 제대로 동작되지 않는다.
				//split() 메소드의 구분자를 "."을 사용해야 한다면 "\\." 또는 "[.]" 형태로
				//구분자를 지정한다.
				String[] date = temp.split("\\.");
				int year = Integer.parseInt(date[0])-1900;
				int month = Integer.parseInt(date[1]) -1;
				int day = Integer.parseInt(date[2]);
				int hour = Integer.parseInt(date[3]);
				int min = Integer.parseInt(date[4]);
				int sec = Integer.parseInt(date[5]);
				
				Date writeDate = new Date(year, month, day, hour, min, sec);
				MemoVOEx vo = new MemoVOEx(idx, name, password, memo, writeDate);
				//MemoVo 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
			}
			System.out.println(filename + ".txt 파일에 읽기 완료!!!");
		} catch (FileNotFoundException e)
		{
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		}
		
	}
	




	
	
	
}


















