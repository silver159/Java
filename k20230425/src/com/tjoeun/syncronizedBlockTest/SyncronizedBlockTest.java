package com.tjoeun.syncronizedBlockTest;

public class SyncronizedBlockTest
{
	public static void main(String[] args)
	{
		ShareArea shareArea = new ShareArea();
		
		TransferThread thread = new TransferThread(shareArea);
		PrintThread print = new PrintThread(shareArea);
		
		thread.start();
		print.start();
		
	}
}
