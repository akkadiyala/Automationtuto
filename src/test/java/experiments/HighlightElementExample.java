package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementExample {

    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();

     
        driver.get("https://www.example.com");

       
        WebElement elementToHighlight = driver.findElement(By.id("yourElementId"));

     
        highlightElement(driver, elementToHighlight);

      
        driver.quit();
    }

    private static void highlightElement(WebDriver driver, WebElement element) {
        try {
            // Use JavascriptExecutor to highlight the element
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", element);

            // Pause for a moment (optional)
            Thread.sleep(1000);

            // Remove the highlight
            js.executeScript("arguments[0].style.border=''", element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
