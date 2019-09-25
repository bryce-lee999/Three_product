package com.yc.po;

public class Favorites {

	private Integer fid;//收藏编号
	private Integer cno;//收藏的客户
	private Integer gno;//收藏商品编号
	private Integer fnum;//收藏商品数量
	private String fdate;//收藏时间
	private String addition01;//保留字段
	private String addition02;//保留字段
	public Favorites(Integer fid, Integer cno, Integer gno, Integer fnum, String fdate, String addition01,
			String addition02) {
		super();
		this.fid = fid;
		this.cno = cno;
		this.gno = gno;
		this.fnum = fnum;
		this.fdate = fdate;
		this.addition01 = addition01;
		this.addition02 = addition02;
	}
	public Favorites() {
		super();
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Integer getGno() {
		return gno;
	}
	public void setGno(Integer gno) {
		this.gno = gno;
	}
	public Integer getFnum() {
		return fnum;
	}
	public void setFnum(Integer fnum) {
		this.fnum = fnum;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
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
		return "Favorites [fid=" + fid + ", cno=" + cno + ", gno=" + gno + ", fnum=" + fnum + ", fdate=" + fdate
				+ ", addition01=" + addition01 + ", addition02=" + addition02 + "]";
	}


}
