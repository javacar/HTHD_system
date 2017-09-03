package com.HTHD_system.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.HTHD_system.dao.AccountDao;
import com.HTHD_system.dao.LogsDao;
import com.HTHD_system.pojo.Account;
import com.HTHD_system.pojo.Logs;
import com.HTHD_system.service.AccountService;
import com.HTHD_system.service.LogsService;

import com.opensymphony.xwork2.ActionSupport;

public class AccoutAction extends BaseAction {
	private AccountService accountService;
	private LogsService logsService;
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LogsService getLogsService() {
		return logsService;
	}

	public void setLogsService(LogsService logsService) {
		this.logsService = logsService;
	}

	public String login() throws Exception {

		Account account = accountService.getAccount(name, password);
		if (account.getAccountUid()!= null) {
			session.put("account", account);
			logsService.login(account, request.getRemoteHost());
			return "Base1";
		}
		return "Account";

	}

	public String logout() throws Exception {
		Object object = session.get("account");
		if (!(object instanceof Account)) {
			return "Account";
		}
		Account account = (Account) object;
		logsService.logout(account, request.getRemoteAddr());
		return "Account";
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public String validateAccount() throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		name=URLDecoder.decode(name,"UTF-8");
		password=URLDecoder.decode(password,"UTF-8");
		PrintWriter writer=response.getWriter();
		Account account = accountService.getAccount(name, password);
		writer.println(account.getAccountUid()==null?0:1);
		return null;	
	}

}
