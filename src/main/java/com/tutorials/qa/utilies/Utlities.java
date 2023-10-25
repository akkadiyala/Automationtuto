package com.tutorials.qa.utilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utlities {
	public static String emailtimestamp() {
		Date date = new Date();
	String time=	date.toString().replace(" ","_").replace(":","_");
	return "anilkumar"+time+"@gmail.com";

		
	}
	public static Object[][] gettestdatafromexcel(String sheetname) throws IOException {
		FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tutorialstestdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rowscount =sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		Object [][] data = new Object[rowscount][columncount];
		for(int i=0;i<rowscount;i++ ) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0;j<columncount;j++) {
			XSSFCell cell = row.getCell(j);
			if (cell != null) {
		CellType celltype = cell.getCellType();
		switch(celltype) {
		case STRING :
			data[i][j]= cell.getStringCellValue();
		     break;
		case NUMERIC:
			data[i][j]= Integer.toString((int) cell.getNumericCellValue());
			break;
			}
			}	
			else {
                data[i][j] = ""; // Default value for null cells
            }
		}
		}
		return data;
	
		}
}

