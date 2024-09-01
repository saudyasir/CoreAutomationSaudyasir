package com.testng.driver;

import java.io.File;
import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import org.json.JSONObject;
import org.json.JSONException;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.Status;

import com.common.utilities.*;
import com.testng.reports.ExtentTestManager;

public class TestBase {

	public static String baseTestDataDir = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "main" + File.separator + "resources" + File.separator + "testdata" + File.separator;
	public String baseTestOutputDir = System.getProperty("user.dir") + File.separator + "test-output" + File.separator;

	String suiteName;

	public static String environment;
	SoftAssert softAssertion = new SoftAssert();
	
	public static final String suiteRunId = DateFunctions.getTodaysDateInFormat("yyyyMMdd_HHmmss");

	@BeforeSuite(alwaysRun = true)
	public String getSuiteName(ITestContext context) {
		suiteName = context.getCurrentXmlTest().getSuite().getName();
		return suiteName; // this is from testNG xml <suite name="Automation Framework Testing Suite">
	}

	/*public void reportLog(Object object) {

		Markup m = null; // for JSON check 
		String oType="";
		
		if (object instanceof String) {
			String string = (String) object;

			if(isValidJason(string)) {
				m = MarkupHelper.createCodeBlock(string,CodeLanguage.JSON);
				oType = "JSON";
			}
			else {
				m=null; //report as normal String
			}
			Log.info(">"+Thread.currentThread().getStackTrace()[3].getMethodName()+" >> "+(String) object); //Log4j
			Reporter.log(string); //testNG reports
		}
		
		if(m!=null) {
			ExtentTestManager.getTest().log(Status.INFO,DateFunctions.getDateFormatted(DateFunctions.getTodaysDate(),"hh:mm:ss a").toString()+" &emsp "+m.getMarkup());
		}else {
			ExtentTestManager.getTest().log(Status.INFO,DateFunctions.getDateFormatted(DateFunctions.getTodaysDate(),"hh:mm:ss a").toString()+" &emsp "+(String) object);
			
		}
	
	}*/

	public boolean isValidJason(String json) {
		try {
			new JSONObject(json);
		} catch (JSONException e) {
			return false;
		}
		return true;
	}

}
