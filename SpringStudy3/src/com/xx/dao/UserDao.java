package com.xx.dao;

public interface UserDao {
	public void outMoney(String from, Double money);
	public void inMoney(String to, Double money);
	
}
