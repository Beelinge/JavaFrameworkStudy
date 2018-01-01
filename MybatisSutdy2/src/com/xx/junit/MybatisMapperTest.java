package com.xx.junit;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xx.pojo.Order;
import com.xx.pojo.QueryVo;
import com.xx.pojo.User;

import mapper.OrderMapper;
import mapper.UserMapper;

public class MybatisMapperTest {
	@Test
	public void queryUserByQueryVo() throws Exception {
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(input);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = new User();
		user.setUsername("王");
		QueryVo queryVo = new QueryVo();
		queryVo.setUser(user);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> queryUserByQueryVo = mapper.queryUserByQueryVo(queryVo);
		for (User u : queryUserByQueryVo) {
			System.out.println(u);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void queryOrderAll() throws Exception {
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(input);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		 List<Order> queryOrderAll = mapper.queryOrderAll();
		for (Order o : queryOrderAll) {
			System.out.println(o);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void testQueryUserByWhere() throws Exception {
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(input);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = new User();
//		user.setSex("1");
//		user.setUsername("张");
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		 List<User> users = mapper.queryUserByWhere(user);
		for (User u : users) {
			System.out.println(u);
		}
		
		sqlSession.close();
	}
}
