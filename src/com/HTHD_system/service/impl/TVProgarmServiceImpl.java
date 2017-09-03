package com.HTHD_system.service.impl;

import java.util.List;

import com.HTHD_system.dao.TVProgarmDao;
import com.HTHD_system.pojo.TVProgarm;
import com.HTHD_system.service.TVProgarmService;

public class TVProgarmServiceImpl implements TVProgarmService {
private TVProgarmDao progarmDao;
	
	public TVProgarmDao getProgarmDao() {
	return progarmDao;
}


public void setProgarmDao(TVProgarmDao progarmDao) {
	this.progarmDao = progarmDao;
}

	public String xmlTVProgarm() {
		StringBuilder builder = new StringBuilder();
		List<TVProgarm> progarms = progarmDao.getAllTVProgarms();
		builder.append("<response>");
		for (TVProgarm progarm : progarms) {
			builder.append("<program>\n<programname>");
			builder.append(progarm.getTvpName());
			builder.append("</programname>\n<programvalue>");
			builder.append(progarm.getTvpId());
			builder.append("</programvalue></program>\n");
		}
		builder.append("<response>");
		return builder.toString();
	}


	public String optionsTVProgarm() {
		StringBuilder builder = new StringBuilder();
		List<TVProgarm> progarms = progarmDao.getAllTVProgarms();
		for (TVProgarm progarm : progarms) {
			builder.append("<option value=\"");
			builder.append(progarm.getTvpId());
			builder.append("\">");
			builder.append(progarm.getTvpName());
			builder.append("</option>");		
		}
		return builder.toString();
	}

}
