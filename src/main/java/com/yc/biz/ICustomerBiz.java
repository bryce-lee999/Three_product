package com.yc.biz;

import com.yc.po.Customer;

public interface ICustomerBiz {

	/**
	 * �û���¼
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);

	/**
	 * �û�ע��
	 * @param po
	 * @return
	 * @throws Exception
	 */
	public int register(Customer po) throws Exception;

	/**
	 * �����û���Ϣ
	 * @param po
	 * @return
	 * @throws Exception
	 */
	public int update(Customer po) throws Exception;
}
