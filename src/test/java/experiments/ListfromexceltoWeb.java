package experiments;


	import org.apache.poi.ss.usermodel.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class ListfromexceltoWeb {

	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize ChromeDriver
	        driver = new ChromeDriver();

	        // Navigate to the registration page
	        driver.get("https://example.com/register");
	    }

	    @Test
	    public void registerUserFromExcel() throws IOException {
	        // Path to the Excel file
	        String excelFilePath = "path/to/registration_data.xlsx";

	        // Open the Excel file
	        FileInputStream fis = new FileInputStream(excelFilePath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(0);

	        // Iterate through rows in Excel (assuming the data is organized row-wise)
	        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
	            Row row = sheet.getRow(rowIndex);

	            // Get data from Excel it is from  =normal form 
	            String firstName = row.getCell(0).getStringCellValue();
	            String lastName = row.getCell(1).getStringCellValue();
	            String email = row.getCell(2).getStringCellValue();
	            String password = row.getCell(3).getStringCellValue();
	            
	                                  //or any for or notmanl 0 1 2 3 method                       
	            
	         // Iterate through cells in the current row  it is in for loop method 
	 //           for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {
	           //     String cellValue = row.getCell(cellIndex).getStringCellValue();
	            
	            // Fill in the registration form on the webpage
	            WebElement firstNameInput = driver.findElement(By.id("firstName"));
	            WebElement lastNameInput = driver.findElement(By.id("lastName"));
	            WebElement emailInput = driver.findElement(By.id("email"));
	            WebElement passwordInput = driver.findElement(By.id("password"));

	            firstNameInput.sendKeys(firstName);
	            lastNameInput.sendKeys(lastName);
	            emailInput.sendKeys(email);
	            passwordInput.sendKeys(password);

	            // Perform any other actions or verifications as needed

	            // Submit the form
	            driver.findElement(By.id("registerButton")).click();
	        }

	        // Close the Excel file

	    
	    }
	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}
	
	
	    
