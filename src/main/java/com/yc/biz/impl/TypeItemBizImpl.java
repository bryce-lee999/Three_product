package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.ITypeItemBiz;
import com.yc.dao.TypeItemMapper;
import com.yc.po.TypeItem;
@Service
public class TypeItemBizImpl implements ITypeItemBiz {

	@Autowired
	private TypeItemMapper mapper;

	@Override
	public List<TypeItem> findAll() throws Exception {
		List<TypeItem> list = mapper.findAll();
		return list;
	}

	@Override
	public TypeItem findByTino(Integer tino) throws Exception {
		TypeItem typeItem = new TypeItem();
		typeItem = mapper.findByTino(tino);
		return typeItem;
	}

	@Override
	public List<TypeItem> findByTiname(String tiname) throws Exception {
		List<TypeItem> list = mapper.findByTiname(tiname);
		return list;
	}

	@Override
	public List<TypeItem> findByTno(Integer tno) throws Exception {
		List<TypeItem> list = mapper.findByTno(tno);
		return list;
	}

	@Override
	public List<TypeItem> findByPO(TypeItem typeItem) throws Exception {
		List<TypeItem> list = mapper.findByPO(typeItem);
		return list;
	}

}
