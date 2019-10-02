package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IFavoritesBiz;
import com.yc.po.Cart;
import com.yc.po.Customer;
import com.yc.po.Favorites;

@Controller
@RequestMapping("/favorite")
public class FavoritesController {

	@Autowired
	private IFavoritesBiz biz;

	@RequestMapping("/addcart")
	@ResponseBody
	public int addCart(Favorites favorite,HttpSession session) {
		Customer customer = (Customer) session.getAttribute("loginCustomer");
		favorite.setCno(customer.getCno());
		System.out.println(favorite);
		return biz.addCart(favorite);
	}

	@RequestMapping("/getfavorite")
	@ResponseBody
	public List<Cart> getFavorite(HttpSession session){
		Customer customer = (Customer) session.getAttribute("loginCustomer");
		Integer cno = customer.getCno();
		return biz.getFavorite(cno);
	}

	@RequestMapping("/jump")
	@ResponseBody
	public int jump(HttpServletRequest request,HttpSession session){
		String[] fids = request.getParameterValues("fids");
		session.setAttribute("fids", fids);
		return 1;
	}
}
