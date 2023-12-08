package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsreload {
	public static void main(String[] args) throws Exception {
        
    	ChromeDriver driver = new ChromeDriver();

       
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();
        WebElement element  = driver.findElement(By.linkText("Gmail"));
        element.click();
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName();
        //move by using coordinates and poiint 
        Actions action = new Actions(driver);
        action.moveByOffset(X, Y).click().perform();
        
       
        action.moveToElement(element, X, Y).click().perform();


        
       
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).build().perform();
        driver.quit();
}
}