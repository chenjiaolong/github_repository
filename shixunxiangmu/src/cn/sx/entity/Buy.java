package cn.sx.entity;

public class Buy {
	private String userNo;
	private String tel;
	private String goodNo;
	private String goodName;
	private String goodPrice;
	public Buy() {}
	public Buy(String userNo, String tel, String goodNo, String goodName, String goodPrice) {
		super();
		this.userNo = userNo;
		this.tel = tel;
		this.goodNo = goodNo;
		this.goodName = goodName;
		this.goodPrice = goodPrice;
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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the goodNo
	 */
	public String getGoodNo() {
		return goodNo;
	}
	/**
	 * @param goodNo the goodNo to set
	 */
	public void setGoodNo(String goodNo) {
		this.goodNo = goodNo;
	}
	/**
	 * @return the goodName
	 */
	public String getGoodName() {
		return goodName;
	}
	/**
	 * @param goodName the goodName to set
	 */
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	/**
	 * @return the goodPrice
	 */
	public String getGoodPrice() {
		return goodPrice;
	}
	/**
	 * @param goodPrice the goodPrice to set
	 */
	public void setGoodPrice(String goodPrice) {
		this.goodPrice = goodPrice;
	}
	


}
