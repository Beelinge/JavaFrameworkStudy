package com.xx.service.impl;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.xx.dao.UserDao;
import com.xx.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	private TransactionTemplate transactionTemplate;
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	@Override
	public void transfer(String from, String to, Double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				userDao.outMoney(from, money);
				int d = 1/0;
				userDao.inMoney(to, money);
				
			}
		});
	}
	
	public void transfer2(String from, String to, Double money) {
		userDao.outMoney(from, money);
		int d = 1/0;
		userDao.inMoney(to, money);
	}
	
	@Transactional(isolation=Isolation.REPEATABLE_READ, propagation=Propagation.REQUIRED, readOnly=false )
	public void transfer3(String from, String to, Double money) {
		userDao.outMoney(from, money);
		int d = 1/0;
		userDao.inMoney(to, money);
	}
}
