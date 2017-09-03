package com.HTHD_system.dao.impl;

import java.util.List;

import com.HTHD_system.dao.ActVersionDao;
import com.HTHD_system.pojo.ActVersion;

public class ActVersionDaoImpl extends BaseDao implements ActVersionDao {

	public List<ActVersion> getAllActVersions(int tvpID) {
		String statementName="getAllActVersions";
		return getAll(statementName, tvpID);
	}



}
