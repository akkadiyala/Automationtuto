package com.tutorials.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	Properties pro;
	String urllink;
	public Base() throws IOException {
		 pro = new Properties();
		FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//config//Config.properties");
		
		pro.load(file);
urllink=	 pro.getProperty("url");
		
		
		
	}
	public WebDriver initlizedbroswer() {
		 driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(urllink);
		return driver;
	}

}
//path correct way : 	String pathofoutput="test-output//ExtentReport//extentreport.html";