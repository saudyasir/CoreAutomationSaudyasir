package com.training.qa.Tests;

import com.testng.listeners.*;

import org.testng.annotations.*;
import com.testng.driver.SeleniumBase;
import com.training.qa.testdataproperty.PropertyConfigFile;

import org.aeonbits.owner.ConfigFactory;



@Listeners({MyTestListener.class})

public class AppTests extends SeleniumBase

{

	
	PropertyConfigFile td;
	
	
	@BeforeTest (alwaysRun = true)
	@Parameters({"environment","smoke_flag"}) //from testNG xml file
	
	public void testDataSetup(@Optional("test") String environment, @Optional("false") String smoke_flag) {
		
		//Set env and smoke flag 
		System.out.println("In Before Test");
		
		ConfigFactory.setProperty("env", environment);
		td = (PropertyConfigFile) ConfigFactory.create(PropertyConfigFile.class);
		System.setProperty("smoke_flag", smoke_flag);
		
	}

	
	// Test Case 
	@Test (groups = {"Regression"},dataProvider ="datProvideFromExcel", dataProviderClass=DataProviderClass.class)
	public void SB1_login(String username) {
		
		System.out.println(td.url());
		//reportLog("bala");
		//System.out.println(username);

	}
	

	

	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}

	@AfterTest
	public void logout() {
		System.out.println("In After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In After Suite");
	}

	// SoftAssert ad = new SoftAssert();
}
