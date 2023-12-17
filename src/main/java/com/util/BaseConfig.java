package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {
	
	//interview = 0
	public String getConfig(String value) throws Exception{
		//file path
		String filePath="./config.properties";
		// convert file(note pad) into stream = Java dev class : FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
		//read config file ==> Java dev to use a class = Properties
		Properties pro = new Properties();
		pro.load(fis);
		
		// get each value
		
		String eachValue = pro.get(value).toString();
		
		
		return eachValue;
		
	}
	
	public static void main(String[] args) throws Exception {
		BaseConfig obj = new BaseConfig();
		obj.getConfig("URL");
	}

}
