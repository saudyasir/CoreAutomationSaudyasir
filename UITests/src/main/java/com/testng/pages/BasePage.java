package com.testng.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.testng.driver.*;

import com.common.utilities.*;

//Class for all tailored Selenium methods 

public abstract class BasePage {

	public WebDriver driver;
	public WebDriverWait wait;
	protected static final int DEFAULT_WAIT_TIME = 180;
	protected static final int PAGELOAD_TIME = 180;
	public SeleniumBase selenBase = new SeleniumBase();

	public BasePage() {
		try {

			// this.driver = DriverBase.get().getDriver();
			this.driver = driver;
			maximizeDriver();
			// driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIME, TimeUnit.SECONDS);
			// //-->TimeUnit.SECONDS is deprecated
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOAD_TIME));
			driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(DEFAULT_WAIT_TIME));

			try {
				PageFactory.initElements(driver, this);
			} catch (Exception e) {
				System.out.println("Thread ID:" + Thread.currentThread().getId()
						+ " **** Exception at Base Page -> PageFacotry.initElements" + e.getMessage());
			}

			wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));

		} catch (Exception e) {

		}

	}

	public void maximizeDriver() {
		try {
			if (OSUtils.getOS().equals(OSUtils.OS.LINUX)) {
				driver.manage().window().setSize(new Dimension(1920, 1080));
			} else {
				// if(!DriverBase.get().getDeviceType().equalsIgnoreCase("mobile")) {}
				driver.manage().window().maximize();
			}
		} catch (WebDriverException e) {
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
	}

	// Wait Methods -----------------------

	// Report Log
	public void reportLog(String message) {
		//selenBase.reportLog(message);
	}
}
