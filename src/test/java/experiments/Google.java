package experiments;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");

//driver.navigate().to("https://www.google.com");
driver.manage().window().maximize();
//driver.manage().window().
String pageSource = driver.getPageSource();
System.out.println("Page Source:\n" + pageSource);
By googlesearchL=By.name("q");
WebElement googleE=driver.findElement(googlesearchL);
googleE.sendKeys("anilkumar kadiyala chowdary");
googleE.click();








Dimension dim = new Dimension(250, 400);

driver.manage().window().setSize(dim);
Thread.sleep(3000);
Point pnt = new Point(400, 250); 

driver.manage().window().setPosition(pnt);
}

}

