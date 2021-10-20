package com.fis.test.ui.page;

import org.openqa.selenium.WebDriver;

import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.GetUtil;

public class SearchPageYahoo extends SearchPage{
	public WebDriver driver;
	public GetUtil getUtil;
	private String firstValue = "(//div[@role='document']//li//h3/a)[1]";
	
	public String getFirstValue() {
		return firstValue;
	}
			
	public SearchPageYahoo(WebDriver driver) {
		super(driver);
		this.driver = driver;
		getUtil = new GetUtil(driver);
	}

	

}
