package com.HTHD_system.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;

import com.HTHD_system.dao.ActVersionDao;
import com.HTHD_system.dao.NotificationDao;
import com.HTHD_system.dao.NotificationLogDao;
import com.HTHD_system.dao.PrizeDao;
import com.HTHD_system.dao.TVProgarmDao;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.NotificationLog;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.TVProgarm;
import com.HTHD_system.service.ActVersionService;
import com.HTHD_system.service.IOSTokenService;
import com.HTHD_system.service.NotificationLogService;
import com.HTHD_system.service.PrizeService;
import com.HTHD_system.service.TVProgarmService;

import com.opensymphony.xwork2.ActionSupport;

public class NotificationLogAction extends BaseAction {
	private int ntype;
	private NotificationLogService notificationLogService;

	private int pageNo;
	private String inContent;
	private TVProgarmService progarmService;
	private ActVersionService versionService;
	private PrizeService prizeService;
	private int selected;



	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	public PrizeService getPrizeService() {
		return prizeService;
	}

	public void setPrizeService(PrizeService prizeService) {
		this.prizeService = prizeService;
	}

	public ActVersionService getVersionService() {
		return versionService;
	}

	public void setVersionService(ActVersionService versionService) {
		this.versionService = versionService;
	}

	public TVProgarmService getProgarmService() {
		return progarmService;
	}

	public void setProgarmService(TVProgarmService progarmService) {
		this.progarmService = progarmService;
	}

	public String getInContent() {
		return inContent;
	}

	public void setInContent(String inContent) {
		this.inContent = inContent;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNtype() {
		return ntype;
	}

	public void setNtype(int ntype) {
		this.ntype = ntype;
	}

	public String findNotificationLogs() {
		int pageSize = 20;
		if (pageNo==0) {
			pageNo=1;
		}
		int begin = (pageNo - 1) * pageSize + 1;
		int end = pageNo * pageSize;

		int count = notificationLogService.getNotificationLogsCount(ntype);
		// ��ҳ��¼��
		int pageCount = count < 10 || pageNo * pageSize > count ? pageCount = count
				% pageSize
				: pageSize;// ��ҳ��¼��
		requestMap.put("pageCount", pageCount);// �ܼ�¼��
		requestMap.put("count", count);
		pageSize = count % pageSize == 0 ? count / pageSize : count / pageSize
				+ 1;// ���ҳ��
		if (pageSize == 0) {// û�м�¼����ʾ��һҳ
			pageSize = 1;
		}
		requestMap.put("pageSize", pageSize);
		List<NotificationLog> notificationLogs = notificationLogService
				.getAllNotificationLogs(ntype, begin, end);

		
		requestMap.put("notificationLogs", notificationLogs);
		requestMap.put("notificationLogs", notificationLogs);
	
	requestMap.put("optionsTVProgarm", progarmService.optionsTVProgarm());

		// ��¼��־
		return "iOS_Notification";
	}

	// �ں�
	public String xmlActVersion() throws IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println(versionService.xmlActVersion(selected));
		return null;
	}

	// ����
	public String xmlPrize() throws IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println(prizeService.xmlPrize(selected));
		return null;
	}

	public NotificationLogService getNotificationLogService() {
		return notificationLogService;
	}

	public void setNotificationLogService(
			NotificationLogService notificationLogService) {
		this.notificationLogService = notificationLogService;
	}

}
