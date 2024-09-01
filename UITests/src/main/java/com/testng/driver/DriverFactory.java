package com.testng.driver;

import org.openqa.selenium.WebDriver;

import com.common.utilities.Log;

public class DriverFactory {


	
	
	
	
	
	
	
	public void quitDriver(WebDriver driver) {
		try {
			driver.quit();
			Log.info("quitDriver > driver.quit() used");
		} catch (Exception e) {
			Log.error("quitDriver " + e.getMessage());
		}
	}

}
