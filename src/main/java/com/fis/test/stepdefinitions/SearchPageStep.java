package com.fis.test.stepdefinitions;

import org.testng.Assert;

import com.fis.test.getPageObjects.GetSearchPageObjects;
import com.fis.test.ui.page.SearchPage;

import io.cucumber.java.en.Then;

/**
 * @author biplab
 *
 */
public class SearchPageStep{
	
	@Then("get the first returned value in {string} and compare with {string}")
	public void getValueAndValidate(String searchEngine, String expectedValue)
	{
		GetSearchPageObjects getSearchPageObj = new GetSearchPageObjects();
		SearchPage search = getSearchPageObj.getSearchPageObject(searchEngine);
		String originalValue = search.getFirstReturnedValue();
		Assert.assertEquals(originalValue, expectedValue);
		
	}
}
