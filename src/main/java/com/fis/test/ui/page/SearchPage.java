package com.fis.test.ui.page;

import org.openqa.selenium.WebDriver;

import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.GetUtil;

/**
 * @author biplab
 *
 */
public class SearchPage {
	public WebDriver driver;
	public GetUtil getUtil;
	private String firstValue = "(//h1[text()='Search Results']/following-sibling::div/div//a)[1]";
	
	public String getFirstValue() {
		return firstValue;
	}

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		getUtil = new GetUtil(driver);
	}

	/**
	 * @author biplab
	 */
	public String getFirstReturnedValue() {
		CustomLogger.info("Getting href attributefor first searched result");
		System.out.println(getFirstValue());
		return getUtil.getAttribute("href",getFirstValue());
	}

}
