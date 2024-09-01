package com.common.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {
	
	
	public static Date getTodaysDate() {
		Date date = new Date();
		return date;
	}
	
	public static String getTodaysDateInFormat(String dateFormat) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		return formatter.format(getTodaysDate()).toString();
	}
	
	public static String getDateFormatted(Date date, String dateNewFormat) {
		String formattedDate = null;
		try {
			DateFormat format2 = new SimpleDateFormat(dateNewFormat);
			formattedDate = format2.format(date);
		} catch (Exception e) {
			System.out.println("Exception at getDateFormatted " + e.getMessage());
			e.printStackTrace();
		}
		return formattedDate;
	}

}
