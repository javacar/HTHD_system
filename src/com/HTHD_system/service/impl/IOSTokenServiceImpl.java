package com.HTHD_system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.HTHD_system.dao.IOSTokenDao;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;
import com.HTHD_system.service.IOSTokenService;
import com.HTHD_system.util.NumberHandle;

public class IOSTokenServiceImpl implements IOSTokenService {

	private IOSTokenDao tokenDao;

	public IOSTokenDao getTokenDao() {
		return tokenDao;
	}

	public void setTokenDao(IOSTokenDao tokenDao) {
		this.tokenDao = tokenDao;
	}
//群发去重复
	public List<IOSToken> getAllTokens() {
		return tokenDao.getAllTokens();
	}

	public int getTokensCount() {
		// TODO Auto-generated method stub
		return tokenDao.getTokensCount();
	}

	public int updateToken(String token) {
		if (token== null) {
			return 0;
		}
		
		return tokenDao.updateToken(token);
	}

	public List<IOSToken> getUserIDSByPrize(Prize prize) {
	
		return tokenDao.getUserIDSByPrize(prize);
	}

	public List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo) {

		return tokenDao.getUserIDSByUserInfo(userInfo);
	}

	public List<IOSToken> getUserIDSByUserName(String[] values) {
		List<String> list=new ArrayList<String>();
		for (String string : values) {
			list.add(string);
		}
		return tokenDao.getUserIDSByUserName(list);
	}

	public int getTokensCountByUserName(String[] values) {
		List<String> list=new ArrayList<String>();
		for (String string : values) {
			list.add(string);
		}
		return  tokenDao.getTokensCountByUserName(list);
	}



	public int getTokensCountByUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return tokenDao.getTokensCountByUserInfo(userInfo);
	}

	
	public int getTokensCountByPrize(Prize prize2) {
		// TODO Auto-generated method stub
		return tokenDao.getTokensCountByPrize(prize2);
	}


	
	





}
