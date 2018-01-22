package com.xx.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xx.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transactionApplicationContext2.xml")
							   
public class TransationJunit2 {
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void test2() {
		us.transfer2("beelin", "beelei", 100d);
	}
}
