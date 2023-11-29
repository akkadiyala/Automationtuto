package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectWindowWithLoopjavascript{
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement linkToOpen = driver.findElement(By.linkText("Gmail"));

        // Perform a right-click on the link
        performRightClick(driver, linkToOpen);

        // Simulate pressing the arrow down key to navigate the context menu
        selectOption(driver, 3);

        // Close the browser
      //  driver.quit();
    }

    public static void performRightClick(ChromeDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].dispatchEvent(new MouseEvent('contextmenu', { bubbles: true }))", element);
    }

    public static void selectOption(ChromeDriver driver, int pos) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i <= pos; i++) {
            js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', { 'key': 'ArrowDown' }))", driver.switchTo().activeElement());
        }

        // Perform some action, e.g., pressing Enter to select the option
        js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', { 'key': 'Enter' }))", driver.switchTo().activeElement());
    }
}
