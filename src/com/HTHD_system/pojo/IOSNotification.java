package com.HTHD_system.pojo;

import java.util.Date;

public class IOSNotification {
	private int inUid;
	private String inTarget;
	private String inContent;
	private Date sendTime;
	private int sendCount;
	private int successCount;
	private int failureCount;
	
	public String getInTarget() {
		return inTarget;
	}
	public String getInContent() {
		return inContent;
	}
	public void setInTarget(String inTarget) {
		this.inTarget = inTarget;
	}
	public void setInContent(String inContent) {
		this.inContent = inContent;
	}
	public int getInUid() {
		return inUid;
	}
	public void setInUid(int inUid) {
		this.inUid = inUid;
	}

	public Date getSendTime() {
		return sendTime;
	}
	public int getSendCount() {
		return sendCount;
	}
	public int getSuccessCount() {
		return successCount;
	}
	public int getFailureCount() {
		return failureCount;
	}
	
	
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public void setSendCount(int sendCount) {
		this.sendCount = sendCount;
	}
	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}
	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}
	
}
