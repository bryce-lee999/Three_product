package com.yc.po;

public class Indent {

	private Integer bid;//¶©µ¥±àºÅ
	private Integer cno;//¹ºÂòÈË±àºÅ
	private String bdata;//¶©µ¥Ê±¼ä
	private Integer did;//ËÍ»õ·½Ê½±àºÅ
	private String addition01;//±£Áô×Ö¶Î
	private String addition02;//±£Áô×Ö¶Î
	public Indent(Integer bid, Integer cno, String bdata, Integer did, String addition01, String addition02) {
		super();
		this.bid = bid;
		this.cno = cno;
		this.bdata = bdata;
		this.did = did;
		this.addition01 = addition01;
		this.addition02 = addition02;
	}
	public Indent() {
		super();
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getBdata() {
		return bdata;
	}
	public void setBdata(String bdata) {
		this.bdata = bdata;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
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
		return "Indent [bid=" + bid + ", cno=" + cno + ", bdata=" + bdata + ", did=" + did + ", addition01="
				+ addition01 + ", addition02=" + addition02 + "]";
	}


}
