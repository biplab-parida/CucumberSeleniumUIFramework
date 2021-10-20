package com.fis.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author bparida
 * 
 */
public class GetUtil {
	public WebDriver driver;

	public GetUtil(WebDriver driver) {
		this.driver = driver;

	}

	public String getAttribute(String attributeName, String firstValue) {
		return driver.findElement(By.xpath(firstValue)).getAttribute(attributeName);
	}

}
