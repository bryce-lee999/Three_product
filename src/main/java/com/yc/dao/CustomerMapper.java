package com.yc.dao;

import com.yc.po.Customer;

public interface CustomerMapper {

	/**
	 * �û���¼
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);

	/**
	 * �û�ע��
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public int register(Customer customer) throws Exception;

	/**
	 * �����û���Ϣ
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public int update(Customer customer) throws Exception;
}
