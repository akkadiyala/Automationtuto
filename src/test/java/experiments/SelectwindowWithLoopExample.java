package experiments;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectwindowWithLoopExample {
    public static void main(String[] args) throws Exception {
        
    	ChromeDriver driver = new ChromeDriver();

       
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();

        
        WebElement linkToOpen = driver.findElement(By.linkText("Gmail"));

       
        Actions actions = new Actions(driver);

        
        actions.contextClick(linkToOpen).build().perform();
        selectOption(3);
    }

        public static void selectOption(int pos) throws Exception
        {
        	Robot robo = new Robot();
        	for(int i=1;i<=pos;i++) {
        	robo.keyPress(KeyEvent.VK_DOWN);
        	robo.keyRelease(KeyEvent.VK_DOWN);
        	}
        	robo.keyPress(KeyEvent.VK_ENTER);
        	robo.keyRelease(KeyEvent.VK_ENTER);
        }
    
      
    
}
