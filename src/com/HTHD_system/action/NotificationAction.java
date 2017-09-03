package com.HTHD_system.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.devices.Device;
import javapns.notification.PushedNotification;
import javapns.notification.ResponsePacket;
import org.apache.log4j.Logger;
import org.json.JSONException;

import com.HTHD_system.dao.IOSTokenDao;
import com.HTHD_system.dao.NotificationDao;
import com.HTHD_system.pojo.ActVersion;
import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;
import com.HTHD_system.service.ActVersionService;
import com.HTHD_system.service.NotificationLogService;
import com.HTHD_system.service.NotificationService;
import com.HTHD_system.service.IOSTokenService;
import com.HTHD_system.service.PrizeService;
import com.HTHD_system.util.CollectionHandle;
import com.HTHD_system.util.MainApnsSend;
import com.HTHD_system.util.NumberHandle;

public class NotificationAction extends BaseAction {

	private int ntype;
	private String userName;
	private String inContent;
	private NotificationService notificationService;
	private NotificationLogService notificationLogService;
	private IOSTokenService tokenService;
	private int day;
	private int avid;
	private int tvpID;
	private String program;
	private String version;
	private String prize;
	private PrizeService prizeService;


	public PrizeService getPrizeService() {
		return prizeService;
	}

	public void setPrizeService(PrizeService prizeService) {
		this.prizeService = prizeService;
	}

	public IOSTokenService getTokenService() {
		return tokenService;
	}

	public void setTokenService(IOSTokenService tokenService) {
		this.tokenService = tokenService;
	}

	public String getProgram() {
		return program;
	}

	public String getVersion() {
		return version;
	}

