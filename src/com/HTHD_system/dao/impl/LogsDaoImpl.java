package com.HTHD_system.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.HTHD_system.dao.LogsDao;
import com.HTHD_system.pojo.Logs;

public class LogsDaoImpl extends BaseDao implements LogsDao {

	public int login(Logs logs) {
		String statementName="login";
		Object object=save(statementName, logs);
		if (object instanceof Integer) {
			return Integer.parseInt(object.toString());
		}
		return 0;
	}


	public int logout(Logs logs) {
		String statementName="logout";
		Object object=save(statementName, logs);
		if (object instanceof Integer) {
			return Integer.parseInt(object.toString());
		}
		return 0;
	}

}
