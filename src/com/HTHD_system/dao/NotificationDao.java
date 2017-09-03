package com.HTHD_system.dao;

import java.util.Date;

import com.HTHD_system.pojo.IOSNotification;

public interface NotificationDao {
	
	int insertNotification(IOSNotification notification);
	IOSNotification getNotification(int inUid);
}
