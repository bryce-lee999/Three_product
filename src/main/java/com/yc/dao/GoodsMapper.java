package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yc.po.Goods;

public interface GoodsMapper {

	//<!-- ����������Ʒ -->
	public List<Goods> findAll() throws Exception;

	//<!-- tino ������Ʒ -->
	public List<Goods> findByTino(Integer[] tinos) throws Exception;

	//<!-- ͨ����Ʒ��ģ����ѯ���� -->
	public List<Goods> findByName(String name)throws Exception;

	//ͨ����Ų�����Ʒ
	public Goods findByGno(Integer gno) throws Exception;

	//<!-- ������Ʒ -->
	public int addGoods(Goods goods)throws Exception;

	//<!-- ɾ����Ʒ -->
	public int delGoods(Integer gno) throws Exception;

	//<!-- ������Ʒ -->
	public int purchase(Goods po) throws Exception;

	//<!-- �޸���Ʒ��Ϣ -->
	public int update(Goods po) throws Exception;

	//��ҳ
	public List<Goods> findByType(int tino,int page,int rows);

}
