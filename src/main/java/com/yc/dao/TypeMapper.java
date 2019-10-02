package com.yc.dao;

import java.util.List;

import com.yc.po.Type;

public interface TypeMapper {

	//查找所有父类型
	public List<Type> findAll() throws Exception;

	//按名字模糊查询
	public List<Type> findByName(String tname) throws Exception;

	//<!-- 通过编号查新父类型 -->
	public Type findByTno(Integer tno)throws Exception;

	//查询tno tname
	public List<Type> finds() throws Exception;

}
