package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yc.po.Admin;

public interface AdminMapper {

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
	 * 查找单个管理员信息
	 * @param coid
	 * @return
	 */
	public Admin findOne(Integer coid);

	/**
	 * 添加管理员
	 * @return
	 */
	public int add(Admin admin);

	/**
	 * 重置密码
	 * @param coid
	 * @return
	 */
	public int update(Integer coid);

	/**
	 * 修改账号状态
	 * @param coid
	 * @return
	 */
	public int changeStatus(@Param("coid")Integer coid,@Param("costatus")Integer costatus);
}
