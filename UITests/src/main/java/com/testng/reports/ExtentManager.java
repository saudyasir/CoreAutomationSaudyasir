package com.testng.reports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;

import com.testng.driver.TestBase;

public class ExtentManager {

	/*public static ExtentReports extent;

	public synchronized static ExtentReports getReporter() {
		try {

			if (extent == null) {

				String folderTS = TestBase.suiteRunId;
				String baseOutputDir = "";
				String extentReportFile = "";
				String suiteNameDir = System.getProperty("suite_name");
				if (suiteNameDir == null) {
					suiteNameDir = "UNKNOWN";
				}

				extent = new ExtentReports();
								
				if (System.getenv("JENKINS_HOME") != null
						&& System.getenv("JENKINS_HOME").equalsIgnoreCase("D:\\Jenkins")) {
					// code for Jenkins
				}

				baseOutputDir = System.getProperty("user.dir") + File.separator + "test-output" + File.separator;
				extentReportFile = baseOutputDir + "ExtentReport.html";

				ExtentSparkReporter spark = new ExtentSparkReporter(extentReportFile);
				spark.config().setCss(".detail-body th:nth-child(2), td:nth-child(2){ display: none }");
				JsonFormatter json = new JsonFormatter(baseOutputDir + "extent_" + folderTS + ".json");
				extent.createDomainFromJsonArchive(baseOutputDir + "extent_" + folderTS + ".json");
				extent.attachReporter(json, spark);
				System.out.println("extent attached");

			}

		} catch (Exception t) {
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		return extent;
	}*/

}
