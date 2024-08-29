package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	protected static final int DEFAULT_WAIT_TIME = 180;
	protected static final int PAGELOAD_TIME = 180;
	

}
