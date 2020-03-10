package cn.sx.entity;

public class UserInfo {
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String userNo;
	private String userName;
	private String userPsw;
	private String adderss;
	private String sex;
	private String userSign;
	
	
	/**
	 * @return the userSign
	 */
	public String getUserSign() {
		return userSign;
	}
	/**
	 * @param userSign the userSign to set
	 */
	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}
	/**
	 * @return the userNo
	 */
	public String getUserNo() {
		return userNo;
	}
	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPsw
	 */
	public String getUserPsw() {
		return userPsw;
	}
	/**
	 * @param userPsw the userPsw to set
	 */
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	/**
	 * @return the adderss
	 */
	public String getAdderss() {
		return adderss;
	}
	/**
	 * @param adderss the adderss to set
	 */
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [userNo=" + userNo + ", userName=" + userName + ", userPsw=" + userPsw + ", adderss=" + adderss
				+ ", sex=" + sex + ", userSign=" + userSign + "]";
	}
	public UserInfo(String userNo, String userName, String userPsw, String adderss, String sex ,String userSign) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.userPsw = userPsw;
		this.adderss = adderss;
		this.sex = sex;
		this.userSign=userSign;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (adderss == null) {
			if (other.adderss != null)
				return false;
		} else if (!adderss.equals(other.adderss))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userNo == null) {
			if (other.userNo != null)
				return false;
		} else if (!userNo.equals(other.userNo))
			return false;
		if (userPsw == null) {
			if (other.userPsw != null)
				return false;
		} else if (!userPsw.equals(other.userPsw))
			return false;
		if (userSign == null) {
			if (other.userSign != null)
				return false;
		} else if (!userSign.equals(other.userSign))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adderss == null) ? 0 : adderss.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userNo == null) ? 0 : userNo.hashCode());
		result = prime * result + ((userPsw == null) ? 0 : userPsw.hashCode());
		result = prime * result + ((userSign == null) ? 0 : userSign.hashCode());
		return result;
	}
	
	

}
