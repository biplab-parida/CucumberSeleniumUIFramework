package com.fis.test.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WaitUtil {
	public WebDriver driver;
	public WaitUtil(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public  boolean documentReadyState() {
		try {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 if(js.executeScript("return document.readyState").equals("complete"))
				 
			 {
				 return true;
			 }
			 
			
		} catch (Exception e) {
			CustomLogger.error("Exception in the documentReadyState method: " + e.getMessage());
		}
		
		return false;
  }
}
