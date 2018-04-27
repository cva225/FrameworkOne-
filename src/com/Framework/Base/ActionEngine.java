package com.Framework.Base;

import java.util.ArrayList;
import java.util.List;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Framework.customisedExceptions.FrameworkException;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ActionEngine extends DriverEngine {
	 private static WebElement element ;
	 private static List<WebElement> elements ;
	
	public static  WebElement getWebElement(String locType ,String locTypeValue) throws FrameworkException {
		switch (locType) {
		case "id":
			element = getWebdriver().findElement(By.id(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		
		case "css":
			element = getWebdriver().findElement(By.cssSelector(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		
		case "xpath":
			element = getWebdriver().findElement(By.xpath(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}

		case "name":
			element = getWebdriver().findElement(By.name(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
			
		case "class":
			element = getWebdriver().findElement(By.className(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
			
			
		case "linkTest":
			element = getWebdriver().findElement(By.linkText(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
			
		case "partialLinkTest":
			element = getWebdriver().findElement(By.partialLinkText(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
			}
		return element;
	}
	public List<WebElement> getWebelements(String locType , String locTypeValue ) throws FrameworkException {
		switch (locType) {
		
		case "id":
			elements = getWebdriver().findElements(By.id(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		
		case "css":
			elements = getWebdriver().findElements(By.cssSelector(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		
		case "xpath":
			elements = getWebdriver().findElements(By.xpath(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		case "name":
			elements = getWebdriver().findElements(By.name(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
			}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		case "className":
			elements = getWebdriver().findElements(By.className(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		case "linkText":
			elements = getWebdriver().findElements(By.linkText(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
		        }
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		case "partialLinkText":
			elements = getWebdriver().findElements(By.partialLinkText(locTypeValue));
		// boolean status = (element.isEnabled()&&element.isDisplayed()?true:false);
			if (element.isDisplayed()&&element.isEnabled()) {
				}
			else {
				throw new FrameworkException("unable to identify the element with :"+locTypeValue);
			}
		}
       return elements;
		}
    public static  void DTActions(String locType, String locTypeValue , String testData) throws FrameworkException {
    	
    	element = getWebElement(locType, locTypeValue);
    	element.clear();
    	element.sendKeys(testData);
    }
    public static  void  CLICK( String locType , String locTypeValue) throws FrameworkException {
		element = getWebElement(locType, locTypeValue);
		element.click();
		}
    
    public static void mouseHover(String locType , String locTypeValue) throws FrameworkException {
    	Actions actions = new Actions(getWebdriver());
    	actions.moveToElement(getWebElement(locType, locTypeValue)).perform();
    	}
    // if only two windows are there
    public static  String  switchTo2Window() {
    	String currentWindow = getWebdriver().getWindowHandle();
    	java.util.Set<String> windows = getWebdriver().getWindowHandles();
    	for (String window  : windows) {
    		if (!window.equalsIgnoreCase(currentWindow)) {
    			getWebdriver().switchTo().window(window);
    		 }
    		}
    	return currentWindow;
    	}
   
    // if multiple windows are there (more than three)use this
     public static String switchtoWindows(int windowIndex) {
    	 java.util.Set< String> windows = getWebdriver().getWindowHandles();
    	 List<String> listWindows = new ArrayList<>(windows);
    	 String window = listWindows.get(windowIndex);
    	 getWebdriver().switchTo().window(window);
    	 return getWebdriver().getWindowHandle();
     }
     public static  void  switchToFrame(int index , String idOrName ,WebElement element ) {
		getWebdriver().switchTo().frame(element);

	}
    
 }
