package com.yc.dao;

import java.util.List;

import com.yc.po.Cart;
import com.yc.po.Favorites;

public interface FavoritesMapper {

	/**
	 * 加入购物车
	 * @param favorite
	 * @return
	 */
	public int addCart(Favorites favorite);


	/**
	 * 获取当前用户的购物车中的商品详情
	 * @param cno
	 * @return
	 */
	public List<Cart> getFavorite(Integer cno);
}
