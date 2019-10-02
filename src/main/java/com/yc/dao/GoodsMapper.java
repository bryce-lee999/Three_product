package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yc.po.Goods;

public interface GoodsMapper {

	//<!-- 查找所有商品 -->
	public List<Goods> findAll() throws Exception;

	//<!-- tino 查找商品 -->
	public List<Goods> findByTino(Integer[] tinos) throws Exception;

	//<!-- 通过商品名模糊查询查找 -->
	public List<Goods> findByName(String name)throws Exception;

	//通过编号查找商品
	public Goods findByGno(Integer gno) throws Exception;

	//<!-- 插入商品 -->
	public int addGoods(Goods goods)throws Exception;

	//<!-- 删除商品 -->
	public int delGoods(Integer gno) throws Exception;

	//<!-- 购买商品 -->
	public int purchase(Goods po) throws Exception;

	//<!-- 修改商品信息 -->
	public int update(Goods po) throws Exception;

	//分页
	public List<Goods> findByType(int tino,int page,int rows);

}
