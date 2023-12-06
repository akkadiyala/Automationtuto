package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectWindowWithoutrobotExample {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement linkToOpen = driver.findElement(By.linkText("Gmail"));

        // Open context menu using SHIFT + F10 (equivalent to right-click)
       linkToOpen.sendKeys(Keys.SHIFT, Keys.F10);

        // Perform some action, e.g., pressing arrow down and then Enter
        selectOption(linkToOpen, 3);

        // Close the browser
        driver.quit();
    }

    public static void selectOption(WebElement element, int pos) {
        // Simulate pressing the arrow down key to navigate the context menu
        for (int i = 1; i <= pos; i++) {
            element.sendKeys(Keys.ARROW_DOWN);
        }

        // Perform some action, e.g., pressing Enter to select the option
        element.sendKeys(Keys.ENTER);
    }
}
