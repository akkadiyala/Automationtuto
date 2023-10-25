package com.tutorials.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorials.qa.base.Base;

public class Search extends Base {
	public Search() throws IOException {
		super();	
		}
	WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException {
		
	    driver=	initlizedbroswer();

		
		
	}
	@Test
	public void verifywithvalidproduct() {
		
		driver.findElement(By.name("search")).sendKeys("hp");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		
	}
	@Test
public void verifywithinvalidproduct() {
		
		driver.findElement(By.name("search")).sendKeys("honda");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String actual = driver.findElement(By.xpath("//div[@id='content']/p[text()='There is no product that matches the search criteria.']")).getText();
		Assert.assertEquals(actual, "There is no product that matches the search criteria.");
		
	}
	@Test
public void verifywithoutnameproduct() {
		
		driver.findElement(By.name("search")).sendKeys("");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String actual = driver.findElement(By.xpath("//div[@id='content']/p[text()='There is no product that matches the search criteria.']")).getText();
		Assert.assertEquals(actual, "There is no product that matches the search criteria.");
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
