package com.HTHD_system.dao;

import java.util.List;

import com.HTHD_system.pojo.APNNotification;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.NotificationLog;



public interface NotificationLogDao {
List<NotificationLog> getAllNotificationLogs(NotificationLog notificationLog);
int getNotificationLogsCount(int ntype);
NotificationLog  insertNotificationLog(NotificationLog notificationLog);



}
