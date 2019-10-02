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
import com.yc.biz.ITypeBiz;
import com.yc.po.Type;

@Controller
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private ITypeBiz biz;

	private Gson gson = new Gson();

	@RequestMapping("/findAll")
	@ResponseBody
	public List<Type> findAll() throws Exception{
		List<Type> list = biz.findAll();
		return list;
	}

	@RequestMapping(value = "/byTno",method = RequestMethod.POST,produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String findTypeByTno(@RequestParam("tnos") Integer[] tnos
			,HttpServletRequest request,HttpServletResponse response) throws Exception {
		//测试tnos是否为空
		//method
		System.out.println("findTypeByTno tnos:"+tnos);

		List<Type> list = new ArrayList<Type>();
		//获取类型数据 真实代码
		for(int i=0;i<tnos.length;i++) {
			list.add(biz.findByTno(tnos[i]));
		}
		return gson.toJson(list);
	}

	@RequestMapping("/finds")
	@ResponseBody
	public List<Type> finds() throws Exception{
		return biz.finds();
	}


}
