package com.yc.po;

public class Cart {

	private Integer fid;//�ղر��
	private Integer cno;//�ղصĿͻ�
	private Integer gno;//�ղ���Ʒ���
	private String gname;//��Ʒ����
	private Integer tino;//��Ʒ���
	private Double gprice;//��Ʒ�۸�
	private Integer gnum;//��Ʒ���
	private String gimg;//��ƷͼƬ
	private Integer fnum;//�ղ���Ʒ����
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
	public Integer getFnum() {
		return fnum;
	}
	public void setFnum(Integer fnum) {
		this.fnum = fnum;
	}
	public Cart(Integer fid, Integer cno, Integer gno, String gname, Integer tino, Double gprice, Integer gnum,
			String gimg, Integer fnum) {
		super();
		this.fid = fid;
		this.cno = cno;
		this.gno = gno;
		this.gname = gname;
		this.tino = tino;
		this.gprice = gprice;
		this.gnum = gnum;
		this.gimg = gimg;
		this.fnum = fnum;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [fid=" + fid + ", cno=" + cno + ", gno=" + gno + ", gname=" + gname + ", tino=" + tino
				+ ", gprice=" + gprice + ", gnum=" + gnum + ", gimg=" + gimg + ", fnum=" + fnum + "]";
	}

}
