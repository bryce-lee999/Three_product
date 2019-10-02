package com.yc.test.biz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.biz.IFavoritesBiz;
import com.yc.po.Cart;
import com.yc.po.Favorites;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class FavoritesTest {

	@Autowired
	private IFavoritesBiz biz;

	@Test
	public void testAddCart() {
		Favorites favorite = new Favorites();
		favorite.setCno(1);
		favorite.setGno(1);
		favorite.setFnum(3);
		favorite.setFdate("2019-10-1 21:12");
		System.out.println(biz.addCart(favorite));
	}

	@Test
	public void testGetFavorite() {
		List<Cart> list = new ArrayList<>();
		list = biz.getFavorite(1);
		for(Cart c:list) {
			System.out.println(c);
		}
	}

}
