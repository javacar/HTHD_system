package com.HTHD_system.dao.impl;

import java.util.List;

import com.HTHD_system.action.BaseAction;
import com.HTHD_system.dao.IOSTokenDao;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;

public class IOSTokenDaoImpl extends BaseDao implements IOSTokenDao {

	public List<IOSToken> getUserIDSByPrize(Prize prize) {
		String statementName = "getUserIDSByPrize";
		return getAll(statementName, prize);
	}

	public List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo) {
		String statementName = "getUserIDSByUserInfo";
		return getAll(statementName, userInfo);
	}

	public List<IOSToken> getUserIDSByUserName(List<String> list) {		
		String statementName = "getUserIDSByUserName";
		return getAll(statementName, list);
	}
	public int getTokensCountByUserName(List<String> list) {
		String statementName = "getTokensCountByUserName";
		Object object = getObject(statementName,list);
		if (object == null) {
			return 0;
		}
		return Integer.parseInt(object.toString());
	}


	public int updateToken(Object object) {
		String statementName = "updateTokesByToken";

		return update(statementName, object);
	}

	public List<IOSToken> getAllTokens() {
		String statementName = "getAllTokens";
		return getAll(statementName);
	}

	public int getTokensCount() {
		String statementName = "getCountTokens";
		Object object = getObject(statementName);
		if (object == null) {
			return 0;
		}
		return Integer.parseInt(object.toString());
	}


	public int getTokensCountByPrize(Prize prize2) {
		String statementName = "getTokensCountByPrize";
		Object object = getObject(statementName,prize2);
		if (object == null) {
			return 0;
		}
		return Integer.parseInt(object.toString());
	}


	public int getTokensCountByUserInfo(UserInfo userInfo) {
		String statementName = "getTokensCountByUserInfo";
		Object object = getObject(statementName,userInfo);
		if (object == null) {
			return 0;
		}
		return Integer.parseInt(object.toString());
	}



}
