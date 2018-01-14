package com.ln.spring.sysmanage.service;


/**
 * 用于对外提供转账服务的操作接口
 * @author Administrator
 *
 */
public interface IAccountService {
	
	/**
	 * 模拟从一个账户转账到另外一个账户
	 * @param fromAccount
	 * @param toAccount
	 * @param money
	 * @return
	 */
	public boolean operateAccount(String fromAccount, String toAccount ,double money) ;
		
}
