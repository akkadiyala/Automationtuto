package com.tutorials.qa.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorials.qa.base.Base;
import com.tutorials.qa.pages.AccountPage;
import com.tutorials.qa.pages.HomePage;
import com.tutorials.qa.pages.LoginPage;
import com.tutorials.qa.utilies.Utlities;


public class LoginTest extends Base {
	LoginPage loginpage;
public LoginTest() throws IOException {
	
	super();	
	}
	public WebDriver driver;

	@BeforeMethod
	
	public void setup() throws IOException {
		
		
	    driver=	initlizedbroswer();
	
	    HomePage  homepage = new HomePage(driver);
	    homepage.clickonmyaccount();
	    
 loginpage = homepage.selectloginoption();	
		
	}
	@Test(dataProvider= "validtestdata" , priority =1)
	public void verfiyloginwithvaliddata(String email,String Password) {
		
		loginpage.enteremail(email);
		loginpage.enterpassword(Password);
		AccountPage accountpage =loginpage.clickonlogin();
		
	
		Assert.assertTrue(accountpage.accounteditinfromessage(),"Edit your account information");
		
	
	}
	@DataProvider(name="validtestdata")
	public Object[][] supplytestdata() throws IOException {
		//Object [] []  data =Utlities.gettestdatafromexcel("Login");
		Object [] []  data = {{"anilkumar5w.marolix@gmail.com" ,"Anilkumar"}};
		return data;
		}
	@Test(priority=2)
	public void verifyloginwithinvaliddata(){
	
		loginpage.enteremail((Utlities.emailtimestamp()));
		loginpage.enterpassword("invalidpassword");
		loginpage.clickonlogin();
	String actaulwrongmessage=	loginpage.warningmessageforemail();
	
	Assert.assertEquals(actaulwrongmessage ,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	
	
	@Test(priority=3)
	public void Verifywithvalidemailandinvalidpassword() {
	
		
		loginpage.enteremail((Utlities.emailtimestamp()));
		loginpage.enterpassword("invalidpassword");
		loginpage.clickonlogin();
	String actaulwrongmessage=	loginpage.warningmessageforemail();
	
	Assert.assertEquals(actaulwrongmessage ,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	@Test
	public void verifywithoutdata() {
	

	LoginPage loginpage = new LoginPage(driver);
	
		loginpage.clickonlogin();
	String actaulwrongmessage=	loginpage.warningmessageforemail();
	
	Assert.assertEquals(actaulwrongmessage ,"Warning: No match for E-Mail Address and/or Password.");
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
}
