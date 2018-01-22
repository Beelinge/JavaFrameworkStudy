package com.xx.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class UserJunit {
	@Test
	public void find() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springTestDB");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update("insert into user values (1, 'beelin' ) ");
	}
	
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	@Test
	public void test2() {
		jdbcTemplate.update("insert into user values (4, 'beelin' ) ");
	}
}
