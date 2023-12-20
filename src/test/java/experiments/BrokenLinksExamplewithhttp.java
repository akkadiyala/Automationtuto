package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksExamplewithhttp {

    public static void main(String[] args) {
       
     
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

       
        List<WebElement> links = driver.findElements(By.tagName("a"));

        
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

      
        driver.quit();
    }

    public static void verifyLink(String url) {
        try {
            // Create a URL object
            URL linkURL = new URL(url);

            // Open a connection to the URL
            HttpURLConnection httpConn = (HttpURLConnection) linkURL.openConnection();

            // Get the HTTP response code
            int responseCode = httpConn.getResponseCode();

            // Check if the response code is not in the range of 200 to 399
            if (responseCode < 200 || responseCode >= 400) {
                System.out.println("Broken Link: " + url + " - Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + url + " - Response Code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Exception while checking the link: " + e.getMessage());
        }
    }
}
