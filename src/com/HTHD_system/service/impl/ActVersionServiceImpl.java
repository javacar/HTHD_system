package com.HTHD_system.service.impl;

import java.util.List;

import com.HTHD_system.dao.ActVersionDao;
import com.HTHD_system.pojo.ActVersion;
import com.HTHD_system.service.ActVersionService;

public class ActVersionServiceImpl implements ActVersionService {
private ActVersionDao versionDao;
	public ActVersionDao getVersionDao() {
	return versionDao;
}
public void setVersionDao(ActVersionDao versionDao) {
	this.versionDao = versionDao;
}

	public String xmlActVersion(int tvpID) {
		StringBuilder builder = new StringBuilder();
		List<ActVersion> versions=versionDao.getAllActVersions(tvpID);
		builder.append("<response>");
		for (ActVersion version : versions) {
			builder.append("<version>\n<versionname>");
			builder.append(version.getAvversion());
			builder.append("</versionname>\n<versionvalue>");
			builder.append(version.getAvid());
			builder.append("</versionvalue></version>\n");
		}
		builder.append("</response>");
		return builder.toString();
	}
	

}
