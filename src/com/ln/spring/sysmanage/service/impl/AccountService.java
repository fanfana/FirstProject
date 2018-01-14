package com.ln.spring.sysmanage.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ln.spring.sysmanage.dao.IAccountDao;
import com.ln.spring.sysmanage.service.IAccountService;

/**
 * 
 * @author Administrator
 *
 */
public class AccountService implements IAccountService{

	private IAccountDao accountDao;
	 
	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED )
	public boolean operateAccount(String fromAccount, String toAccount ,double money) {
		//转账业务的步骤			
		System.out.println("---------------转账开始---------------");		
		//1 从转账人账户减去转账金额 
		accountDao.subAccountMoney(fromAccount, money);				
		System.out.println("转账金额---------------"+money);		
		//int i = 1/0;		
		//2 从被转账人账户增加转账金额
		accountDao.addAccountMoney(toAccount, money);			
		System.out.println("---------------转账结束---------------");
		return true;
 	}
}
