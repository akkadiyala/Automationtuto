package experiments;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class rightclickbyaction {
static 	Actions actions;
	  public static void main(String[] args) throws Exception {
	        
	    	ChromeDriver driver = new ChromeDriver();

	       
	        driver.get("https://www.google.com/ ");
	        driver.manage().window().maximize();

	        
	        WebElement linkToOpen = driver.findElement(By.linkText("Gmail"));
	        


	       
	         actions = new Actions(driver);

	        
	        actions.contextClick(linkToOpen).build().perform();
	        Thread.sleep(2000);
	        selectOption(1);
	        
	    }

	        public static void selectOption(int pos) throws Exception
	        {
	        	for(int i=1;i<=pos;i++) {
	 //       		actions.sendKeys(KeyEvent.VK_DOWN).build().perform();
	        		
	        	}
	        	actions.sendKeys(Keys.ENTER).build().perform();
	        }
	        
	    
}
