package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datafromExcel {
	public static WebDriver	 driver;
	public void  providedatatopage() {
			
	 driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		}	
	public void quit() {
		driver.quit();
	}
	public void loginpage() {
		driver.findElement(By.xpath(" \"//span[text()='My Account']\"")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	}

