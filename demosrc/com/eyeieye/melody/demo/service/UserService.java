package com.eyeieye.melody.demo.service;

import com.eyeieye.melody.demo.domain.User;

/**
 * 用户Service接口
 * 
 * @author zhengdd
 * @version $Id: UserService.java,v 1.1 2011/06/20 07:43:14 fish Exp $
 */
public interface UserService {

	/**
	 * 注册用户并获取注册后的信息
	 * 
	 * @param user
	 * @return User
	 */
	public User register(User user);

	/**
	 * 根据用户名称和明文口令获得用户
	 * 
	 * @param realName
	 * @param password
	 * @return
	 */
	public User getUserByNamePasswd(String realName, String password);

}
