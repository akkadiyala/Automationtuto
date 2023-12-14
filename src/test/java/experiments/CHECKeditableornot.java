package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CHECKeditableornot {
	  public static void main(String[] args) throws Exception {
	        
	    	ChromeDriver driver = new ChromeDriver();

	       
	        driver.get("https://www.google.com/ ");
	        driver.manage().window().maximize();

	        
	        WebElement linkToOpen = driver.findElement(By.xpath("//textarea[@title='Search']"));
	        String val = linkToOpen.getAttribute("readonly");
	        System.out.println(val);
	        
	     Assert.assertNull(val);
	     // or below method also
	     if(val==null)
	        {
	        System.out.println("editable");	
	        }
}
}
