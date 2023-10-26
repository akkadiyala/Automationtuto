package com.tutorials.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorials.qa.base.Base;
import com.tutorials.qa.pages.HomePage;
import com.tutorials.qa.pages.SearchPage;

public class Search extends Base {
	HomePage	homepage;
	SearchPage searchpage;
	public Search() throws IOException {
		super();	
		}
	public WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException {
		
	    driver=	initlizedbroswer();
	    homepage= new HomePage(driver);

		
		
	}
	@Test
	public void verifywithvalidproduct() {
		
		 homepage.searchbox("HP");
		searchpage = homepage.clicksearchbox();
		 
		Assert.assertTrue(searchpage.DISPLAYSTATUSOFHP());
		
	}
	@Test
public void verifywithinvalidproduct() {
	
		homepage.searchbox("honda");
		searchpage = homepage.clicksearchbox();
		
		
		String actual =  searchpage.invaliderrormessageforproduct();
		Assert.assertEquals(actual, "There is no product that matches the search criteria.");
		
	}
	@Test
public void verifywithoutnameproduct() {
	
		
	searchpage=	homepage.clicksearchbox();
		
			
			String actual =  searchpage.invaliderrormessageforproduct();
			Assert.assertEquals(actual, "There is no product that matches the search criteria.");
			
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
