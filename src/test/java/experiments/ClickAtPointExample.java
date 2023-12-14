package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAtPointExample {
	    public static void main(String[] args) {
	    	ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.example.com");

	        // Find the element to click
	        WebElement elementToClick = driver.findElement(By.id("exampleElementId"));

	        // Create Actions class
	        Actions actions = new Actions(driver);

	        // Move to the element
	        actions.moveToElement(elementToClick);

	        // Click at a specific point (e.g., x-offset: 10, y-offset: 20 from the top-left corner of the element)
	        actions.moveByOffset(10, 20).click().build().perform();

	        // Close the browser
	        driver.quit();
	    }
	}


