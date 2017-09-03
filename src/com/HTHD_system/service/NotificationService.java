package com.HTHD_system.service;



import com.HTHD_system.pojo.IOSNotification;

public interface NotificationService {
	int insertNotification(String inTarget,
			String inContent, int sendCount, int successCount, int failureCount);
	IOSNotification getNotification(int inUid);
}
