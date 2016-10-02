package com.draupnir.erp.account.mapper;

import org.springframework.stereotype.Repository;

import com.draupnir.erp.account.model.Account;

@Repository
public interface AccountMapper {

	public Account findOne(Long id );
	public Long register(Account account);
	public int update(Account account );

}
