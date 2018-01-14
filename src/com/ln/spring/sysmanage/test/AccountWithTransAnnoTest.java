package com.ln.spring.sysmanage.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ln.spring.sysmanage.service.IAccountService;

public class AccountWithTransAnnoTest {

	private  ApplicationContext ac = null;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
	}	 
		
	@Test
	public void testOperatorAccount(){
		IAccountService accountService = (IAccountService)ac.getBean("accountService");
		accountService.operateAccount("李四", "张三", 100);
	}	
}
