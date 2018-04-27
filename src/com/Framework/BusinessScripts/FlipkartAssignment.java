package com.Framework.BusinessScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.Base.BaseTest;
import com.Framework.Utilities.LocatorMechUtility;
import com.Framework.customisedExceptions.FrameworkException;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartAssignment extends BaseTest  {
	@Test
	public  void flipkart() throws IOException, FrameworkException, EncryptedDocumentException, InvalidFormatException {
		String flpUrl = getPropConfigInstance().getPropertValue("url_flipkart");
		getWebdriver().get(flpUrl);
		getExtententTest().log(LogStatus.INFO, "Flipkart url is opened :");
	Assert.assertEquals(flpUrl, "https://www.flipkart.com");
String s = 	switchTo2Window();
System.out.println(s); 
	WebDriver driver = getWebdriver().switchTo().window(s);
	Actions c = new Actions(driver);
    WebElement ele=driver.findElement(By.className("_2zrpKA"));
	ele.sendKeys("9000125315");
 WebElement ele1 = driver.findElement(By.className("_3v41xv"));
	ele1.sendKeys("siva225");
 WebElement ee = driver.findElement(By.className("_2AkmmA"));
	c.moveToElement(ee).sendKeys(Keys.ENTER).perform();
	
	

	 WebElement ele2 = getWebdriver().findElement(By.className("_3ynUUz"));
	 WebElement ele3 = getWebdriver().findElement(By.className("nsslWl"));
	c.moveToElement(ele2).moveToElement(ele3).click().build().perform();
	

	
	/*WebElement el= getWebdriver().findElement(By.className("LM6RPg"));
el.sendKeys("Electronics");
el.sendKeys(Keys.ENTER);*/
 



 












	
	}
	
	

}
