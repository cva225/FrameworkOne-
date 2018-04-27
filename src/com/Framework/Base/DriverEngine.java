package com.Framework.Base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Framework.Utilities.DriverUtilities;
import com.Framework.Utilities.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverEngine {
	private static WebDriver webdriver;
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	
	@Parameters({"browser"})
	@BeforeSuite
	static public void openBrowser(@Optional("chrome")String browser) {
		if (browser.equalsIgnoreCase(DriverUtilities.chrome)) {
			System.setProperty(DriverUtilities.chromeKey, DriverUtilities.chromeValue);
			webdriver = new ChromeDriver();
			
			}
		else if (browser.equalsIgnoreCase(DriverUtilities.firefox)) {
			System.setProperty(DriverUtilities.firefoxkey, DriverUtilities.firefoxValue);
			webdriver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase(DriverUtilities.ie)) {
			System.setProperty(DriverUtilities.ieKey, DriverUtilities.ieValue);
			webdriver = new InternetExplorerDriver();
			}
		}
	public static  void closebrowser() {
		if (webdriver!=null) {
			webdriver.close();
			} else  
				System.out.println("webdriver pointing to null");
		}
	public  static WebDriver getWebdriver() {
		return webdriver;
	}
        public static void init() {
			webdriver.manage().window().maximize();
			webdriver.manage().deleteAllCookies();
			webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
        @BeforeMethod
         public static  void beforeTestExecution(Method method) {
			String tcName = method.getName();
			extentTest = extentReports.startTest(tcName);
			System.out.println("currently executing test case is :"+tcName);
           }
        @AfterMethod
         public static  void afterTcExecution(ITestResult result) throws IOException {
        	 String tcName = result.getName();
        	 if (result.getStatus()==ITestResult.FAILURE) {
        		 System.out.println("failed tc Name is :"+result.getName());
        		 getExtentTest().log(LogStatus.FAIL, extentTest.addScreencast(ScreenshotUtility.screenShot(getWebdriver(), tcName)));
        		 }
        	 
        	 else if (result.getStatus()==ITestResult.SKIP) {
        			 System.out.println("skiped Tc name is :"+result.getName());
        		getExtentTest().log(LogStatus.FAIL, extentTest.addScreencast(ScreenshotUtility.screenShot(getWebdriver(), tcName)));	 
					
				}
        	 else if (result.getStatus()==ITestResult.SUCCESS) {
        		 System.out.println("success TC name is :"+result.getName());
				
			}
        extentReports.endTest(extentTest);
        extentReports.flush();
		}

         
       public static ExtentTest getExtentTest() {
		return extentTest;
	}  
         @BeforeTest
         public static void initExtentReports() {
			extentReports = new ExtentReports(System.getProperty("user.dir")+"\\reports\\report.html");
					}
         
         @AfterTest
         public static  void extentReport() {
			extentReports.close();
			}
        public  ExtentTest getExtententTest() {
			return extentTest;

		}
         
         
         
}
