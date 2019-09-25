package com.yc.po;

public class Customer {

	private Integer cno;//�ͻ����
	private String cname;//�ͻ�����
	private String pwd;//�ͻ�����
	private String tel;//�ͻ��绰
	private String addr;//�ͻ���ַ
	private String cphoto;//ͷ��
	private Integer ano;//�ջ���ַ���
	private String csex;//�ͻ��Ա�
	private String ccodetype;//֤������
	private String ccodenumber;//֤������
	private String addition01;//�����ֶ�
	public Customer(Integer cno, String cname, String pwd, String tel, String addr, String cphoto, Integer ano,
			String csex, String ccodetype, String ccodenumber, String addition01) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.pwd = pwd;
		this.tel = tel;
		this.addr = addr;
		this.cphoto = cphoto;
		this.ano = ano;
		this.csex = csex;
		this.ccodetype = ccodetype;
		this.ccodenumber = ccodenumber;
		this.addition01 = addition01;
	}
	public Customer() {
		super();
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCphoto() {
		return cphoto;
	}
	public void setCphoto(String cphoto) {
		this.cphoto = cphoto;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCcodetype() {
		return ccodetype;
	}
	public void setCcodetype(String ccodetype) {
		this.ccodetype = ccodetype;
	}
	public String getCcodenumber() {
		return ccodenumber;
	}
	public void setCcodenumber(String ccodenumber) {
		this.ccodenumber = ccodenumber;
	}
	public String getAddition01() {
		return addition01;
	}
	public void setAddition01(String addition01) {
		this.addition01 = addition01;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", pwd=" + pwd + ", tel=" + tel + ", addr=" + addr
				+ ", cphoto=" + cphoto + ", ano=" + ano + ", csex=" + csex + ", ccodetype=" + ccodetype
				+ ", ccodenumber=" + ccodenumber + ", addition01=" + addition01 + "]";
	}


}
