package interfacefull;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.ArrayList;
	import java.util.List;

	public class arraylist {
	    public static void main(String[] args) {
	    
	     
	        WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://openai.com");

	      
	        List<WebElement> elements = driver.findElements(By.tagName("a"));

	     
	        ArrayList<String> linkTexts = new ArrayList<String>();

	        // Store the text of each link in the ArrayList
	        for (WebElement element : elements) {
	            linkTexts.add(element.getText());
	        }

	        // Print the text of the links from the ArrayList
	        System.out.println("Links on the OpenAI website:");
	        for (String text : linkTexts) {
	            System.out.println(text);
	        }

	        // Close the browser
	        driver.quit();
	    }
	
}
