package experiments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableDataAndPrintOutput {
	
	public void extractTableDataAndPrintOutput(WebDriver driver) {
	    // Assuming 'driver' is an instance of WebDriver
	    WebElement table = driver.findElement(By.id("customers"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));

	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.tagName("td"));

	        for (WebElement cell : cells) {
	            // Print the cell value to the console
	            System.out.print(cell.getText() + "\t");
	        }

	        // Move to the next line for a new row in the console
	        System.out.println();
	    }
	}


}