	public String getPrize() {
		return prize;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public int getAvid() {
		return avid;
	}

	public int getTvpID() {
		return tvpID;
	}

	public void setAvid(int avid) {
		this.avid = avid;
	}

	public void setTvpID(int tvpID) {
		this.tvpID = tvpID;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public NotificationLogService getNotificationLogService() {
		return notificationLogService;
	}

	public void setNotificationLogService(
			NotificationLogService notificationLogService) {
		this.notificationLogService = notificationLogService;
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInContent() {
		return inContent;
	}

	public void setInContent(String inContent) {
		this.inContent = inContent;
	}

	public int getNtype() {
		return ntype;
	}

	public void setNtype(int ntype) {
		this.ntype = ntype;
	}

	// 发送消息
	public String sendMessage() {
		String inTarget = null;
		StringBuilder builder = null;
		int sendCount = 0;
		List<IOSToken> iosTokens = null;
		switch (ntype) {
		case 0://相同去重复
			iosTokens = tokenService.getAllTokens();// 群发
			sendCount = tokenService.getTokensCount();
			break;

		case 1://相同去重复
			UserInfo userInfo = new UserInfo();
			userInfo.setDate(new Date());
			userInfo.setDateDiffDay(day);
			iosTokens = tokenService.getUserIDSByUserInfo(userInfo);
			sendCount = tokenService.getTokensCountByUserInfo(userInfo);
			break;

		case 2:
			if (!NumberHandle.isParseInt(prize, 10)) {
				return "successNotification";
			}
			Prize prize2 = prizeService.getPrize(Integer.parseInt(prize));
			iosTokens = tokenService.getUserIDSByPrize(prize2);
			sendCount = tokenService.getTokensCountByPrize(prize2);
			break;
		case 3:
			String[] values = userName.split(";");
			iosTokens = tokenService.getUserIDSByUserName(values);
			sendCount = tokenService.getTokensCountByUserName(values);
			break;
		default:
			break;
		}

		if (iosTokens != null && !(iosTokens.isEmpty())) {
			int size = iosTokens.size();
			builder = new StringBuilder();
			for (int i = 0; i < size; i++) {
				builder.append(iosTokens.get(i).getUserInfo().getName());
				if (i < size - 1) {
					builder.append(",");
				}
			}
		}
		// 得到username数组
		if (builder == null) {
			return "successNotification";
		}
		inTarget = builder.toString();
		// 调用苹果接口
		String[] tokens = null;
		try {
			tokens = MainApnsSend.feedback();
		} catch (CommunicationException e) {
			e.printStackTrace();
		} catch (KeystoreException e) {
			e.printStackTrace();
		}

		// 四种情况符合条件的token
		if (iosTokens != null && !iosTokens.isEmpty()) {
			tokens = new String[iosTokens.size()];
			for (int i = 0; i < iosTokens.size(); i++) {
				tokens[i] = iosTokens.get(i).getToken();
			}
		}
		PushedNotification pushedNotification = null;
		IOSNotification notification=null;
		// 一条条插入数据,一条条推送,用户名
		String[] inTargets=inTarget.split(",");
		if (ntype==2) {
			String[] token=new String[1];
			if (!NumberHandle.isParseInt(prize, 10)) {
				return "successNotification";
			}
			Prize prize2 = prizeService.getPrize(Integer.parseInt(prize));
			//后半段
			String str1="获得"+prize2.getAvversion()+"的"+prize2.getPrizeMessage()+"," +inContent;
			//前半段
			String str2=null;
            for (int i = 0; i < tokens.length; i++) {
				token[0]=tokens[i];
				int failureCount = 0;
				int successCount = 0;
				List<PushedNotification> notifications = null;
				try {
					str2="恭喜"+inTargets[i]+str1;	
					notifications = MainApnsSend.sendMessages(str2, token);
				} catch (CommunicationException e) {
					e.printStackTrace();

				} catch (KeystoreException e) {
					e.printStackTrace();
				} catch (JSONException e) {
					e.printStackTrace();
				}
				ResponsePacket response2=null;
				if (notifications != null) {
					for (PushedNotification notification1 : notifications) {
						 response2 = notification1.getResponse();
						if (response2 != null) {
							System.out.println(response2.getMessage());
						}
						if (notification1.isSuccessful()) {
							successCount++;
						} else {
							failureCount++;
							//token失败处理 
							
							tokenService.updateToken(token[0]);
						}
					}
				}
				//保持插入的是一条记录
				sendCount=sendCount>0?1:0;
			 int inUid = notificationService.insertNotification(inTargets[i], str2,
						sendCount, successCount, failureCount);
				notification = notificationService
						.getNotification(inUid);
				// 记录日志
				if (notification != null) {
					notificationLogService.insertNotificationLog(ntype, notification);
				}			
			}		
		}
		
		else {
			int failureCount = 0;
			int successCount = 0;
			List<PushedNotification> notifications = null;
			try {
				notifications = MainApnsSend.sendMessages(inContent, tokens);
			} catch (CommunicationException e) {
				e.printStackTrace();

			} catch (KeystoreException e) {
				e.printStackTrace();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			ResponsePacket response2=null;
			int i=0;
			if (notifications != null) {
				for (PushedNotification notification1 : notifications) {
					 response2 = notification1.getResponse();
					if (response2 != null) {
						System.out.println(response2.getMessage());
					}
					if (notification1.isSuccessful()) {
						successCount++;
					} else {
						failureCount++;		
						tokenService.updateToken(tokens[i]);
					}
					i++;
				}
			}

			 int inUid = notificationService.insertNotification(inTarget, inContent,
					sendCount, successCount, failureCount);
			notification = notificationService
					.getNotification(inUid);
			// 记录日志
			if (notification != null) {
				notificationLogService.insertNotificationLog(ntype, notification);
			}
			
		}

		return "successNotification";

	}

	// 指定用户不存在
	public String userNameNotExists() throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();

		int sendCount = 0;
		switch (ntype) {
		case 1:
			UserInfo userInfo = new UserInfo();
			userInfo.setDate(new Date());
			userInfo.setDateDiffDay(day);
			sendCount = tokenService.getTokensCountByUserInfo(userInfo);
			break;
		case 2:
			if (!NumberHandle.isParseInt(prize, 10)) {
				break;
			}
			Prize prize2 = prizeService.getPrize(Integer.parseInt(prize));

			sendCount = tokenService.getTokensCountByPrize(prize2);
			break;
		case 3:
			String[] values = userName.split(";");
			sendCount = tokenService.getTokensCountByUserName(values);
			break;

		default:
			break;
		}

		writer.println(sendCount == 0 ? 0 : 1);
		return null;

	}
	


}
