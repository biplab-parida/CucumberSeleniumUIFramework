package com.fis.test.AppRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, dryRun = false, 
features = {"src/test/resources/Feature"}, 
glue = {"com.fis.test.stepdefinitions","com.fis.test.AppHooks"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json",
		"junit:target/cucumber-results.xml", "rerun:target/rerun.txt" },
tags = "@tag1")
public class AppTest extends AbstractTestNGCucumberTests{
    
@Override
@DataProvider(parallel = false)
public Object[][] scenarios() {
	return super.scenarios();
}
}
