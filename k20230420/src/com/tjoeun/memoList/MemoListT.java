package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoListT {

	private ArrayList<MemoVOT> memoList = new ArrayList<>();

	public ArrayList<MemoVOT> getMemoList() {
		return memoList;
	}
	public void setMemoList(ArrayList<MemoVOT> memoList) {
		this.memoList = memoList;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (memoList.size() == 0) {
			str += "저장된 메모가 없습니다.\n";
		} else {
			for (int i=0; i<memoList.size(); i++) {
				str += memoList.get(memoList.size() - 1 - i) + "\n";
			}
		}
		return str;
	}
	
	public void addMemo(MemoVOT vo) {
		memoList.add(vo);
	}
	
	public MemoVOT selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
		for (int i=0; i<memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
		MemoVOT.count = memoList.size();
	}
	
	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
	}
	
//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 memoList ArrayList에 저장된
//	데이터를 텍스트 파일로 출력하는 메소드
	public void writeMemo(String filename) {
		
		PrintWriter printWriter = null;
		
//		텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = "./src/com/tjoeun/memoList/" + filename + ".txt";
		String filepath = String.format("./src/com/tjoeun/memoList/%s.txt", filename);
//		System.out.println(filepath);
		
		try {
			printWriter = new PrintWriter(filepath);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
//			ArrayList에 저장된 데이터를 공백으로 구분해서 텍스트 파일에 1줄로 연결해서 출력한다.
//			일반 for
			/*
			for (int i=0; i<memoList.size(); i++) {
//				System.out.println(memoList.get(i));
				MemoVO vo = memoList.get(i);
//				String str = "";
//				str += vo.getIdx() + " ";
//				str += vo.getName().replace(" ", "`") + " ";
//				str += vo.getPassword() + " ";
//				str += vo.getMemo().replace(" ", "`") + " ";
//				str += sdf.format(vo.getWriteDate());
				String str = String.format("%d %s %s %s %s", vo.getIdx(), 
						vo.getName().replace(" ", "`"), vo.getPassword(), 
						vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
//				System.out.println(str);
				printWriter.write(str + "\n");
			}
			*/
			
//			향상된 for
			for (MemoVOT vo : memoList) {
				String str = String.format("%d %s %s %s %s", vo.getIdx(), 
						vo.getName().replace(" ", "`"), vo.getPassword(), 
						vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
				printWriter.write(str + "\n");
			}
			System.out.println(filename + ".txt 파일에 쓰기 완료!!!");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} finally {
			if (printWriter != null) {
				printWriter.close();
			}
		}
		
	}
	
//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 텍스트 파일의 데이터를 읽어
//	memoList ArrayList에 저장하는 메소드
	public void readMemo(String filename) {
		
		Scanner scanner = null;
		
//		텍스트 파일의 경로와 이름을 연결한다.
		String filepath = String.format("./src/com/tjoeun/memoList/%s.txt", filename);

		try {
			scanner = new Scanner(new File(filepath));
			
//			텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 memoList ArrayList에 저장한다.
			while (scanner.hasNextLine()) {
//				텍스트 파일에서 1줄을 읽는다.
				String str = scanner.nextLine().trim();
//				System.out.println(str);
				
//				읽어들인 데이를 공백을 경계로 읽어서 각각의 변수에 저장한다.
				Scanner scan = new Scanner(str);
				int idx = scan.nextInt();
				String name = scan.next().replace("`", " ");
				String password = scan.next();
				String memo = scan.next().replace("`", " ");
				String temp = scan.nextLine().trim();
				
//				텍스트 파일에서 읽어들인 문자열로 변환되서 저장된 날짜 데이터를 Date 클래스 객체를
//				사용해서 날짜 데이터로 변환한다.
//				System.out.println(temp.substring(0, 4));
//				int year = Integer.parseInt(temp.substring(0, 4)) - 1900;
//				int month = Integer.parseInt(temp.substring(5, 7)) - 1;
//				int day = Integer.parseInt(temp.substring(8, 10));
//				int hour = Integer.parseInt(temp.substring(11, 13));
//				int minute = Integer.parseInt(temp.substring(14, 16));
//				int second = Integer.parseInt(temp.substring(17));
				
//				split() 메소드의 구분자를 "."으로 지정하면 제대로 동작되지 않는다.
//				split() 메소드의 구분자로 "."을 사용해야 한다면 "\\." 또는 "[.]" 형태로 구분자를 지정한다.
//				String[] date = temp.split("\\.");
				String[] date = temp.split("[.]");
//				System.out.println(Arrays.toString(date));
				int year = Integer.parseInt(date[0]) - 1900;
				int month = Integer.parseInt(date[1]) - 1;
				int day = Integer.parseInt(date[2]);
				int hour = Integer.parseInt(date[3]);
				int minute = Integer.parseInt(date[4]);
				int second = Integer.parseInt(date[5]);
				
				Date writeDate = new Date(year, month, day, hour, minute, second);
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
				
				MemoVOT vo = new MemoVOT(idx, name, password, memo, writeDate);
//				System.out.println(vo);
				
//				MemoVO 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
			}
			System.out.println(filename + ".txt 파일에서 읽기 완료!!!");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		}
		
	}
	
}



















