package com.tutorials.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmsbase {
	WebDriver driver;
	
	String urllink = "https://marolixhr.com/login";
	public WebDriver initlizedbroswer() {
		 driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(urllink);
		return driver;
	}
}
