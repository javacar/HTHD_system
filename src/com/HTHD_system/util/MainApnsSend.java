package com.HTHD_system.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.bouncycastle.jce.provider.JDKDSASigner.stdDSA;
import org.json.JSONException;
import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.devices.Device;
import javapns.devices.Devices;
import javapns.notification.PushNotificationPayload;
import javapns.notification.PushedNotification;
import javapns.notification.PushedNotifications;
import javapns.notification.ResponsePacket;
import javapns.back.*;
import javapns.data.*;
import javapns.data.PayLoad;
public class MainApnsSend {

	private static String iphoneHost;
	private static String iphonePort;
	private static String iphonePassword;
	private static String iphonePath;
	private static String iphoneDeviceToken;
	private static String iphoneProduction;
	private static boolean production;
	private static String iphoneSound;

	static {
		Properties properties = Prop.getProperties("/iphone.properties");
		
		if (properties != null) {

			iphoneHost = properties.getProperty("iphone.host");
			iphonePort = properties.getProperty("iphone.port");
			iphonePassword = properties.getProperty("iphone.password");
			iphonePath = properties.getProperty("iphone.path");
			iphoneDeviceToken = properties.getProperty("iphone.deviceToken");
			iphoneProduction=properties.getProperty("iphone.production");
			production=Boolean.getBoolean(iphoneProduction);
			iphoneSound=properties.getProperty("iphone.sound");
		}
		
		
	}


	public static String[] feedback() throws CommunicationException, KeystoreException{
	
	List<Device> devList = Push.feedback(iphonePath, iphonePassword, production); 	
		String[] tokens=new String[devList.size()];
		if(!devList.isEmpty()){
			int i=0;
			for(Device basicDevice: devList)  
			{  
				tokens[i++]=basicDevice.getToken();
				System.out.println("Token="+basicDevice.getToken());  
				System.out.println("DeviceId="+basicDevice.getDeviceId());				
			}
		}else{
			System.out.println("feedback is empty");
		}
	
		return tokens;
	}
	
	public static List<PushedNotification> sendMessages(String message,String[] s) throws CommunicationException, KeystoreException, JSONException{
		PushNotificationPayload payload = new PushNotificationPayload();  
		payload.setExpiry(1);  
		payload.addAlert(message);  
		payload.addBadge(0);   
		payload.addSound(iphoneSound);
		PushedNotifications notifications = Push.payload(payload, 
				iphonePath, 
				iphonePassword,   
				production,  
				Devices.asDevices(s));  
		
		
		return notifications;
	}


	
	public static void main(String[] args) throws Exception {
		String host = "gateway.sandbox.push.apple.com";
		int port = 2195;
		PayLoad payLoad = new PayLoad();
		payLoad.addAlert("");
		payLoad.addBadge(1);
		payLoad.addSound("default");
		payLoad.addCustomDictionary("url", "www.baidu.com");
		PushNotificationManager pushManager = PushNotificationManager
				.getInstance();

		pushManager.addDevice("iphone", "");	
		String p12Pass = null;
		String p12File = null;
		pushManager.initializeConnection(host, port, p12File, p12Pass,
				SSLConnectionHelper.KEYSTORE_TYPE_PKCS12);
		javapns.data.Device client = pushManager.getDevice("iphone");
		pushManager.sendNotification(client, payLoad);
		pushManager.stopConnection();
		pushManager.removeDevice("iphone");
	}
	

}
