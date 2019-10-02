package com.yc.test.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.IGoodsBiz;
import com.yc.po.Goods;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class GoodsTest {

	@Autowired
	IGoodsBiz biz;

	@Test
	public void testFindAll() throws Exception {
		List<Goods> list = biz.findAll();
		for(Goods goods:list) {
			System.out.println(goods);
		}
	}

	@Test
	public void testFindByTino() throws Exception {
		Integer[] tinos = new Integer[] {1,20,30,40,50,60};
		List<Goods> list = biz.findByTino(tinos);
		for(Goods goods:list) {
			System.out.println(goods);
		}
	}

	@Test
	public void testFindByName() throws Exception {
		List<Goods> list = biz.findByName("");
		for(Goods goods:list) {
			System.out.println(goods);
		}
	}

	@Test
	public void testAddGoods() throws Exception {
		Goods goods = new Goods(null, "银魂2",5,500.0,200,null,"动漫毁真人2!!", null);
		System.out.println(biz.addGoods(goods));
	}

	@Test
	public void testDelGoods() throws Exception {
		System.out.println(biz.delGoods(2));
	}

	@Test
	public void testPurchase() throws Exception {
		Goods goods = new Goods();
		goods.setGno(3);
		goods.setGnum(2);
		System.out.println(biz.purchase(goods));
	}

	@Test
	public void testUpdate() throws Exception {
		Goods goods = new Goods();
		goods.setGno(3);
		goods.setGnum(100);
		System.out.println(biz.update(goods));
	}

	@Test
	public void testFindByGno() throws Exception {
		System.out.println(biz.findByGno(1));
	}

}
