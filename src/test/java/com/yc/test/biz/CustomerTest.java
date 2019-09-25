package com.yc.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.ICustomerBiz;
import com.yc.po.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class CustomerTest {

	@Autowired
	ICustomerBiz biz;

	@Test
	public void testLogin() {
		Customer customer = new Customer();
		customer.setCname("test001");
		customer.setPwd("a");
		System.out.println(biz.login(customer));
	}

}
