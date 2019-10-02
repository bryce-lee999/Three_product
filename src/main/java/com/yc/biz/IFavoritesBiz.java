package com.yc.biz;

import java.util.List;

import com.yc.po.Cart;
import com.yc.po.Favorites;

public interface IFavoritesBiz {

	/**
	 * 添加购物车
	 * @param favorite
	 * @return
	 */
	public int addCart(Favorites favorite);

	/**
	 * 获取当前用户购物车中的商品信息
	 * @param cno
	 * @return
	 */
	public List<Cart> getFavorite(Integer cno);
}
