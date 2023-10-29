package experiments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;


public class listfromwebtoexcel {
	WebDriver driver;
	@BeforeMethod
public void setup() throws InterruptedException {
	 driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
		

      driver.manage().window().maximize();
}
@Test
public void getetext() throws IOException {
	


      WebElement selectElement = driver.findElement(By.xpath("//select"));

      // Locate all the <option> elements within the <select> element
      List<WebElement> optionElements = selectElement.findElements(By.xpath("//select/option"));

      // Print the text of each <option> element
     

      // Create a new Excel workbook and sheet
      FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tutorial.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.createSheet("list");
      for (int i = 0; i < optionElements.size(); i++) {
          XSSFCell excelCell = sheet.createRow(i).createCell(0);
          excelCell.setCellValue(optionElements.get(i).getText());
      }

      // Save the Excel workbook to a file
     
      for (WebElement option : optionElements) {
          
	          System.out.println("Text: " + option.getText());
	        }
}
@AfterMethod
public void close() {
	driver.quit();
}
}