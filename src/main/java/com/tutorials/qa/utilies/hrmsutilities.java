package com.tutorials.qa.utilies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class hrmsutilities {

	public static Object[][] datafromexcelsheet() throws IOException{
		FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//Hrms.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet  sheet=	book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount= sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][columncount];
		for(int i = 0 ; i<rowcount;i++) {
			XSSFRow	row= sheet.getRow(i+1);
			for(int j =0 ; j<columncount;j++) {
				XSSFCell	cell = row.getCell(j);
			if(cell != null) {
				CellType	celltype=	cell.getCellType();
				switch(celltype) {
				case STRING:
					data[i][j]= cell.getStringCellValue();
					break;
				
				case NUMERIC :
				data[i][j] = Integer.toString((int)cell.getNumericCellValue());
				break;
				
			}
			
		}
			else {
				data[i][j] = null;
			}
			
		}
	}
		return data;
	
}
}

