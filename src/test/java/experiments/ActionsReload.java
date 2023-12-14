package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsReload {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.linkText("Gmail"));
        element.click();

        // Set coordinates using the Point class
        Point coordinates = new Point(100, 200);

        // Move by using coordinates
        Actions action = new Actions(driver);
        action.moveByOffset(coordinates.getX(), coordinates.getY()).click().perform();

        // Move to an element with specific X and Y offsets using the Point class
        action.moveToElement(element, coordinates.getX(), coordinates.getY()).click().perform();
    



        
       
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).build().perform();
        driver.quit();
}
}