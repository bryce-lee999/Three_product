package com.yc.po;

public class Type {

	private Integer tno;//类别编号
	private String tname;//类别名称
	private String tdescription;//类别描述
	private String addition01;//保留字段
	private String addition02;//保留字段
	public Type(Integer tno, String tname, String tdescription, String addition01, String addition02) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.tdescription = tdescription;
		this.addition01 = addition01;
		this.addition02 = addition02;
	}
	public Type() {
		super();
	}
	public Integer getTno() {
		return tno;
	}
	public void setTno(Integer tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdescription() {
		return tdescription;
	}
	public void setTdescription(String tdescription) {
		this.tdescription = tdescription;
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
		return "Type [tno=" + tno + ", tname=" + tname + ", tdescription=" + tdescription + ", addition01=" + addition01
				+ ", addition02=" + addition02 + "]";
	}

}
