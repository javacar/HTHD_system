package com.HTHD_system.service.impl;

import java.util.List;

import com.HTHD_system.dao.NotificationLogDao;
import com.HTHD_system.pojo.APNNotification;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.NotificationLog;
import com.HTHD_system.service.NotificationLogService;

public class NotificationLogServiceImpl implements NotificationLogService {

private NotificationLogDao notificationLogDao;

	public NotificationLogDao getNotificationLogDao() {
	return notificationLogDao;
}


public void setNotificationLogDao(NotificationLogDao notificationLogDao) {
	this.notificationLogDao = notificationLogDao;
}


	public NotificationLog insertNotificationLog(int ntype,
			IOSNotification notification) {
		if (notification==null) {
			return null;
		}
		NotificationLog notificationLog=new NotificationLog();
		notificationLog.setNtype(ntype);
		notificationLog.setNotification(notification);
		return notificationLogDao.insertNotificationLog(notificationLog);	
		
	}


	public NotificationLog insertNotificationLog(int ntype,
			APNNotification notification) {
		if (notification==null) {
			return null;
		}
		NotificationLog notificationLog=new NotificationLog();
		notificationLog.setNtype(ntype);
		notificationLog.setNotification2(notification);
	
		return notificationLogDao.insertNotificationLog(notificationLog);
	
	}


	public int getNotificationLogsCount(int ntype) {
		return notificationLogDao.getNotificationLogsCount(ntype);
	}


	public List<NotificationLog> getAllNotificationLogs(int ntype, int begin,
			int end) {
		NotificationLog notificationLog=new NotificationLog();
		notificationLog.setBegin(begin);
		notificationLog.setEnd(end);
		notificationLog.setNtype(ntype);
		return notificationLogDao.getAllNotificationLogs(notificationLog);
	}

}
