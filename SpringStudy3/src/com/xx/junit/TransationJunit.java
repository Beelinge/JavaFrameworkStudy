package com.xx.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xx.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transactionApplicationContext.xml")
							   
public class TransationJunit {
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void test1() {
		us.transfer("beelin", "beelei", 100d);
	}
}
