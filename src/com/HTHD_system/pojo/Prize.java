package com.HTHD_system.pojo;

import java.io.Serializable;



public class Prize implements Serializable {


	private int prizeId;
	private UserInfo userInfo;
	private ActVersion actVersion;
	private String prizeMessage;
	private String userName;
	private String avversion;
	private int prizeType;
	public Prize() {
	}
	public int getPrizeId() {
		return prizeId;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public ActVersion getActVersion() {
		return actVersion;
	}
	public String getPrizeMessage() {
		return prizeMessage;
	}
	public String getUserName() {
		return userName;
	}
	public String getAvversion() {
		return avversion;
	}
	public int getPrizeType() {
		return prizeType;
	}
	public void setPrizeId(int prizeId) {
		this.prizeId = prizeId;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public void setActVersion(ActVersion actVersion) {
		this.actVersion = actVersion;
	}
	public void setPrizeMessage(String prizeMessage) {
		this.prizeMessage = prizeMessage;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAvversion(String avversion) {
		this.avversion = avversion;
	}
	public void setPrizeType(int prizeType) {
		this.prizeType = prizeType;
	}
	








	

}