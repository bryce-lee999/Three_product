package com.yc.dao;

import java.util.List;

import com.yc.po.TypeItem;

public interface TypeItemMapper {

	//<!-- 查找所有子类型 -->
	public List<TypeItem> findAll() throws Exception;

	//<!-- 通过主键查找 -->
	public TypeItem findByTino(Integer tino) throws Exception;

	//<!-- 通过名称模糊查询 -->
	public List<TypeItem> findByTiname(String tiname) throws Exception;

	//<!-- 通过父类型查找 -->
	public List<TypeItem> findByTno(Integer tno) throws Exception;

	//<!-- 通过PO对象查找商品类型 -->
	public List<TypeItem> findByPO(TypeItem typeItem) throws Exception;


}
