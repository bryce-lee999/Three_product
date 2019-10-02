package com.yc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.ICustomerBiz;
import com.yc.po.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerBiz biz;

	@RequestMapping("/login")
	@ResponseBody
	public int login(Customer customer,HttpSession session) {
		Customer info = biz.login(customer);
		if(info==null) return 0;
		session.setAttribute("loginCustomer", info);
		return 1;
	}

	@RequestMapping("/register")
	@ResponseBody
	public int register(Customer customer,HttpSession session) throws Exception {
		int info = biz.register(customer);
		if(info==0) return 0;
		return info;
	}

}
