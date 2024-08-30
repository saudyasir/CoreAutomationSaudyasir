package com.training.qa.Tests;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.*;

public class DataProviderClass {

	@DataProvider(name = "datProvider")
	public Object[][] getDataFromCSV() {
		return new Object[][] { { "username", "password" } };
	}

	@DataProvider(name = "datProvideFromExcel")

	public Object[][] getDataFromExcel() throws IOException {
		// Logic to get data and return in Object [][]

		FileInputStream stream = new FileInputStream("D:/DemoFile.xlsx");
		XSSFWorkbook work_book = new XSSFWorkbook(stream);
		XSSFSheet sheet = work_book.getSheetAt(0);
		Object[][] data = new Object[2][1];
		for(int i=0;i<=1;i++) {
			data[i][0]= sheet.getRow(i).getCell(0).getStringCellValue();
			
		}
		return data;
	}

	@DataProvider(name = "iteratorData")
	public Iterator<Object[]> dataProviderUsingIterator() {
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] { "data1", 1 });
		data.add(new Object[] { "data2", 2 });
		return data.iterator();
	}

}
