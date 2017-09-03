package com.HTHD_system.service.impl;

import java.util.Date;

import com.HTHD_system.dao.NotificationDao;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	private NotificationDao notificationDao;

	public NotificationDao getNotificationDao() {
		return notificationDao;
	}

	public void setNotificationDao(NotificationDao notificationDao) {
		this.notificationDao = notificationDao;
	}

	public int insertNotification(String inTarget,
			String inContent, int sendCount, int successCount, int failureCount) {
		if (inTarget == null || inContent == null) {
			return 0;
		}
		IOSNotification notification = new IOSNotification();
		notification.setInTarget(inTarget);
		notification.setInContent(inContent);
		notification.setSendCount(sendCount);
		notification.setSuccessCount(successCount);
		notification.setFailureCount(failureCount);
		notification.setSendTime(new Date());
		return notificationDao.insertNotification(notification);
	}


	public IOSNotification getNotification(int inUid) {
		return notificationDao.getNotification(inUid);

}}
