package com.HTHD_system.dao.impl;

import java.util.List;

import com.HTHD_system.dao.TVProgarmDao;
import com.HTHD_system.pojo.TVProgarm;

public class TVProgarmDaoImpl extends BaseDao implements TVProgarmDao {


	public List<TVProgarm> getAllTVProgarms() {
		String statementName="getAllTVProgarms";
		return getAll(statementName);
	}

}
