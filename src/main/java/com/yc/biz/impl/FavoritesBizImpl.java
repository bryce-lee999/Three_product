package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IFavoritesBiz;
import com.yc.dao.FavoritesMapper;
import com.yc.po.Cart;
import com.yc.po.Favorites;
@Service
public class FavoritesBizImpl implements IFavoritesBiz {

	@Autowired
	private FavoritesMapper mapper;

	@Override
	public int addCart(Favorites favorite) {
		return mapper.addCart(favorite);
	}

	@Override
	public List<Cart> getFavorite(Integer cno) {
		return mapper.getFavorite(cno);
	}

}
