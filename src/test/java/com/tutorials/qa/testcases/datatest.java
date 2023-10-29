package com.tutorials.qa.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorials.qa.pages.AccountPage;
import com.tutorials.qa.utilies.Utlities;

import experiments.datafromExcel;

public class datatest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException  {
		 driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(2000);
	}
	@Test(dataProvider= "testdata")
	public void verfiyloginwithvaliddata(String email,String Password , String Status) throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
		Thread.sleep(2000);
		System.out.println(Status);
	}
	@DataProvider(name="testdata")
	public Object[][] supplytestdata() throws IOException {
		//Object [] []  data =Utlities.gettestdatafromexcel("Login");
		FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tutorial.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");
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
		//Object [] []  data = {{"anilkumar.marolix@gmail.com" ,"Anilkumar"} ,{"anilkumar5.marolix@gmail.com" ,"Anilkumar"}};
		return data;
		}
	@AfterMethod
	public void down() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}
}
