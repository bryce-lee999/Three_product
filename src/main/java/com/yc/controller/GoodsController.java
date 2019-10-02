package com.yc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.yc.biz.IGoodsBiz;
import com.yc.po.Goods;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private IGoodsBiz biz;

	private Gson gson = new Gson();

	@RequestMapping(value = "findById",method = RequestMethod.POST,produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String findById(@RequestParam("tinos") Integer[] tinos
			,HttpServletRequest request,HttpServletResponse response) throws Exception {

		System.out.println("findById tnos:"+tinos);
		String result = null;

		//�������� ��ʵ����
		if(tinos == null) {
			result= gson.toJson(biz.findAll());
			return result;
		}
		// ������������ ��ʵ����
		result = gson.toJson(biz.findByTino(tinos));
		return result;
	}


	@RequestMapping("/findAll")
	@ResponseBody
	public List<Goods> findAll() throws Exception{
		List<Goods> list = biz.findAll();
		return list;
	}

//	@RequestMapping("/findByPage")
//	@ResponseBody
//	public List<Goods> findByPage(int tino,int page,int rows){
//		return biz.findByType(tino, page, rows);
//	}


	@RequestMapping(value = "findByGno",method = RequestMethod.POST,produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String findByGno(@RequestParam("gno") Integer gno) throws Exception {

		//���������Ƿ�Ϊ�ջ���Ϊ����
		if(gno == null||gno<0) {
			return "-1";
		}
		Goods po = null;
		//���ݲ�ѯ
		po = biz.findByGno(gno);
		return gson.toJson(po);
	}


//	@RequestMapping("/upload")
//	@ResponseBody
//	public Map<String,Object> upload(@RequestParam("pic")MultipartFile pic,HttpServletRequest request) {
//		Map<String,Object> map = new HashMap<>();
//		if(!pic.isEmpty()) {
//			String path = request.getServletContext().getRealPath("");
//			String temp = "pic";
//			String filePath = new Date().getTime()+"_"+pic.getOriginalFilename();
//			File file = new File(new File(path),"../"+temp+"/"+filePath);
//			try {
//				pic.transferTo(file);
//			} catch (IllegalStateException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			map.put("fileName", pic.getOriginalFilename());
//			map.put("upload", 1);
//			map.put("url","../../../pic"+filePath);
//
//		}
//		return map;
//	}


	@RequestMapping(value="/addGoods")
	@ResponseBody
	public int addGoods(@RequestParam("pic")MultipartFile pic,HttpServletRequest request) throws Exception {
		Goods goods = new Goods();
		String tino = request.getParameter("tino");
		String gname = request.getParameter("gname");
		String gprice = request.getParameter("gprice");
		String gnum = request.getParameter("gnum");
		String gdescribe = request.getParameter("gdescribe");
		goods.setTino(Integer.parseInt(tino));
		goods.setGname(gname);
		goods.setGprice(Double.parseDouble(gprice));
		goods.setGnum(Integer.parseInt(gnum));
		goods.setGdescribe(gdescribe);
		System.out.println(goods);

		if(!pic.isEmpty()) {
			String path = request.getServletContext().getRealPath("");
			String filePath = new Date().getTime()+"_"+pic.getOriginalFilename();
			String temp = "../pic/"+filePath;
			File file = new File(new File(path),temp);
			try {
				pic.transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			temp = "../../"+temp;
			goods.setGimg(temp);
			System.out.println(goods);
		}
		return biz.addGoods(goods);
	}

//	@RequestMapping(value="/addGoods")
//	@ResponseBody
//	public int addGoods(@RequestParam("pics")MultipartFile[] pics,HttpServletRequest request,Goods goods) throws Exception {
//		System.out.println("������GoodsController......");
//		String savePath = "pics";
//		if(null!=pics && pics.length>0 && !pics[0].isEmpty()) {
//			String bathPath = request.getServletContext().getRealPath("");
//			//�ļ��ϴ���洢��·������ web.xml�����ļ�������˳�ʼ������
//			String temp = request.getServletContext().getInitParameter("uploadPath");
//			if(temp!=null) {
//				savePath = temp;
//			}
//			String picStr = "";
//			File dest = null;
//			String path = "";
//			try {
//				for(MultipartFile f:pics) {
//					//�����ļ�����
//					path = savePath+"/"+new Date().getTime()+"_"+f.getOriginalFilename();
//					dest = new File(new File(bathPath).getParentFile(),path);
//					//��ͼƬ���浽������
//					f.transferTo(dest);
//					picStr += path+";";
//				}
//				//ѭ�����·���洢
//				goods.setGimg(picStr);
//			} catch (IllegalStateException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println(goods);
//		// ����biz
//		return biz.addGoods(goods);
//	}



}
