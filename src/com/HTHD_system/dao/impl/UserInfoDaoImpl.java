package com.HTHD_system.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.HTHD_system.dao.UserInfoDao;

public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {

	public List<Integer> getUserIDS(String username) {
		if (username == null) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		String statementName = "getUserIDS";
		String[] names = username.split(",");
		map.put("name", map);
		return getAll(statementName, map);
	}


}
