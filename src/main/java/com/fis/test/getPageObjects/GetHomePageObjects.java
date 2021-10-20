package com.fis.test.getPageObjects;

import com.fis.test.setup.DriverManager;
import com.fis.test.ui.page.HomePage;
import com.fis.test.ui.page.HomePageYahoo;
import com.fis.test.ui.page.SearchPage;
import com.fis.test.ui.page.SearchPageYahoo;

public class GetHomePageObjects {

	HomePage homePage = null;
	HomePageYahoo homePageYahoo = null;
	public HomePage getGoogleHomePageObject()
	{
		if(homePage==null)
			return new HomePage(DriverManager.getDriver());
		return homePage;
	}
	
	public HomePageYahoo getYahooHomePageObject()
	{
		if(homePageYahoo==null)
			return new HomePageYahoo(DriverManager.getDriver());
		return homePageYahoo;
	}
	
	public HomePage getHomePageObject(String url)
	{
		
		switch (url) {
		case "google":
			homePage = getGoogleHomePageObject();
			break;
		case "yahoo":
			homePage = getYahooHomePageObject();
			break;
		default:
			break;
		}
		
		return homePage;
	}
}
