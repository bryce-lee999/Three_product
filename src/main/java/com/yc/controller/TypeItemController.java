package com.yc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yc.biz.ITypeItemBiz;
import com.yc.po.TypeItem;
@Controller
@RequestMapping("/typeitem")
public class TypeItemController {

	@Autowired
	private ITypeItemBiz biz;

	private Gson gson = new Gson();


	@RequestMapping(value ="/byTno",method = RequestMethod.POST,produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String findTypeitem(@RequestParam("tnos") Integer[] tnos
			,HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("findTypeitem tnos:"+tnos);
		//判断tnos是否为空
		//......

		//真实代码
		List<TypeItem> list = new ArrayList<TypeItem>();
		for(int i=0;i<tnos.length;i++) {
			list.addAll(biz.findByTno(tnos[i]));
		}
		return gson.toJson(list);
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public List<TypeItem> findAll() throws Exception {
		return biz.findAll();
	}
}
