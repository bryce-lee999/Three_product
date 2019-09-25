package com.yc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IAdminBiz;
import com.yc.po.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminBiz biz;

	@RequestMapping("/login")
	@ResponseBody
	public int login(Admin admin,HttpSession session) {
		System.out.println("�������Ϣ��"+admin);
		Admin info = biz.login(admin);
		System.out.println("�õ�����Ϣ��"+info);
		if(info==null) return 0;
		session.setAttribute("loginAdmin", info);
		return 1;
	}

	public AdminController(IAdminBiz biz) {
		super();
		this.biz = biz;
		System.out.println("admin controller ע��.................");
	}

	public AdminController() {
		super();
		System.out.println("admin controller �޲� ע��.................");
	}

}
