package com.Framework.Utilities;

public interface DriverUtilities {
	
   String chromeKey = "webdriver.chrome.driver";
   String firefoxkey = "webdriver.gecko.driver";
   String ieKey = "webdriver.ie.driver";
  
   String chromeValue =System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
   String firefoxValue = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
   String ieValue = System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
   
   String chrome = "chrome";
   String firefox = "fiefox";
   String ie = "ie";
   
   }
