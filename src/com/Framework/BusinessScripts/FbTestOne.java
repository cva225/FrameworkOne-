package com.Framework.BusinessScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.Base.BaseTest;

import com.Framework.Utilities.LocatorMechUtility;
import com.Framework.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class FbTestOne extends BaseTest {
	
	@Test
	private void fbTest() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworkException {
		
		String fburl = getPropConfigInstance().getPropertValue("url_fb");
         getWebdriver().get(fburl);;
         getExtentTest().log(LogStatus.INFO, "fb is opened");
         
         DTActions(LocatorMechUtility.id, getPrORConfigInstance().getPropertValue("fb_un_id"), getExcelReaderInstance().getCellData("Sheet1", 1, 0));
         getExtentTest().log(LogStatus.INFO, "DT Action is done on:"+getExcelReaderInstance().getCellData("Sheet1", 1, 0));
         
         DTActions(LocatorMechUtility.id, getPrORConfigInstance().getPropertValue("fb_Pwd"), getExcelReaderInstance().getCellData("Sheet1", 0, 1));
         
         getExtentTest().log(LogStatus.INFO, "password typed on:"+ getExcelReaderInstance().getCellData("Sheet1", 0, 1));
	//Assert.assertEquals(actual, expected);
       CLICK(LocatorMechUtility.id, getPrORConfigInstance().getPropertValue("fb_log_btn"));

         getExtentTest().log(LogStatus.INFO, "clickable actions are done On :");
	
	
	}
	

}
