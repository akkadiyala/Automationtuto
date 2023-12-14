package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownSelectionWithoutSelect {

    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website with the dropdown
        driver.get("url_of_your_website_with_dropdown");

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.id("your_dropdown_id"));

        // Instantiate the Actions class
        Actions actions = new Actions(driver);

        // Click on the dropdown to open it
        dropdown.click();

        // Use arrow keys to navigate and press Enter to select the desired option
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        // Optionally, you can add a wait to see the result
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
