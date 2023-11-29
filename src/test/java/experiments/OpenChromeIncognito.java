package experiments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeIncognito {
    public static void main(String[] args) {
     

      
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

       
        WebDriver driver = new ChromeDriver(options);

       
        driver.get("https://www.Google.com/");


        driver.quit();
    }
}
