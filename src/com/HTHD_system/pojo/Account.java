package com.HTHD_system.pojo;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ibatis.common.resources.Resources;



public class Account implements java.io.Serializable {
	private Integer accountUid;
	private String name;
	private String password;
	private String description;


	public Account() {
	}

	public Integer getAccountUid() {
		return this.accountUid;
	}



	
	public void setAccountUid(Integer accountUid) {
		this.accountUid = accountUid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}