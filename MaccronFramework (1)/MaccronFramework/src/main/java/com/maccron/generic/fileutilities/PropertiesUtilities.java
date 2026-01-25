package com.maccron.generic.fileutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilities {
	
	public String readTheDataFromPropertiesFile(String Key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MaccronFramework\\src\\test\\resources\\Final.Properties");
		
		Properties ps = new Properties();
		
		ps.load(fis);
		
		String value = ps.getProperty(Key);
		
		return value;
		
	}
	

}
