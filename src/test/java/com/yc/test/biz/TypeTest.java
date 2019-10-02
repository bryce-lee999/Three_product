package com.yc.test.biz;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.ITypeBiz;
import com.yc.po.Type;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class TypeTest {

	@Autowired
	ITypeBiz biz;

	@Test
	public void testFindAll() throws Exception {
		List<Type> list = biz.findAll();
		for(Type type:list) {
			System.out.println(type);
		}
	}

	@Test
	public void testFindByName() throws Exception {
		String tname = " È";
		List<Type> list = biz.findByName(tname);
		for(Type type:list) {
			System.out.println(type);
		}
	}

	@Test
	public void testFindByTno() throws Exception {
		Integer tno = 1;
		Type type = new Type();
		type = biz.findByTno(tno);
		System.out.println(type);
	}

	@Test
	public void testFinds() throws Exception {
		List<Type> list = biz.finds();
		for(Type type:list) {
			System.out.println(type);
		}
	}

}
