package com.yc.po;

public class Admin {

	private Integer coid;//����Ա���
	private String coname;//����Ա����
	private String copwd;//����Ա����
	private Integer costatus;//����Ա״̬
	private Integer colevel;//����Ա�ȼ�
	public Admin(Integer coid, String coname, String copwd, Integer costatus, Integer colevel) {
		super();
		this.coid = coid;
		this.coname = coname;
		this.copwd = copwd;
		this.costatus = costatus;
		this.colevel = colevel;
	}
	public Admin() {
		super();
	}
	public Integer getCoid() {
		return coid;
	}
	public void setCoid(Integer coid) {
		this.coid = coid;
	}
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	public String getCopwd() {
		return copwd;
	}
	public void setCopwd(String copwd) {
		this.copwd = copwd;
	}
	public Integer getCostatus() {
		return costatus;
	}
	public void setCostatus(Integer costatus) {
		this.costatus = costatus;
	}
	public Integer getColevel() {
		return colevel;
	}
	public void setColevel(Integer colevel) {
		this.colevel = colevel;
	}
	@Override
	public String toString() {
		return "Admin [coid=" + coid + ", coname=" + coname + ", copwd=" + copwd + ", costatus=" + costatus
				+ ", colevel=" + colevel + "]";
	}


}
