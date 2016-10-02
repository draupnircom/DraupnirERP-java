package com.draupnir.erp.account.service.impl;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.draupnir.erp.Printer;
import com.draupnir.erp.account.mapper.AccountMapper;
import com.draupnir.erp.account.model.Account;
import com.draupnir.erp.account.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
    @Autowired
    private AccountMapper repository;  
    

	@Override
	//@Transactional
	public Account register(Account account) {
		Long id = this.repository.register(account);
		System.out.println(id);
		Account result = this.repository.findOne(id);
		return result;
	}

	@Override
	public void lockAccount(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(Long id, String oldPassword, String newPassword) {
		Account obj = this.repository.findOne(id);
		obj.setPassword(newPassword);
		repository.update(obj);
		Printer.print(obj);
	}

	@Override
	public void ressetPassword(Long id, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> findAll(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
