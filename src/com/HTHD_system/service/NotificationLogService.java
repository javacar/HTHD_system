package com.HTHD_system.service;

import java.util.List;

import com.HTHD_system.pojo.APNNotification;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.NotificationLog;

public interface NotificationLogService {
	NotificationLog  insertNotificationLog(int ntype, IOSNotification notification);
	NotificationLog insertNotificationLog(int ntype,APNNotification notification);
	int getNotificationLogsCount(int ntype);
	List<NotificationLog> getAllNotificationLogs(int ntype,int begin,int end);
	
}
