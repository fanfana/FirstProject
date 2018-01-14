package com.ln.spring.sysmanage.dao;


/**
 * 用于对外提供转账服务的操作接口
 * @author Administrator
 *
 */
public interface IAccountDao {

	/**
	 * 往某个账户转入金额
	 * @param account 转入账户名称
	 * @param money   转入账户金额
	 * @return
	 */
	public boolean addAccountMoney(String account ,double money);	
	 
	/**
	 * 往某个账户转出金额
	 * @param account 转出账户名称
	 * @param money   转出账户金额
	 * @return
	 */
	public boolean subAccountMoney(String account ,double money);		
}
