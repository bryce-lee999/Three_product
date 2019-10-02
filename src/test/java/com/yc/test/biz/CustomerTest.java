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

	@Test
	public void testRegister() {
		//insert into customer(cname,pwd,tel,addr,ano,csex)
		//values(#{cname},#{pwd},#{tel},#{addr},#{ano},#{csex})
		Customer customer = new Customer();
		customer.setCname("test002");
		customer.setPwd("a");
		customer.setTel("14789632456");
		customer.setAddr("江西省九江市彭泽县");
		customer.setCsex("女");
		customer.setCcodetype("身份证");
		customer.setCcodenumber("360430199901011234");
		try {
			System.out.println(biz.register(customer));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() throws Exception {
		Customer customer = new Customer();
		customer.setCno(2);
		customer.setPwd("b");
		System.out.println(biz.update(customer));
	}
}
