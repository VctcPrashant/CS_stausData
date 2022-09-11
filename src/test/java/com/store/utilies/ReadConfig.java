package com.store.utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	String path = "C:\\Users\\8.1\\eclipse-workspace\\MyStore\\Configution\\config.properties";
	
	public ReadConfig()
	{
		 prop = new Properties();
		 try {
			FileInputStream fil = new FileInputStream(path);
			try {
				prop.load(fil);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		// TODO Auto-generated method stub
		String url = prop.getProperty("BaseUrl");
		return url;
	}
	public String getBrowser() {
		// TODO Auto-generated method stub
		String browser = prop.getProperty("Browser");
		return browser;
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		String username = prop.getProperty("Username");
		return username;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		String pass = prop.getProperty("password");
		return pass;
	}

	
}
