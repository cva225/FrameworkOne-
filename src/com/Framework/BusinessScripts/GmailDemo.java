package com.Framework.BusinessScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Framework.Base.BaseTest;
import com.Framework.Supporters.ExcelReader;
import com.Framework.Utilities.LocatorMechUtility;
import com.Framework.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class GmailDemo extends BaseTest {
	@Test
	public  void gmail() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworkException {
	String url =getPropConfigInstance().getPropertValue("url_gmail");
	getWebdriver().get(url);
	getExtentTest().log(LogStatus.INFO, "url is entered as"+url);
	
		DTActions(LocatorMechUtility.id, getPrORConfigInstance().getPropertValue("gmail_un_id"), getExcelReaderInstance().getCellData("Sheet1", 0, 0));
		
		 getExtentTest().log(LogStatus.INFO, "Data typing action is done on usename with test data  :"+getExcelReaderInstance().getCellData("Sheet1", 0, 0));
	
		WebElement element=	getWebElement(LocatorMechUtility.linkText, getPrORConfigInstance().getPropertValue("linkText"));
	//Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
getExtentTest().log(LogStatus.INFO,"next button is done :"+getPrORConfigInstance().getPropertValue("linkText"));
Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
	}
	

}

;
//WebElement element = getWebElement(LocMechUtility.name, getPrOrInstance().getPropertValue("gmail_pwd"))

//Assert.assertTrue(element.isDisplayed()&&element.isEnabled());










