package com.yc.biz;

import java.util.List;

import com.yc.po.Admin;

public interface IAdminBiz {

	/**
	 * 管理员登录
	 * @param controller
	 * @return
	 */
	public Admin login(Admin controller);

	/**
	 * 查询所有管理员
	 * @return
	 */
	public List<Admin> findAll();

	/**
	 * 查询单个管理员信息
	 * @param coid
	 * @return
	 */
	public Admin findOne(Integer coid);

	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	public int add(Admin admin);

	/**
	 * 重置密码
	 * @param coid
	 * @return
	 */
	public int update(Integer coid,Integer coid_reset);

	/**
	 * 修改账号状态
	 * @param coid
	 * @param coid_reset
	 * @return
	 */
	public int changeStatus(Integer coid,Integer coid_reset);
}
