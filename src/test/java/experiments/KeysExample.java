package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.example.com");

        // Find an input field by its ID
        WebElement inputField = driver.findElement(By.id("username"));

        // Using sendKeys with Keys class
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select all text
        inputField.sendKeys(Keys.BACK_SPACE); // Delete the selected text

        // You can combine keys using chord
        inputField.sendKeys(Keys.chord(Keys.SHIFT, "hello")); // Type 'hello' in uppercase

        // Close the browser
        driver.quit();
    }
}
