package experiments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	int rowcount = row.size();
	System.out.println("total rows is " + rowcount);
	System.out.println("total column is "+ getcolumnsize(row));

for(int i=0;i<row.size();i++) {
	
	String data=row.get(i).getText();
	System.out.println(data);
	
}
}
public static int getcolumnsize(List<WebElement> row) {
	int size = 0;
	for(WebElement column: row) {
		List<WebElement> data =column.findElements(By.tagName("td"));
	size =data.size();
	}
	return size;
}
}

