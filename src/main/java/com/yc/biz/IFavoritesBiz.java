package com.yc.biz;

import java.util.List;

import com.yc.po.Cart;
import com.yc.po.Favorites;

public interface IFavoritesBiz {

	/**
	 * ��ӹ��ﳵ
	 * @param favorite
	 * @return
	 */
	public int addCart(Favorites favorite);

	/**
	 * ��ȡ��ǰ�û����ﳵ�е���Ʒ��Ϣ
	 * @param cno
	 * @return
	 */
	public List<Cart> getFavorite(Integer cno);
}
