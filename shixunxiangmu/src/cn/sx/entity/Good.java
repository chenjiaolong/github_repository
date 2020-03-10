package cn.sx.entity;


public class Good {
	private String goodName;
	private String tel;
	private String goodPrice;
	private String eoy;
	private String goodDes;
	private String goodSort;
	private String goodNo;//==>setGnum
	/**
	 * @return the goodName
	 */
	public Good() {}
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
	/**
	 * @return the eoy
	 */
	public String getEoy() {
		return eoy;
	}
	/**
	 * @param eoy the eoy to set
	 */
	public void setEoy(String eoy) {
		this.eoy = eoy;
	}
	/**
	 * @return the goodDes
	 */
	public String getGoodDes() {
		return goodDes;
	}
	/**
	 * @param goodDes the goodDes to set
	 */
	public void setGoodDes(String goodDes) {
		this.goodDes = goodDes;
	}
	/**
	 * @return the goodSort
	 */
	public String getGoodSort() {
		return goodSort;
	}
	/**
	 * @param goodSort the goodSort to set
	 */
	public void setGoodSort(String goodSort) {
		this.goodSort = goodSort;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Good [goodName=" + goodName + ", tel=" + tel + ", goodPrice=" + goodPrice + ", eoy=" + eoy
				+ ", goodDes=" + goodDes + ", goodSort=" + goodSort + ", goodNo=" + goodNo + "]";
	}
	public Good(String goodName, String tel, String goodPrice, String eoy, String goodDes, String goodSort,
			String goodNo) {
		super();
		this.goodName = goodName;
		this.tel = tel;
		this.goodPrice = goodPrice;
		this.eoy = eoy;
		this.goodDes = goodDes;
		this.goodSort = goodSort;
		this.goodNo = goodNo;
	}
	
}