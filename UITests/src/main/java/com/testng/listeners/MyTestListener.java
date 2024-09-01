package com.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
	
	
	

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Started: test Method name " + iTestResult.getName());
        //System.out.println("Zain"+iTestResult.getAttribute("testName").toString());
        
    }
	
   
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }
	
	
    
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());  //this gives name of test from testNG xml
    }
    
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
    }
    
    
    /*
	public void onStart(ITestContext iTestContext) {
		
		String sumoLOg = iTestContext.getCurrentXmlTest().getParameter("sumo_Log_application");
		System.out.println(sumoLOg);
	}*/
	
	

}
