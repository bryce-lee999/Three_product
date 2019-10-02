package com.yc.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.ICustomerBiz;
import com.yc.dao.CustomerMapper;
import com.yc.po.Customer;
import com.yc.util.StringUtil;

@Service
public class CustomerBizImpl implements ICustomerBiz {

	@Autowired
	private CustomerMapper mapper;

	@Override
	public Customer login(Customer customer) {
		if(StringUtil.isNull(customer.getCname())) return null;
		return mapper.login(customer);
	}

	@Override
	public int register(Customer po) throws Exception {
		return mapper.register(po);
	}

	@Override
	public int update(Customer po) throws Exception {
		return mapper.update(po);
	}

}
