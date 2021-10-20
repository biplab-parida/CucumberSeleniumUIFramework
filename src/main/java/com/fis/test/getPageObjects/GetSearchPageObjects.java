package com.fis.test.getPageObjects;

import com.fis.test.setup.DriverManager;
import com.fis.test.ui.page.SearchPage;
import com.fis.test.ui.page.SearchPageYahoo;

public class GetSearchPageObjects {

	SearchPage searchPage = null;
	SearchPageYahoo SearchPageYahoo = null;
	public SearchPage getGoogleSearchPageObject()
	{
		if(searchPage==null)
			return new SearchPage(DriverManager.getDriver());
		return searchPage;
	}
	
	public SearchPageYahoo getYahooSearchPageObject()
	{
		if(SearchPageYahoo==null)
			return new SearchPageYahoo(DriverManager.getDriver());
		return SearchPageYahoo;
	}
	
	public SearchPage getSearchPageObject(String url)
	{
		
		switch (url) {
		case "google":
			searchPage = getGoogleSearchPageObject();
			break;
		case "yahoo":
			searchPage = getYahooSearchPageObject();
			break;
		default:
			break;
		}
		
		return searchPage;
	}
}
