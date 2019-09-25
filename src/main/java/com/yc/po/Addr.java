package com.yc.po;

public class Addr {

	private Integer ano;//收货编号
	private String addr;//收货地址 多个地址用;分隔
	private String aname;//收货人
	private Integer status;//选择地址数组的下标号
	private String aphone;//收货人电话
	private String apostid;//邮编
	private String addition01;//保留字段
	public Addr(Integer ano, String addr, String aname, Integer status, String aphone, String apostid,
			String addition01) {
		super();
		this.ano = ano;
		this.addr = addr;
		this.aname = aname;
		this.status = status;
		this.aphone = aphone;
		this.apostid = apostid;
		this.addition01 = addition01;
	}
	public Addr() {
		super();
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAphone() {
		return aphone;
	}
	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
	public String getApostid() {
		return apostid;
	}
	public void setApostid(String apostid) {
		this.apostid = apostid;
	}
	public String getAddition01() {
		return addition01;
	}
	public void setAddition01(String addition01) {
		this.addition01 = addition01;
	}
	@Override
	public String toString() {
		return "Addr [ano=" + ano + ", addr=" + addr + ", aname=" + aname + ", status=" + status + ", aphone=" + aphone
				+ ", apostid=" + apostid + ", addition01=" + addition01 + "]";
	}



}
