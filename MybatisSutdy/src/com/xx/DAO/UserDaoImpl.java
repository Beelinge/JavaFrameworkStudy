package com.xx.DAO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.xx.pojo.User;

public class UserDaoImpl implements UserDao{

	private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public User queryUserById(int id) {
		SqlSession sqlSeesion = this.sqlSessionFactory.openSession();
		User user = sqlSeesion.selectOne("User.queryUserById", id);
		sqlSeesion.close();
		return user;
	}

}
