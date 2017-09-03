package com.HTHD_system.dao.impl;

import java.util.List;

import com.HTHD_system.dao.PrizeDao;
import com.HTHD_system.pojo.Prize;

public class PrizeDaoImpl extends BaseDao implements PrizeDao {


	public List<Prize> getAllPrizes(int avid) {
		String statementName="getAllPrizes";
		return getAll(statementName,avid);
	}
	public Prize getPrize(int prizeID) {
		String statementName="getPrize";
		Object object=getObject(statementName,prizeID);
		if (object instanceof Prize) {
			return (Prize) object;
		}
	
		return null;
	}



}
