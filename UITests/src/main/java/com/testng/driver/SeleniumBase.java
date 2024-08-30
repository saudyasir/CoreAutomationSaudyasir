package com.testng.driver;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.common.utilities.Log;

public class SeleniumBase extends TestBase{
	
	
	public WebDriver driver;
	SoftAssert softAssertion = new SoftAssert();

	
	public WebDriver getDriver() {
		if(this.driver != null) {
			return this.driver;
		} else {
			Log.info("Thread:"+Thread.currentThread().getId()+" getDriver - Driver is null");
			return null;
		}
	}
}
