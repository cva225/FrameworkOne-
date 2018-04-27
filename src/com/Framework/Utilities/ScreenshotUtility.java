package com.Framework.Utilities;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public interface ScreenshotUtility {
public static String  screenShot(WebDriver driver  , String tcName) throws IOException {
	String imagePath = System.getProperty("user.dir")+"\\Screenshots\\"+"tcName"+".jpeg";
	 TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	java.io.File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new java.io.File(imagePath));
	return imagePath;
	
}
}
