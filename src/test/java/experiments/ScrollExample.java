package experiments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {
	  
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://www.example.com");

        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0, 500);");

        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0, -500);");

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Scroll to the top of the page
        js.executeScript("window.scrollTo(0, 0);");
        
        WebElement element = null;
  js.executeScript("arguments[0].scrollIntoView(true);", element);


        // Close the browser
        driver.quit();
    }
}
