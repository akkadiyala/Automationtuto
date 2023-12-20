package experiments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksWithoutHttp {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int allLinksSize = links.size();
        System.out.println("Total links: " + allLinksSize);

        
        int validLinksCount = 0;
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            // Uncomment the line below if you want to print all URLs
            // System.out.println(url);

            if (url != null && !url.isEmpty() && !url.contains("null") && !url.equals("https://www.amazon.in/#")) {
                System.out.println("Valid link: " + url);
                validLinksCount++;
            } else {
                System.out.println("Broken link: " + url);
            }
        }

        System.out.println("Total valid links: " + validLinksCount);
        driver.quit();
    }

   
    
}
