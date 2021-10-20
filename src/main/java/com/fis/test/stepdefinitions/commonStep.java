package com.fis.test.stepdefinitions;

import com.fis.test.setup.DriverManager;
import com.fis.test.utils.CustomLogger;
import com.fis.test.utils.WaitUtil;

import io.cucumber.java.en.Given;

public class commonStep {
	
	@Given("user is on home page where URL is {string}")
	public void openHomePage(String url) {
		DriverManager.getDriver()
				.get(url);
		WaitUtil waitUtil = new WaitUtil(DriverManager.getDriver());
		int count =0;
		while ( !waitUtil.documentReadyState() && count <10)
		{
			try {
				CustomLogger.info("Page not loaded completely .. Waiting for 3 seconds");
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(count==10)
		{
			CustomLogger.error("Page not loaded after 30 seconds");
		}
		
	}
}
