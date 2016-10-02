package com.draupnir.erp.account.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.draupnir.erp.account.model.Account;

@Service
public interface AccountService {

	/**
	 * @param account 新帐户信息
	 * @return 注册成功后返回帐户信息
	 */
	public Account register(Account account);
	

	/**
	 * @param id 要锁定的帐户id
	 */
	public void lockAccount(Long id);
	
	
	/**
	 * @param id 要更改密码的帐户ID
	 * @param oldPassword 旧密码
	 * @param newPassword 新密码.
	 */
	public void changePassword(Long id, String oldPassword, String newPassword);
	
	
	/**
	 * @param id 要重置密码的帐户ID
	 * @param newPassword 新密码
	 */
	public void ressetPassword(Long id, String newPassword);
	

	/**
	 * @param map 搜索用的参数清单
	 * @return 搜索结果列表
	 */
	public List<Account> findAll(Map<String, String[]> map);
	
}
