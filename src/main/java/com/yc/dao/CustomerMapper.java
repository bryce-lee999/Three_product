package com.yc.dao;

import com.yc.po.Customer;

public interface CustomerMapper {

	/**
	 * 用户登录
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);

	/**
	 * 用户注册
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public int register(Customer customer) throws Exception;

	/**
	 * 更新用户信息
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public int update(Customer customer) throws Exception;
}
