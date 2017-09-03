package com.HTHD_system.dao.impl;

import java.util.Date;

import com.HTHD_system.dao.NotificationDao;
import com.HTHD_system.pojo.IOSNotification;

public class NotificationDaoImpl extends BaseDao implements NotificationDao {

	public int insertNotification(IOSNotification notification) {
		String statementName = "insertIOSNotification";
	Object object=	save(statementName, notification);
	if (object instanceof Integer) {
		return Integer.parseInt(object.toString());
	}
	return 0;
	}


	public IOSNotification getNotification(int inUid) {
		String statementName = "findIOSNotification";
		Object object=getObject(statementName,inUid);
		if (object instanceof IOSNotification) {
			return (IOSNotification) object;
		}
		return null;
	}

}
