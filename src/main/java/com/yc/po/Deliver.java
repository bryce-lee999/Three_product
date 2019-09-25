package com.yc.po;

public class Deliver {

	private Integer did;//编号
	private String dname;//送货方式名
	private Double dmoney;//送货价格
	private String addition01;//保留字段
	private String addition02;//保留字段
	public Deliver(Integer did, String dname, Double dmoney, String addition01, String addition02) {
		super();
		this.did = did;
		this.dname = dname;
		this.dmoney = dmoney;
		this.addition01 = addition01;
		this.addition02 = addition02;
	}
	public Deliver() {
		super();
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Double getDmoney() {
		return dmoney;
	}
	public void setDmoney(Double dmoney) {
		this.dmoney = dmoney;
	}
	public String getAddition01() {
		return addition01;
	}
	public void setAddition01(String addition01) {
		this.addition01 = addition01;
	}
	public String getAddition02() {
		return addition02;
	}
	public void setAddition02(String addition02) {
		this.addition02 = addition02;
	}
	@Override
	public String toString() {
		return "Deliver [did=" + did + ", dname=" + dname + ", dmoney=" + dmoney + ", addition01=" + addition01
				+ ", addition02=" + addition02 + "]";
	}


}
