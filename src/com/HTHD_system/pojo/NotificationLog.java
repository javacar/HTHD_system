
package com.HTHD_system.pojo;

public class NotificationLog  extends RowNumber {
	private  int nlUid;
	private int ntype;
	private String description;
	private IOSNotification notification;
	private APNNotification notification2;
	public int getNlUid() {
		return nlUid;
	}
	
	public int getNtype() {
		return ntype;
	}
	public String getDescription() {
		return description;
	}
	public IOSNotification getNotification() {
		return notification;
	}
	public void setNlUid(int nlUid) {
		this.nlUid = nlUid;
	}
	
	public void setNtype(int ntype) {
		this.ntype = ntype;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setNotification(IOSNotification notification) {
		this.notification = notification;
	}
	public APNNotification getNotification2() {
		return notification2;
	}
	public void setNotification2(APNNotification notification2) {
		this.notification2 = notification2;
	}
	

	
}
