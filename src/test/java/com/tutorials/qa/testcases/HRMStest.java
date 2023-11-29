package com.tutorials.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorials.qa.base.Hrmsbase;

import com.tutorials.qa.pages.HRMS;

import com.tutorials.qa.utilies.hrmsutilities;


public class HRMStest extends Hrmsbase{
	public WebDriver driver;
	HRMS hrms;
	@BeforeMethod
	
	public void setup() throws IOException {
		
		
	    driver=	initlizedbroswer();
}
	@Test(enabled=true , dataProvider ="fromexcelsheet" , invocationCount = 3)
	public void homapagelogin(String email , String password){
		hrms = new HRMS(driver);
		hrms.enteremail(email);
		
		hrms.enterpassword(password);
		hrms.submit();
		
	//	hrms.clockin();
		
	}
	@Test(enabled=false)
	public void login() {
		hrms.clockin();
	}
	@Test(enabled=false)
	public void logout() {
		hrms.clockout();
	}
	@DataProvider(name="localinputs")
	public Object[][] inputdata(){
		Object[][] data ={ {"anilkumar5.marolix@gmail.com","Anilkumar@5"}};
		return data;
	}
	@DataProvider(name="fromexcelsheet")
	public Object[][] fromexcelsheet() throws IOException{
	Object[][] data=	hrmsutilities.datafromexcelsheet();
		return data;
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}