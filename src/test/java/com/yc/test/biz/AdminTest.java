package com.yc.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.IAdminBiz;
import com.yc.po.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class AdminTest {

	@Autowired
	IAdminBiz biz;

	@Test
	public void testLogin() {
		Admin admin = new Admin();
		admin.setConame("lisi");
		admin.setCopwd("a");
		System.out.println(biz.login(admin));
	}

}
