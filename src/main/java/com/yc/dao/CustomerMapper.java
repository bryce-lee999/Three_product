package com.yc.dao;

import com.yc.po.Customer;

public interface CustomerMapper {

	/**
	 * �û���¼
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);
}
