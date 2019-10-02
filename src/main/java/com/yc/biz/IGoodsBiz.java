package com.yc.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yc.po.Goods;

public interface IGoodsBiz {

		//<!-- ����������Ʒ -->
		public List<Goods> findAll() throws Exception;

		//<!-- tino ������Ʒ -->
		public List<Goods> findByTino(Integer[] tinos) throws Exception;

		//<!-- ͨ����Ʒ��ģ����ѯ���� -->
		public List<Goods> findByName(String name)throws Exception;

		//ͨ����Ų�����Ʒ
		public Goods findByGno(Integer gno) throws Exception;

		/**
		 * ��ҳ��ʾ��Ʒ��Ϣ
		 * @param tino ��Ʒ���ͱ��
		 * @param page ��ǰ�ǵڼ�ҳ
		 * @param rows ÿһҳ��ʾ��������¼
		 * @return
		 */
		public List<Goods> findByType(int tino,int page,int rows);

		//<!-- ������Ʒ -->
		public int addGoods(Goods goods)throws Exception;

		//<!-- ɾ����Ʒ -->
		public int delGoods(Integer gno) throws Exception;

		//<!-- ������Ʒ -->
		public int purchase(Goods goods) throws Exception;

		//<!-- �޸���Ʒ��Ϣ -->
		public int update(Goods goods) throws Exception;
}
