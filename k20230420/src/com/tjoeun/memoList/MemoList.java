package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoList
{
	private ArrayList<MemoVO> memoList = new ArrayList<>();

	public ArrayList<MemoVO> getMemoList()
	{
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList)
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

			for (int i=memoList.size()-1; i>=0;i--)
			{
				str += memoList.get(i) + "\n";

			}
		}
		return str;
	}

	public void addmemo(MemoVO vo)
	{
		memoList.add(vo);
		
	}
	public MemoVO selectMemo(int idx)
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
		MemoVO.count = memoList.size();
	}

	public void updateMemo(int idx, String memo)
	{
		memoList.get(idx-1).setMemo(memo);
	}

//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 MemoList ArrayList에 저장된
//	데이터를 텍스트 파일로 출력하는 메소드
	public void writeMemo(String fileName)
	{
		PrintWriter printWriter = null; //선언만 한다. try 블록 안에서 객체를 만들어야 한다.
//		만약 블록에서 선언하면 밖에서 사용하지 못하기 때문이다.
		
//		텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = ".\\src\\com\\tjoeun\\memoList\\"+fileName+".txt";
		String filepath = String.format(".\\src\\com\\tjoeun\\memoList\\%s.txt", fileName);
//		System.out.println(filepath);
		
		try
		{
			printWriter = new PrintWriter(filepath); //출력용 파일 만들기
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
//			ArrayList 저장된 데이터를 공백으로 구분해서 텍스트 파일에 
//			1줄로 연결해서 출력한다.
//			일반 for
			/*for (int i=0; i<memoList.size();i++) // memoList.get(i); 가져와야 한다.
			{
//				System.out.println(memoList.get(i));
				MemoVO vo = memoList.get(i);
//				String str = "";
//				str += vo.getIdx() + " ";
//				str += vo.getName().replace(" ", "`") + " ";
//				str += vo.getPassword() + " ";
//				str += vo.getMemo().replace(" ", "`") + " ";
//				str += sdf.format(vo.getWriteDate());
				String str = String.format("%d %s %s %s %s",vo.getIdx(),
						vo.getName().replace(" ", "`"),vo.getPassword(),
						vo.getMemo().replace(" ", "`"),sdf.format(vo.getWriteDate()));
//				System.out.println(str);
				printWriter.write(str + "\n");
			}*/
			
//			향상된 for
			for (MemoVO vo : memoList) // memoList.get(i); 가져올 필요 없다.
			{
				String str = String.format("%d %s %s %s %s",vo.getIdx(),
						vo.getName().replace(" ", "`"),vo.getPassword(),
						vo.getMemo().replace(" ", "`"),sdf.format(vo.getWriteDate()));
				printWriter.write(str + "\n");
			}
			
			System.out.println(fileName + ".txt 파일에 쓰기 완료!!!");
		} catch (FileNotFoundException e)
		{
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		}finally {
			// 만약에 printWriter에 아무것도 없다면 close하지 말라는 뜻.
			// 정상적으로 실행되었다면 null 값이 나오지 않는다.
			if(printWriter != null) { 
				printWriter.close();
			}
		}
		
		
	}
	
//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 텍스트 파일의 데이터를 읽어 
//	MemoList ArrayList에 저장하는 메소드
	
	public void readMemo(String fileName)
	{
		Scanner scanner = null;
		
//		텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = ".\\src\\com\\tjoeun\\memoList\\"+fileName+".txt";
		String filepath = String.format(".\\src\\com\\tjoeun\\memoList\\%s.txt", fileName);
		
		try
		{
			scanner = new Scanner(new File(filepath));//익명으로
			
//		텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 MemoList ArrayList에 저장한다.
			while (scanner.hasNextLine())
			{
//				텍스트 파일에서 1줄을 읽는다.
				String str = scanner.nextLine().trim();
//				System.out.println(str);
				
//				읽어들인 데이터를 공백을 경계로 읽어서 각각의 변수에 저장한다.
				Scanner scan = new Scanner(str);
				int idx =  scan.nextInt();
				String name = scan.next().replace("`", " "); // 공백으로 끊어서
				String password = scan.next();
				String memo = scan.next().replace("`", " ");;
				String temp = scan.nextLine().trim(); //마지막은 엔터 흡수&혹시 모를 공백 제거
				
//				텍스트 파일에서 읽어들인 문자열로 변환되서 저장된 날짜 데이터를
//				Date 클래스 객체를 사용해서 날짜 데이터로 변환한다.
//				System.out.println(temp.substring(0, 4)); //substring(a, b) a~(b-1) 사이 출력
//				int year = Integer.parseInt(temp.substring(0, 4)) - 1900; //파스인트 string -> int
//				int month = Integer.parseInt(temp.substring(5, 7)) -1;
//				int day = Integer.parseInt(temp.substring(8, 10));
//				int hour = Integer.parseInt(temp.substring(11, 13));
//				int min = Integer.parseInt(temp.substring(14, 16));
//				int sec = Integer.parseInt(temp.substring(17));
				
//				split() 메소드의 구분자를 "."으로 지정하면 제대로 동작되지 않는다.
//				split() 메소드의 구분자를 "."을 사용해야 한다면 "\\." 또는 "[.]" 형태로
//				구분자를 지정한다.
//				String[] date = temp.split("\\.");
				String[] date = temp.split("[.]");
//				System.out.println(Arrays.toString(date));
				int year = Integer.parseInt(date[0]) - 1900; //파스인트 string -> int
				int month = Integer.parseInt(date[1]) -1;
				int day = Integer.parseInt(date[2]);
				int hour = Integer.parseInt(date[3]);
				int min = Integer.parseInt(date[4]);
				int sec = Integer.parseInt(date[5]);
				
				Date writeDate = new Date(year, month, day, hour, min, sec);
//				System.out.println(writeDate);
				
//				ArrayList에 저장하기 위해 MemoVO 클래스 객체를 만들어 넣어준다.
//				MemoVO vo = new MemoVO();
//				vo.setIdx(idx);
//				vo.setName(name);
//				vo.setPassword(password);
//				vo.setMemo(memo);
//				vo.setWriteDate(writeDate);
				
//				MemoVO vo = new MemoVO(name, password, memo);
//				vo.setIdx(idx);		
//				vo.setWriteDate(writeDate);
				
				MemoVO vo = new MemoVO(idx, name, password, memo, writeDate);
//				System.out.println(vo);
				
//				MemoVo 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
			}
			System.out.println(fileName + ".txt 파일에 쓰기 완료!!!");

		} catch (FileNotFoundException e)
		{
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} 
		
		
		
	}




	
	
	
}
