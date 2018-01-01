package com.xx.DAO;

import com.xx.pojo.User;

public interface UserDao {
	/**
	 * 根据id查询用户
	 * 
	 * @param id
	 * @return
	 */
	User queryUserById(int id);
}
