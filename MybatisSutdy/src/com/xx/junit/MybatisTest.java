package com.xx.junit;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xx.pojo.User;

public class MybatisTest {
//	private SqlSessionFactory sqlSessionFactory = null;
//	@Test
//	public void testMybatis() throws Exception {
//		// 1. 创建SqlSessionFactoryBuilder对象
//				SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//
//				// 2. 加载SqlMapConfig.xml配置文件
//				InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//
//				// 3. 创建SqlSessionFactory对象
//				this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//				
//				
//			}

		@Test
			public void testQueryUserById() throws Exception {
				// 1. 创建SqlSessionFactoryBuilder对象
				SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

				// 2. 加载SqlMapConfig.xml配置文件
				InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

				// 3. 创建SqlSessionFactory对象
				SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
								
				// 4. 创建SqlSession对象
				SqlSession sqlSession = sqlSessionFactory.openSession();

				// 5. 执行SqlSession对象执行查询，获取结果User
				// 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
				User user = sqlSession.selectOne("User.queryUserById", 11);

				// 6. 打印结果
				System.out.println(user);

				// 7. 释放资源
				sqlSession.close();
			}
		@Test
		public void testQueryUserByUsername() throws Exception {
			// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. 加载SqlMapConfig.xml配置文件
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

			// 3. 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
							
			// 4. 创建SqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();

			// 5. 执行SqlSession对象执行查询，获取结果User
			List<User> list = sqlSession.selectList("User.queryUserByUsername", "王五");
			

			// 6. 打印结果
			System.out.println(list);

			// 7. 释放资源
			sqlSession.close();
		}
		
		@Test
		public void testInsertUser() throws Exception {
			// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. 加载SqlMapConfig.xml配置文件
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

			// 3. 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
							
			// 4. 创建SqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();

			User u = new User();
			u.setUsername("Beelin");
			u.setBirthday(new Date());
			u.setSex("男");
			u.setAddress("GuangZhou");
			
			// 5. 执行SqlSession对象执行查询，获取结果User
			sqlSession.insert("User.insertUser", u);
			sqlSession.commit();

			System.out.println(u.getId()+"");
			// 7. 释放资源
			sqlSession.close();
		}
		
		@Test
		public void testUpdateUser() throws Exception {
			// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. 加载SqlMapConfig.xml配置文件
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

			// 3. 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
							
			// 4. 创建SqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();

			User u = new User();
			u.setAddress("GuangZhouLuFeng");
			
			// 5. 执行SqlSession对象执行查询，获取结果User
			sqlSession.update("User.updateUser", u);
			sqlSession.commit();

			// 7. 释放资源
			sqlSession.close();
		}
		
		@Test
		public void testDeleteUser() throws Exception {
			// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. 加载SqlMapConfig.xml配置文件
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

			// 3. 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
							
			// 4. 创建SqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();

			String username = "Beelin";
			
			// 5. 执行SqlSession对象执行查询，获取结果User
			sqlSession.delete("User.deleteUserByUsername", username);
			sqlSession.commit();

			// 7. 释放资源
			sqlSession.close();
		}
	}


