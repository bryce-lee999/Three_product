package com.yc.dao;

import java.util.List;

import com.yc.po.Cart;
import com.yc.po.Favorites;

public interface FavoritesMapper {

	/**
	 * ���빺�ﳵ
	 * @param favorite
	 * @return
	 */
	public int addCart(Favorites favorite);


	/**
	 * ��ȡ��ǰ�û��Ĺ��ﳵ�е���Ʒ����
	 * @param cno
	 * @return
	 */
	public List<Cart> getFavorite(Integer cno);
}
