package experiments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class table2 {
	public static void main(String[] args) throws IOException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
WebElement	 data =driver.findElement(By.xpath("//table[@class='ws-table-all']"));
	List<WebElement> rows = data.findElements(By.tagName("tr"));
	FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tabledata.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet=  workbook.getSheet("Tabledata");
  //  XSSFSheet sheet = workbook.createSheet("Table");
	int rowcount = rows.size();
    int columnsize = 0;
    int rowexcel =0;
for(WebElement row : rows) {
	List<WebElement> column=row.findElements(By.tagName("td"));
	Row excelrow=sheet.createRow(rowexcel++);
	  columnsize =column.size();
	 int columnexcel =0;
	for(WebElement value : column) {
	List<WebElement>datas=value.findElements(By.tagName("td"));
Cell excelcell=	excelrow.createCell(columnexcel++);
excelcell.setCellValue(value.getText());
String excelvalues =excelcell.getStringCellValue();

	System.out.println(value.getText());
		
	}
	
	System.out.println("");
}
FileOutputStream fileOut = new FileOutputStream(".//src//main//java//com//tutorials//qa//testdata//tabledata.xlsx");
    workbook.write(fileOut);
    System.out.println("Excel file has been created successfully.");
System.out.println(rowcount);
System.out.println(columnsize);

	}
	
}