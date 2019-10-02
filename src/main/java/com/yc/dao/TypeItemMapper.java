package com.yc.dao;

import java.util.List;

import com.yc.po.TypeItem;

public interface TypeItemMapper {

	//<!-- �������������� -->
	public List<TypeItem> findAll() throws Exception;

	//<!-- ͨ���������� -->
	public TypeItem findByTino(Integer tino) throws Exception;

	//<!-- ͨ������ģ����ѯ -->
	public List<TypeItem> findByTiname(String tiname) throws Exception;

	//<!-- ͨ�������Ͳ��� -->
	public List<TypeItem> findByTno(Integer tno) throws Exception;

	//<!-- ͨ��PO���������Ʒ���� -->
	public List<TypeItem> findByPO(TypeItem typeItem) throws Exception;


}
