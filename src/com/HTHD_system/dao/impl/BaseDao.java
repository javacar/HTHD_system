package com.HTHD_system.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.HTHD_system.pojo.Account;
import com.HTHD_system.pojo.ActVersion;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.TVProgarm;
import com.HTHD_system.pojo.UserInfo;
import com.HTHD_system.service.IOSTokenService;
import com.HTHD_system.service.NotificationService;
import com.HTHD_system.service.PrizeService;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class BaseDao extends SqlMapClientDaoSupport {

	public Object getObject(String statementName, Object o) {
		if (statementName == null || o == null) {
			return null;
		}
		return getSqlMapClientTemplate().queryForObject(statementName, o);
	}

	public Object getObject(String statementName) {
		if (statementName == null) {
			return null;
		}
		return getSqlMapClientTemplate().queryForObject(statementName);
	}

	public List getAll(String statementName) {
		if (statementName == null) {
			return null;
		}
		return getSqlMapClientTemplate().queryForList(statementName);
	}

	public List getAll(String statementName, Object o) {
		if (statementName == null || o == null) {
			return null;
		}
		return getSqlMapClientTemplate().queryForList(statementName, o);
	}

	public Object save(String statementName, Object o) {
		if (statementName == null || o == null) {
			return null;
		}
		return getSqlMapClientTemplate().insert(statementName, o);

	}

	public int update(String statementName, Object o) {
		if (statementName == null || o == null) {
			return 0;
		}

		return getSqlMapClientTemplate().update(statementName, o);

	}

	public int update(String statementName) {
		if (statementName == null) {
			return 0;
		}

		return getSqlMapClientTemplate().update(statementName);

	}

	public int delete(String statementName, Object o) {
		if (statementName == null || o == null) {
			return 0;
		}
		return getSqlMapClientTemplate().delete(statementName, o);
	}

	public static void main(String[] args) throws Exception {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
IOSTokenService tokenService=(IOSTokenService) context.getBean("tokenService");

List<IOSToken> list=tokenService.getAllTokens();
IOSToken token=null;
IOSToken token2=null;
	for (int i = 0; i <list.size()-1; i++) {
		token=list.get(i);
		token2=list.get(i+1);
	
		if (token.getToken().intern()==token2.getToken().intern()) {
		
			list.remove(i);
		}
		System.out.println(token.getToken());
		System.out.println(token2.getToken());
	}

	System.out.println(list.size());

	


	}
}
