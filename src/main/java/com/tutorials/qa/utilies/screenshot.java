package com.tutorials.qa.utilies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static  String screenshottaken(WebDriver driver ,String testname){
		
		String path ="";
	
	try {
		
		 
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  path = ".//Screenshots//" + testname + ".png";

		 File destination1 = new File(path);
		
		 FileHandler.copy(screenshotFile, destination1);

	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return path;

	//path correct way : 	String pathofoutput="test-output//ExtentReport//extentreport.html";
		
	} 


}
