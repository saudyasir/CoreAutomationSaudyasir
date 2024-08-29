package com.testng.driver;

import java.io.File;
import org.testng.*;
import org.testng.asserts.SoftAssert;
public class TestBase {

	public static String baseTestDataDir = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "main" + File.separator + "resources" + File.separator + "testdat" + File.separator;
	public String baseTestOutputDir = System.getProperty("user.dir") + File.separator +"test-output"+ File.separator;
	
	
	
	public static String environment;
	SoftAssert softAssertion = new SoftAssert();
	
	
	

	
}
