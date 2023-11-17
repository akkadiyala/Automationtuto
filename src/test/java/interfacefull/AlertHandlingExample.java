package interfacefull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingExample {
    public static void main(String[] args) throws InterruptedException {
        

     
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

       
        driver.switchTo().frame("iframeResult");

      
        WebElement button = driver.findElement(By.cssSelector("button"));
        button.click();

    
        try {
           
            String alertText = driver.switchTo().alert().getText();
            System.out.println("Alert Text: " + alertText);

            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("No alert present");
        }

    
   //     driver.quit();
    }
}


