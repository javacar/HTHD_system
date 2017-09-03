package com.HTHD_system.pojo;

import java.util.Date;

public class APNNotification {

private int id;
private String apiKey;
private String clientIP;
private Date createdTime;
private String message;
private String messageID;
private String resource;
private String status;
private String title;
private Date updateTime;
private String uri;
private String username;
public int getId() {
	return id;
}
public String getApiKey() {
	return apiKey;
}
public String getClientIP() {
	return clientIP;
}
public Date getCreatedTime() {
	return createdTime;
}
public String getMessage() {
	return message;
}
public String getMessageID() {
	return messageID;
}
public String getResource() {
	return resource;
}
public String getStatus() {
	return status;
}
public String getTitle() {
	return title;
}
public Date getUpdateTime() {
	return updateTime;
}
public String getUri() {
	return uri;
}
public String getUsername() {
	return username;
}
public void setId(int id) {
	this.id = id;
}
public void setApiKey(String apiKey) {
	this.apiKey = apiKey;
}
public void setClientIP(String clientIP) {
	this.clientIP = clientIP;
}
public void setCreatedTime(Date createdTime) {
	this.createdTime = createdTime;
}
public void setMessage(String message) {
	this.message = message;
}
public void setMessageID(String messageID) {
	this.messageID = messageID;
}
public void setResource(String resource) {
	this.resource = resource;
}
public void setStatus(String status) {
	this.status = status;
}
public void setTitle(String title) {
	this.title = title;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}
public void setUri(String uri) {
	this.uri = uri;
}
public void setUsername(String username) {
	this.username = username;
}

}
