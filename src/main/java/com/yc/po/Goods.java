package com.yc.po;

public class Goods {

	private Integer gno;//��Ʒ���
	private String gname;//��Ʒ����
	private Integer tino;//��Ʒ���
	private Double gprice;//��Ʒ�۸�
	private Integer gnum;//��Ʒ����
	private String gimg;//��ƷͼƬ
	private String gdescribe;//��Ʒ����
	private String addition02;//�����ֶ�
	public Goods(Integer gno, String gname, Integer tino, Double gprice, Integer gnum, String gimg, String gdescribe,
			String addition02) {
		super();
		this.gno = gno;
		this.gname = gname;
		this.tino = tino;
		this.gprice = gprice;
		this.gnum = gnum;
		this.gimg = gimg;
		this.gdescribe = gdescribe;
		this.addition02 = addition02;
	}
	public Goods() {
		super();
	}
	public Integer getGno() {
		return gno;
	}
	public void setGno(Integer gno) {
		this.gno = gno;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getTino() {
		return tino;
	}
	public void setTino(Integer tino) {
		this.tino = tino;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public Integer getGnum() {
		return gnum;
	}
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public String getGdescribe() {
		return gdescribe;
	}
	public void setGdescribe(String gdescribe) {
		this.gdescribe = gdescribe;
	}
	public String getAddition02() {
		return addition02;
	}
	public void setAddition02(String addition02) {
		this.addition02 = addition02;
	}
	@Override
	public String toString() {
		return "Goods [gno=" + gno + ", gname=" + gname + ", tino=" + tino + ", gprice=" + gprice + ", gnum=" + gnum
				+ ", gimg=" + gimg + ", gdescribe=" + gdescribe + ", addition02=" + addition02 + "]";
	}


}