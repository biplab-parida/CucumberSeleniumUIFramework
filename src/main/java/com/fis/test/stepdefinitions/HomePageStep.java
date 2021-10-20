package com.fis.test.stepdefinitions;

import com.fis.test.setup.DriverManager;
import com.fis.test.ui.page.HomePage;
import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.WaitUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * @author biplab
 *
 */
public class HomePageStep{

	
	
	@When("user search for {string} in {string}")
	public void searchOnHomePage(String searchValue, String searchEngine)
	{
		HomePage home = new HomePage(DriverManager.getDriver());
		CustomLogger.info("Starting Step : Searching in Home Page ");
		home.searchOnHomePage(searchValue,searchEngine);
		CustomLogger.info("End Step : Searching in Home Page ");
		
	}
	
	
	
	
}
