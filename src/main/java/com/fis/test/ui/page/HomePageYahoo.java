package com.fis.test.ui.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.SendUtil;

public class HomePageYahoo extends HomePage{
	public WebDriver driver;
	public SendUtil sendUtil;
	private String searchboxInput = "//input[@name='p']";

	public String getSearchboxInput() {
		return searchboxInput;
	}

	public void setSearchboxInput(String searchboxInput) {
		this.searchboxInput = searchboxInput;
	}

	public HomePageYahoo(WebDriver driver) {
		super(driver);
		this.driver = driver;
		sendUtil = new SendUtil(driver);
	}

}
