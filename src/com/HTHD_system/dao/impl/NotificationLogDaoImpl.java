package com.HTHD_system.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.HTHD_system.dao.NotificationLogDao;
import com.HTHD_system.pojo.APNNotification;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.NotificationLog;

public class NotificationLogDaoImpl extends BaseDao implements NotificationLogDao {

	public List<NotificationLog> getAllNotificationLogs(NotificationLog notificationLog) {
		String statementName="findNotificationLogs"; 
		return getAll(statementName,notificationLog);
	}


	public int getNotificationLogsCount(int ntype) {
		String statementName="getNotificationLogsCount"; 
		Object object=getObject(statementName,ntype);
		if (object==null) {
			return 0;
		}
          return Integer.parseInt(object.toString());
	}



	public NotificationLog insertNotificationLog(NotificationLog notificationLog) {
		if (notificationLog==null) {
			return null;
		}
		String statementName="insertNotificationLog";
		Object object= save(statementName, notificationLog);
		if (object instanceof NotificationLog) {
			return (NotificationLog) object;
		}
		return null;
	}




	
	



	
	

}
