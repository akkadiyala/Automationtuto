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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(urllink);
		return driver;
	}

}
