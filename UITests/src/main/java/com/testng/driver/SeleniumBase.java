package com.testng.driver;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

import java.io.File;

import com.common.utilities.Log;

public class SeleniumBase extends TestBase {

	public WebDriver driver;
	public String testEnv;
	SoftAssert softAssertion = new SoftAssert();

	public WebDriver getDriver() {
		if (this.driver != null) {
			return this.driver;
		} else {
			Log.info("Thread:" + Thread.currentThread().getId() + " getDriver - Driver is null");
			return null;
		}
	}

	@BeforeSuite(alwaysRun = true)
	@Parameters({"environment"})
	public void setupExecutionParams( @Optional("test") String environment) {

		System.out.println("In Before Suite");
		Log.info("In Before Suite 1 --- setupExecutionParams");
		testEnv = environment;
		File resourcesDirectory = new File("src/main/resources");
		String resourcesDir = resourcesDirectory.getAbsolutePath();
		
		
		System.setProperty("environment", environment);
		System.setProperty("resources.dir", resourcesDir);
		
		
		
		
	}

}
