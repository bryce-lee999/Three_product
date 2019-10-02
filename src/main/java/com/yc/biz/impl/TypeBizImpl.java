package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.ITypeBiz;
import com.yc.dao.TypeMapper;
import com.yc.po.Type;
@Service
public class TypeBizImpl implements ITypeBiz {

	@Autowired
	private TypeMapper mapper;

	@Override
	public List<Type> findAll() throws Exception {
		List<Type> list = mapper.findAll();
		return list;
	}

	@Override
	public List<Type> findByName(String tname) throws Exception {
		List<Type> list = mapper.findByName(tname);
		return list;
	}

	@Override
	public Type findByTno(Integer tno) throws Exception {
		Type type = new Type();
		type = mapper.findByTno(tno);
		return type;
	}

	@Override
	public List<Type> finds() throws Exception {
		return mapper.finds();
	}

}
