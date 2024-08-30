package com.training.qa.Tests;

import org.testng.annotations.*;
import com.testng.driver.SeleniumBase;
import com.training.qa.testdataproperty.PropertyConfigFile;

import org.aeonbits.owner.ConfigFactory;
import org.testng.TestNG;

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

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}

	@Test (dataProvider ="datProvideFromExcel", dataProviderClass=DataProviderClass.class)
	public void login(String username) {
		
		System.out.println(td.url());

		System.out.println(username);

	}
	

	/*@Test (alwaysRun = false)
	public void loginPassword() {

		System.out.println("Test2 is Run");

	}*/

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
