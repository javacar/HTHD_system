package com.HTHD_system.dao.impl;

import com.HTHD_system.dao.AccountDao;
import com.HTHD_system.pojo.Account;

public class AccountDaoImpl extends BaseDao implements AccountDao {

	public Account getAccount(Account account) {
		String statementName = "findAccountByNameAndPass";
		Object object = getObject(statementName, account);
		if (object instanceof Account) {
			return (Account) object;
		}
		return account;
	}
}
