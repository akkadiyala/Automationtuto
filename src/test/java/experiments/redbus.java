package experiments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.findElement((By.id("src"))).sendKeys("hyderabad");
	 List<WebElement> listh =   driver.findElements(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Hyderabad']"));
	 System.out.println(listh.size());
	 for(WebElement from :listh) {
		 System.out.println(from.getText()); 
	
}
}
}