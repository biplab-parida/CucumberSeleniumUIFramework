package com.fis.test.ui.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fis.test.getPageObjects.GetHomePageObjects;
import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.SendUtil;

/**
 * @author biplab
 *
 */
public class HomePage {
	public WebDriver driver;
	public SendUtil sendUtil;
	private String searchboxInput = "//input[@title='Search']";

	public String getSearchboxInput() {
		return searchboxInput;
	}

	public void setSearchboxInput(String searchboxInput) {
		this.searchboxInput = searchboxInput;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		sendUtil = new SendUtil(driver);
	}

	/**
	 * @author biplab
	 * @param searchValue
	 */
	public void searchOnHomePage(String searchValue, String searchEngine) {
		GetHomePageObjects getHomePageObj = new GetHomePageObjects();
		HomePage home = getHomePageObj.getHomePageObject(searchEngine);
		CustomLogger.info("Searching on Home Page" + searchValue);
		System.out.println(home.getSearchboxInput());
		sendUtil.sendKeysWithClear(home.getSearchboxInput(), searchValue);
		CustomLogger.info("Entered Value in Input Box");
		sendUtil.sendKeys(home.getSearchboxInput(), Keys.ENTER);
		CustomLogger.info("Enter button pressed successfully");
	}

}
