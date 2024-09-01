package com.testng.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.File;
import java.util.*;

public class ExtentTestManager {

	/*
	 * public static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer,
	 * ExtentTest>(); 
	 * static ExtentReports extent = ExtentManager.getReporter();
	 * 
	 * public static synchronized ExtentTest getTest() { return (ExtentTest)
	 * extentTestMap.get((int) (long) (Thread.currentThread().getId())); }
	 */
	String extentReportFile = System.getProperty("user.dir") + File.separator + "test-output" + File.separator
			+ "ExtentReport.html";
	public static ExtentReports reports = new ExtentReports();
	
	//public static ExtentTest test = reports.createTest("Extent Demo");
	
	
	

}
