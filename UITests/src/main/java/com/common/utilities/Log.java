package com.common.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	// Initialize Log4j instance
	private static Logger Log = LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());

	// can be used when tests starts
	public static void startLog(String testCaseName) {
		Log.info("Test is Starting.......");
	}

	// can be used when tests ends
	public static void endLog(String testCaseName) {
		Log.info("Test is Ending.......");
	}

	// Info level Log
	public static void info(String message) {
		Log.info(message);
	}
	
	// Error level Log
		public static void error(String message) {
			Log.error(message);
		}


}
