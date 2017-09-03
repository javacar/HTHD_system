package com.HTHD_system.service.impl;

import com.HTHD_system.dao.AccountDao;
import com.HTHD_system.dao.impl.BaseDao;
import com.HTHD_system.pojo.Account;
import com.HTHD_system.service.AccountService;

public class AccountServiceImpl implements AccountService {
private AccountDao accountDao;

	public AccountDao getAccountDao() {
	return accountDao;
}

public void setAccountDao(AccountDao accountDao) {
	this.accountDao = accountDao;
}

	public Account getAccount(String name, String pass) {

		if (name == null || pass == null) {
			return null;
		}
		Account account = new Account();
		account.setName(name);
		account.setPassword(pass);
		return accountDao.getAccount(account);
	}
}
