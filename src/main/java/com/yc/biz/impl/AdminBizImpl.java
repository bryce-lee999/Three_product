package com.yc.biz.impl;

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

}
