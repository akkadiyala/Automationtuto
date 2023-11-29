package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class OpenAllWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            openUrl(driver, url);
            driver.getTitle();
        }

        String targetWindow = "Google Images";
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            driver.switchTo().window(window);
            System.out.println("Window Title: " + driver.getTitle());
          //  if (driver.getTitle().equals(targetWindow)) {
            	 if (!window.equals(targetWindow)) {
            		 Thread.sleep(1000);
                     driver.switchTo().window(window);
                     Thread.sleep(1000);
                     driver.close();
             //   closeAllWindowsExceptTarget(driver, targetWindow);
           //     break;
               
            } 
            	 else {
            		 driver.switchTo().window(targetWindow);
            	 }
        }

        // At this point, the driver is focused on the target window
        System.out.println("Selected Window Title: " + driver.getTitle());

        // Close the main window (optional)
        // driver.close();
    }

    private static void openUrl(WebDriver driver, String url) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open(arguments[0], '_blank');", url);
    }

    private static void closeAllWindowsExceptTarget(WebDriver driver, String targetWindow) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(targetWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
            
        }
        // Switch back to the target window
        driver.switchTo().window(targetWindow);
    }
}
