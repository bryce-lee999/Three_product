package com.yc.controller;

import java.util.List;

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
		if(info==null||info.getCostatus()==0) return 0;
		session.setAttribute("loginAdmin", info);
		return 1;
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public List<Admin> findAll(){
		List<Admin> list = biz.findAll();
		return list;
	}

	@RequestMapping("/add")
	@ResponseBody
	public int add(Admin admin) {
		return biz.add(admin);
	}

	@RequestMapping("/update")
	@ResponseBody
	public int update(Admin admin_reset,HttpSession session) {
		Admin admin = (Admin) session.getAttribute("loginAdmin");
		System.out.println("��ǰ��¼�Ĺ���Ա��"+admin);
		return biz.update(admin.getCoid(),admin_reset.getCoid());
	}

	@RequestMapping("/changeStatus")
	@ResponseBody
	public int changeStatus(Admin admin_reset,HttpSession session) {
		Admin admin = (Admin) session.getAttribute("loginAdmin");
		System.out.println("��ǰ��¼�Ĺ���Ա��"+admin);
		return biz.changeStatus(admin.getCoid(), admin_reset.getCoid());
	}














	/**
	 * ���췽��
	 * @param biz
	 */
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
