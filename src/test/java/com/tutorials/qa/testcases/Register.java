package com.tutorials.qa.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorials.qa.base.Base;
import com.tutorials.qa.pages.AccountSuccessPage;
import com.tutorials.qa.pages.HomePage;
import com.tutorials.qa.pages.RegisterPage;
import com.tutorials.qa.utilies.Utlities;

public class Register extends Base {
	public Register() throws IOException {
		super();	
		}
	WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException {
		
	    driver=	initlizedbroswer();
	    HomePage  homepage = new HomePage(driver);
	    homepage.clickonmyaccount();
	    homepage.selectregisteroption();
		
			
	}
	@Test
	public void verifywithonlymantodoryfileds() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterfistname("chinna");
		registerpage.enterlastname("kadiyala");
		registerpage.enteremailfield(Utlities.emailtimestamp());
		registerpage.entertelephonefield("1234566789");
		registerpage.enterinputpasswordfield("8790936903");
		registerpage.enterinputconfirmfield("8790936903");
		registerpage.clickoncheckboxagreefield();
		registerpage.clickonclickcontinuefield();
		AccountSuccessPage AccountSuccesspage = new AccountSuccessPage(driver);
		String actualtext=AccountSuccesspage.accountsucessmessage();
		System.out.println(actualtext);
		Assert.assertEquals(actualtext , "Your Account Has Been Created!");
		
		
	}
	@Test
	public void verifyprovingallfeilds() {
	
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterfistname("chinna");
		registerpage.enterlastname("kadiyala");
		registerpage.enteremailfield(Utlities.emailtimestamp());
		registerpage.entertelephonefield("1234566789");
		registerpage.enterinputpasswordfield("8790936903");
		registerpage.enterinputconfirmfield("8790936903");
		
		registerpage.clickonsubscriberadiobutton();
		registerpage.clickoncheckboxagreefield();
		registerpage.clickonclickcontinuefield();
		
		AccountSuccessPage AccountSuccesspage = new AccountSuccessPage(driver);
		String actualtext=AccountSuccesspage.accountsucessmessage();
		
		Assert.assertEquals(actualtext , "Your Account Has Been Created!");
		
		
	}
	@Test
	public void verifyregisterwithexistingemail() {
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.enterfistname("chinna");
		registerpage.enterlastname("kadiyala");
		registerpage.enteremailfield("anilkumar.marolix@gmail.com");
		registerpage.entertelephonefield("1234566789");
		registerpage.enterinputpasswordfield("8790936903");
		registerpage.enterinputconfirmfield("8790936903");
		
		registerpage.clickonsubscriberadiobutton();
		registerpage.clickoncheckboxagreefield();
		registerpage.clickonclickcontinuefield();
		String actualtext=	registerpage.getexistingmailerror();
		
	
	Assert.assertEquals(actualtext , "Warning: E-Mail Address is already registered!");
}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
}