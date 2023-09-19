package com.tjoeun.interfaceTest2;

//	VO(Value Object): 사용자 정보(데이터 1건)와 데이터를 처리할 메소드가 저장되는 클래스, DTO
public class UserInfoVOT {

	private String userID;
	private String userName;
	private String userPassword;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "UserInfoVO [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
