package com.yc.dao;

import com.yc.po.Customer;

public interface CustomerMapper {

	/**
	 * ÓÃ»§µÇÂ¼
	 * @param customer
	 * @return
	 */
	public Customer login(Customer customer);
}
