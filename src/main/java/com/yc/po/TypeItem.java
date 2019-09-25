package com.yc.po;

public class TypeItem {

	private Integer tino;//商品具体类型
	private String tiname;//商品名称
	private Integer tno;//商品类型编号
	public TypeItem(Integer tino, String tiname, Integer tno) {
		super();
		this.tino = tino;
		this.tiname = tiname;
		this.tno = tno;
	}
	public TypeItem() {
		super();
	}
	public Integer getTino() {
		return tino;
	}
	public void setTino(Integer tino) {
		this.tino = tino;
	}
	public String getTiname() {
		return tiname;
	}
	public void setTiname(String tiname) {
		this.tiname = tiname;
	}
	public Integer getTno() {
		return tno;
	}
	public void setTno(Integer tno) {
		this.tno = tno;
	}
	@Override
	public String toString() {
		return "TypeItem [tino=" + tino + ", tiname=" + tiname + ", tno=" + tno + "]";
	}


}
