package com.ExtentReport.FW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import freemarker.log.Logger;

public class SampleOne {
	
	static ExtentReports extent ;
	 static ExtentTest logger;
	 WebDriver driver;
	@Test
	public  void Extentrep() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	 extent  = new ExtentReports("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\ExtentReport\\FW\\Reports\\abc.html");
	 logger = extent.startTest("first test");
	
    
	 driver = new ChromeDriver();
	logger.log(LogStatus.INFO,"browser is launched");
	driver.manage().window().maximize();
	logger.log(LogStatus.INFO,"browser is launched");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	logger.log(LogStatus.INFO,"fb opened");
	extent.flush();
	}
	
	@Test
	public  void ExtentReport2() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 extent  = new ExtentReports("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\ExtentReport\\FW\\Reports\\abc.html");
		 logger = extent.startTest("second  test");
		 driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "over");;
extent.flush();
	}
	
	}
