package cn.sx.entity;
/*
 * @author along
 */

public class User {
	/**
	 * 
	 */
	private String userName;
    private String userNo;
    private String userPsw;
    public User() {}
    public User(String userName, String userNo, String userPsw) {
		super();
		this.userName = userName;
		this.userNo = userNo;
		this.userPsw = userPsw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userNo=" + userNo + ", userPsw=" + userPsw + "]";
	}

	
	
	
       
}
