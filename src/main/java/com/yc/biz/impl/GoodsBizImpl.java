package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IGoodsBiz;
import com.yc.dao.GoodsMapper;
import com.yc.po.Goods;
import com.yc.util.StringUtil;
@Service
public class GoodsBizImpl implements IGoodsBiz {

	@Autowired
	private GoodsMapper mapper;

	@Override
	public List<Goods> findAll() throws Exception {
		List<Goods> list = mapper.findAll();
		return list;
	}

	@Override
	public List<Goods> findByTino(Integer[] tinos) throws Exception {
		List<Goods> list = mapper.findByTino(tinos);
		return list;
	}

	@Override
	public List<Goods> findByName(String name) throws Exception {
		List<Goods> list = mapper.findByName(name);
		return list;
	}

	@Override
	public int addGoods(Goods goods) throws Exception {
		if(StringUtil.isNull(goods.getGname(),goods.getGimg())) return 0;
		return mapper.addGoods(goods);
	}

	@Override
	public int delGoods(Integer gno) throws Exception {
		return mapper.delGoods(gno);
	}

	@Override
	public int purchase(Goods goods) throws Exception {
		return mapper.purchase(goods);
	}

	@Override
	public int update(Goods goods) throws Exception {
		return mapper.update(goods);
	}


	/**
	 * 分页显示商品信息
	 * @param tino 商品类型编号
	 * @param page 当前是第几页
	 * @param rows 每一页显示多少条记录
	 * @return
	 */
	@Override
	public List<Goods> findByType(int tino, int page, int rows) {
		page = (page-1)*rows;



		return mapper.findByType(tino, page, rows);
	}

	@Override
	public Goods findByGno(Integer gno) throws Exception {
		return mapper.findByGno(gno);
	}

}
