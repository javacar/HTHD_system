package com.HTHD_system.util;

import java.util.*;
import javapns.devices.*;
import javapns.devices.*;
import javapns.devices.implementations.basic.*;
import javapns.notification.*;


public class MainSend {

	public void sendpush(List<String> tokens, String path, String password,
			String message, Integer count, boolean sendCount) {

		try {
			// message��һ��json���ַ���{��aps��:{��alert��:��iphone���Ͳ��ԡ�}}
			PushNotificationPayload payLoad = PushNotificationPayload
					.fromJSON(message);
			payLoad.addAlert("iphone���Ͳ��� www.baidu.com"); // ��Ϣ����
			payLoad.addBadge(count); // iphoneӦ��ͼ����С��Ȧ�ϵ���ֵ

			payLoad.addSound("default"); // ���� Ĭ��

			PushNotificationManager pushManager = new PushNotificationManager();

			// true����ʾ���ǲ�Ʒ�������ͷ��� false����ʾ���ǲ�Ʒ�������ͷ���
			pushManager
					.initializeConnection(new AppleNotificationServerBasicImpl(
							path, password, false));
			List<PushedNotification> notifications = new ArrayList<PushedNotification>();

			// ����push��Ϣ
			if (sendCount) {
				Device device = new BasicDevice();

				device.setToken(tokens.get(0));

				PushedNotification notification = pushManager.sendNotification(
						device, payLoad, true);

				notifications.add(notification);

			} else {

				List<Device> device = new ArrayList<Device>();

				for (String token : tokens) {

					device.add(new BasicDevice(token));

				}

				notifications = pushManager.sendNotifications(payLoad, device);

			}

			List<PushedNotification> failedNotifications = PushedNotification
					.findFailedNotifications(notifications);

			List<PushedNotification> successfulNotifications = PushedNotification
					.findSuccessfulNotifications(notifications);

			int failed = failedNotifications.size();

			int successful = successfulNotifications.size();

			if (successful > 0 && failed == 0) {

			

			} else if (successful == 0 && failed > 0) {

	

			} else if (successful == 0 && failed == 0) {

				System.out
						.println("No notifications could be sent, probably because of a critical error");

			} else {

				
			}

			// pushManager.stopConnection();
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {
		MainSend send = new MainSend();
		List<String> tokens = new ArrayList<String>();
		tokens
				.add("76edc85fd2e6704b27974d774cc046d7e33a3440fd6f39ba18c729387e6c788a");
		tokens
				.add("dc2cf037bd4465c851b1d96a86b0a028307bc7e443435b6fafe93c2957bb415c");
		String path = "E:\\iphone\\WPNPushService.p12";
		String password = "wappin2009";
		String message = "{'aps':{'alert':'iphone���Ͳ��� www.baidu.com'}}";
		Integer count = 1;
		boolean sendCount = false;
		send.sendpush(tokens, path, password, message, count, sendCount);
	}
}
