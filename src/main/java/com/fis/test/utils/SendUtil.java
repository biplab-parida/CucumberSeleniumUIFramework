package com.fis.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SendUtil {
	public WebDriver driver;
	public SendUtil(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void sendKeysWithClear(String locator, String value)
	{
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(value);;
	}
	public void sendKeys(String locator, Keys value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);;
	}
}
