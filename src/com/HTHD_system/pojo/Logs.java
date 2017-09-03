package com.HTHD_system.pojo;

import java.util.Date;




public class Logs implements java.io.Serializable {


	private Integer logUid;
	private Account account;
	private Date loginTime;
	private Date logoutTime;
	private String ip;

	public Logs() {
	}


	public Logs(Integer logUid, Account account, Date loginTime,
			Date logoutTime, String ip) {
		this.logUid = logUid;
		this.account = account;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
		this.ip = ip;
	}
	
	public Integer getLogUid() {
		return this.logUid;
	}

	public void setLogUid(Integer logUid) {
		this.logUid = logUid;
	}

	
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return this.logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	

}