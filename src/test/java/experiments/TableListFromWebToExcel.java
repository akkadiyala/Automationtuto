package experiments;




import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class TableListFromWebToExcel {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
      
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test
    public void extractTableDataAndWriteToExcel() throws IOException {
        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tutorial.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("TableData");
       
        int rowCount = 0;

        for (WebElement row : rows) {
        	 Row excelRow = sheet.createRow(rowCount++);
            List<WebElement> cells = row.findElements(By.tagName("td"));
           

            int cellCount = 0;
            for (WebElement cell : cells) {
                Cell excelCell = excelRow.createCell(cellCount++);
                excelCell.setCellValue(cell.getText());
            }
        }

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}

