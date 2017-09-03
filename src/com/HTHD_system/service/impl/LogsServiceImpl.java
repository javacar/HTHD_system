package com.HTHD_system.service.impl;

import java.util.Date;

import com.HTHD_system.dao.LogsDao;
import com.HTHD_system.pojo.Account;
import com.HTHD_system.pojo.Logs;
import com.HTHD_system.service.LogsService;

public class LogsServiceImpl implements LogsService {
	private LogsDao logsDao;
	public LogsDao getLogsDao() {
		return logsDao;
	}
	public void setLogsDao(LogsDao logsDao) {
		this.logsDao = logsDao;
	}

	public int login(Account account, String ip) {
		if (account.getAccountUid()==null) {
			return 0;
		}
		Logs logs = new Logs();
		logs.setAccount(account);
		logs.setLoginTime(new Date());
		logs.setLogoutTime(new Date());
		logs.setIp(ip);
	return	logsDao.login(logs);

	}

	public int logout(Account account, String ip) {
		if (account.getAccountUid()==null) {
			return 0;
		}
		Logs logs = new Logs();
		logs.setAccount(account);
		logs.setLoginTime(new Date());
		logs.setLogoutTime(new Date());
		logs.setIp(ip);	
		return logsDao.logout(logs);

	}

}
