package com.HTHD_system.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IOSToken {
	private int uid;
	private  String token;
	private  int status;
	private Date createDate;  
	private Date stopDate;
	private UserInfo userInfo;
	private Prize prize;
	
	public Prize getPrize() {
		return prize;
	}
	public void setPrize(Prize prize) {
		this.prize = prize;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public int getUid() {
		return uid;
	}
	public String getToken() {
		return token;
	}
	public int getStatus() {
		return status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getStopDate() {
		return stopDate;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((prize == null) ? 0 : prize.hashCode());
		result = prime * result + status;
		result = prime * result
				+ ((stopDate == null) ? 0 : stopDate.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + uid;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final IOSToken other = (IOSToken) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (prize == null) {
			if (other.prize != null)
				return false;
		} else if (!prize.equals(other.prize))
			return false;
		if (status != other.status)
			return false;
		if (stopDate == null) {
			if (other.stopDate != null)
				return false;
		} else if (!stopDate.equals(other.stopDate))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
} 
