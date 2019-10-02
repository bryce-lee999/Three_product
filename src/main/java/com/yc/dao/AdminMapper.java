package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yc.po.Admin;

public interface AdminMapper {

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
	 * ���ҵ�������Ա��Ϣ
	 * @param coid
	 * @return
	 */
	public Admin findOne(Integer coid);

	/**
	 * ��ӹ���Ա
	 * @return
	 */
	public int add(Admin admin);

	/**
	 * ��������
	 * @param coid
	 * @return
	 */
	public int update(Integer coid);

	/**
	 * �޸��˺�״̬
	 * @param coid
	 * @return
	 */
	public int changeStatus(@Param("coid")Integer coid,@Param("costatus")Integer costatus);
}
