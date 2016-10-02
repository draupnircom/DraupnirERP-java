package com.draupnir.erp.test.account;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.draupnir.erp.account.model.Account;
import com.draupnir.erp.account.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:/WEB-INF/applicationContext.xml")
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext.xml", "file:src/main/webapp/WEB-INF/spring/spring-data.xml"})   
public class AccountServiceTest extends AbstractJUnit4SpringContextTests  {
	@Autowired
	private AccountService service;

	@Test
	public void testRegister() {
		Account account = new Account();
		account.setUsername("xrmeng");
		account.setPassword("my.password!");
		account.setAccountNonExpired(true);
		account.setAccountNonLocked(true);
		account.setCredentialsNonExpired(true);
		account.setRegistrationDate(new java.sql.Date((new java.util.Date()).getTime()));
		Account result = service.register(account);
		System.out.println(result);
	}
	

	//@Test
	public void testChangePassword() {
		this.service.changePassword(6L, "111", "2p");
		
	}

	
	/*
	@Test
	public void testFindAll() {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		map.put("id", new String[]{">", "2"});
		map.put("username", new String[]{"like", "m"});
		List<Account> list = service.findAll(map);
		
	}
	*/

}
