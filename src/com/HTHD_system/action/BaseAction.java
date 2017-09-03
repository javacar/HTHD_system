package com.HTHD_system.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware,
		SessionAware, RequestAware {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map session;
	protected Map requestMap;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	public void setSession(Map session) {
		this.session = session;

	}

	public void setRequest(Map requestMap) {
		this.requestMap = requestMap;
	}
}
