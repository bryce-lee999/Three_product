package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IAdminBiz;
import com.yc.dao.AdminMapper;
import com.yc.po.Admin;
import com.yc.util.StringUtil;

@Service
public class AdminBizImpl implements IAdminBiz {

	@Autowired
	private AdminMapper mapper;

	@Override
	public Admin login(Admin admin) {
		if(StringUtil.isNull(admin.getConame(),admin.getCopwd())) {
			return null;
		}
		return mapper.login(admin);
	}

	@Override
	public List<Admin> findAll() {
		List<Admin> list = mapper.findAll();
		return list;
	}

	@Override
	public Admin findOne(Integer coid) {
		return mapper.findOne(coid);
	}

	@Override
	public int add(Admin admin) {
		return mapper.add(admin);
	}

	@Override
	public int update(Integer coid,Integer coid_reset) {
		Admin admin = mapper.findOne(coid);
		if(admin.getColevel()!=1) return 0;
		return mapper.update(coid_reset);
	}

	@Override
	public int changeStatus(Integer coid, Integer coid_reset) {
		Admin admin = mapper.findOne(coid);
		if(admin.getColevel()!=1||admin.getCoid().equals(coid_reset)) return 0;
		Admin admin_reset = mapper.findOne(coid_reset);
		if(admin_reset.getCostatus()==0) return mapper.changeStatus(coid_reset,1);
		return mapper.changeStatus(coid_reset,0);
	}



}
