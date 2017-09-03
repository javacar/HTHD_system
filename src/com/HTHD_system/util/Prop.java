package com.HTHD_system.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import sun.net.ftp.FtpClient;

public class Prop {
	public static Properties getProperties(String file){
		if (file==null) {
			return null;
		}
	Properties properties=new Properties();
	InputStream stream=null;
	try {
		
		try {
			stream=Prop.class.getResourceAsStream(file);
			if (stream==null) {
				return null;
			}
			properties.load(stream);
		}finally{
			if (stream!=null) {
				stream.close();
			}
		
		}
	}  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return properties;
		
	}

}
