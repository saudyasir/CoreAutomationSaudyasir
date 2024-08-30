package com.testng.driver;

import java.io.File;
import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
public class TestBase {

	public static String baseTestDataDir = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "main" + File.separator + "resources" + File.separator + "testdata" + File.separator;
	public String baseTestOutputDir = System.getProperty("user.dir") + File.separator +"test-output"+ File.separator;
	
	String suiteName;
	
	public static String environment;
	SoftAssert softAssertion = new SoftAssert();
	
	
	@BeforeSuite(alwaysRun=true)
	public String getSuiteName(ITestContext context) {
		suiteName = context.getCurrentXmlTest().getSuite().getName();
		return suiteName;  // this is from testNG xml <suite name="Automation Framework Testing Suite">
	}

	
}
