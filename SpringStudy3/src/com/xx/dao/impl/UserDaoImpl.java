package com.xx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.xx.dao.UserDao;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money,from);
		
	}
	
	@Override
	public void inMoney(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money,to);
		
	}
}
