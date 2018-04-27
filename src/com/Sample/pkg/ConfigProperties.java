package com.Sample.pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	public static void main(String[] args) throws IOException {
		
	  //writind the data into configProperties files  
		
		FileInputStream fip = new FileInputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\Base\\config.properties");
	Properties prop = new  Properties();
	prop.load(fip);
	 prop.setProperty("url_gmail","https://www.gmail.com" );
	 prop.setProperty("user_Name", "cvamannepalli@gmail.com");
	 prop.setProperty("user_password", "cvakumar");
	 prop.setProperty("user_fb", "sivakumar.m225@gmail.com");
	 prop.setProperty("user_password", "ram225");
	 
	 
	 
	 FileOutputStream fop = new FileOutputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\Base\\config.properties");
	 prop.store(fop, "All  configproperty  values are added");
	 
	 
	 
	 FileInputStream fip1 = new FileInputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\Base\\OR.properties");
		Properties prop1 = new  Properties();
		prop.load(fip1);
		 prop1.setProperty("gmail_un_css","input[id='identifierId1']");
		 prop1.setProperty("gmail_next_xpath","//*[@id='identifierNext']");
		 prop1.setProperty("gmail_un_id","identifierId");
		 prop1.setProperty("gmail_next_id","identifierNext");
		 prop1.setProperty("gmail_un_xpath","//input[@id='identifierId1']");
		 
		 
		 
		 FileOutputStream fop1 = new FileOutputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\Base\\OR.properties");
		 prop.store(fop1, "All ORproperty  values are added");
	 
	 
	 
	 
	
	
	
	
	
	
	}

}
