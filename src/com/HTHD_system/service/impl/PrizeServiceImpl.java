package com.HTHD_system.service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HTHD_system.dao.PrizeDao;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.service.PrizeService;

public class PrizeServiceImpl implements PrizeService {

private  PrizeDao prizeDao;

	public PrizeDao getPrizeDao() {
	return prizeDao;
}

public void setPrizeDao(PrizeDao prizeDao) {
	this.prizeDao = prizeDao;
}

	public String xmlPrize(int avid) {
		StringBuilder builder = new StringBuilder();
		List<Prize> prizes=prizeDao.getAllPrizes(avid);
		builder.append("<response>");
		for (Prize prize : prizes) {
			builder.append("<prize>\n<prizename>");
			builder.append(prize.getPrizeMessage());
			builder.append("</prizename>\n<prizevalue>");
			builder.append(prize.getPrizeId());
			builder.append("</prizevalue></prize>\n");
		}
		builder.append("</response>");
		return builder.toString();
	}

	
	public Prize getPrize(int prizeID) {
		
		return prizeDao.getPrize(prizeID);
	}
	

}
