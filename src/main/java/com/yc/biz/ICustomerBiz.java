package com.yc.biz;

import com.yc.po.Customer;

public interface ICustomerBiz {

	/**
	 * 用户登录
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);

	/**
	 * 用户注册
	 * @param po
	 * @return
	 * @throws Exception
	 */
	public int register(Customer po) throws Exception;

	/**
	 * 更新用户信息
	 * @param po
	 * @return
	 * @throws Exception
	 */
	public int update(Customer po) throws Exception;
}
