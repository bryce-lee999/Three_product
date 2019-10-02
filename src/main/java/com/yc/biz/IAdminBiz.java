package com.yc.biz;

import java.util.List;

import com.yc.po.Admin;

public interface IAdminBiz {

	/**
	 * ����Ա��¼
	 * @param controller
	 * @return
	 */
	public Admin login(Admin controller);

	/**
	 * ��ѯ���й���Ա
	 * @return
	 */
	public List<Admin> findAll();

	/**
	 * ��ѯ��������Ա��Ϣ
	 * @param coid
	 * @return
	 */
	public Admin findOne(Integer coid);

	/**
	 * ��ӹ���Ա
	 * @param admin
	 * @return
	 */
	public int add(Admin admin);

	/**
	 * ��������
	 * @param coid
	 * @return
	 */
	public int update(Integer coid,Integer coid_reset);

	/**
	 * �޸��˺�״̬
	 * @param coid
	 * @param coid_reset
	 * @return
	 */
	public int changeStatus(Integer coid,Integer coid_reset);
}
