package com.yc.test.biz;

import java.util.List;

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

	@Test
	public void testFindAll() {
		List<Admin> list = biz.findAll();
		for(Admin admin:list) {
			System.out.println(admin);
		}
	}

	@Test
	public void testAdd() {
		Admin admin = new Admin();
		admin.setConame("lisi001");
		admin.setCopwd("a");
		System.out.println(biz.add(admin));
	}

	@Test
	public void testUpdate() {
		System.out.println(biz.update(1001,1008));
	}

	@Test
	public void testChangeStataus() {
		System.out.println(biz.changeStatus(1001, 1008));
	}

}
