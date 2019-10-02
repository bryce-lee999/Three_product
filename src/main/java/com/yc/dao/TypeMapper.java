package com.yc.dao;

import java.util.List;

import com.yc.po.Type;

public interface TypeMapper {

	//�������и�����
	public List<Type> findAll() throws Exception;

	//������ģ����ѯ
	public List<Type> findByName(String tname) throws Exception;

	//<!-- ͨ����Ų��¸����� -->
	public Type findByTno(Integer tno)throws Exception;

	//��ѯtno tname
	public List<Type> finds() throws Exception;

}
