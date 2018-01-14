package com.ln.spring.sysmanage.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ln.spring.sysmanage.dao.IAccountDao;

/**
 * 
 * @author Administrator
 *
 */
public class AccountDao implements IAccountDao{
	
	private JdbcTemplate jdbcTemplate;		 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean addAccountMoney(String account, double money) {
		boolean updateFlag = false;
		String updateSql = "UPDATE M_ACCOUNT SET MONEY = MONEY+? WHERE NAME = ? ";
		int rows = this.jdbcTemplate.update(updateSql, money,account);
		if(rows>0){
			updateFlag = true;			
		}
		return updateFlag;		
	}
	 
	public boolean subAccountMoney(String account, double money) {
		boolean updateFlag = false;
		String updateSql = "UPDATE M_ACCOUNT SET MONEY = MONEY-? WHERE NAME = ? ";
		int rows = this.jdbcTemplate.update(updateSql, money,account);
		if(rows>0){
			updateFlag = true;			
		}
		return updateFlag;
	}
}
