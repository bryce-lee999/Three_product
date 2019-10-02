package com.yc.test.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.ITypeItemBiz;
import com.yc.po.TypeItem;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class TypeItemTest {

	@Autowired
	private ITypeItemBiz biz;

	@Test
	public void testFindAll() throws Exception {
		List<TypeItem> list = biz.findAll();
		for(TypeItem typeItem:list) {
			System.out.println(typeItem);
		}
	}

	@Test
	public void testFindByTino() throws Exception {
		Integer tino = 7;
		TypeItem typeItem = biz.findByTino(tino);
		System.out.println(typeItem);
	}

	@Test
	public void testFindByTiname() throws Exception {
		List<TypeItem> list = biz.findByTiname("Ʒ");
		for(TypeItem typeItem:list) {
			System.out.println(typeItem);
		}
	}

	@Test
	public void testFindByTno() throws Exception {
		List<TypeItem> list = biz.findByTno(1);
		for(TypeItem typeItem:list) {
			System.out.println(typeItem);
		}
	}

	@Test
	public void testFindByPO() throws Exception {
		TypeItem typeItem = new TypeItem();
		typeItem.setTiname("Ʒ");
		List<TypeItem> list = biz.findByPO(typeItem);
		for(TypeItem typeItems:list) {
			System.out.println(typeItems);
		}
	}

}
