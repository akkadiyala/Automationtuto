package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath= "//span[text()='My Account']")
	private WebElement myaccountdropmenu;
	
	@FindBy(linkText= "Login")
   private   WebElement login;
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public void clickonmyaccount() {
		myaccountdropmenu.click();
	}
	public void selectloginoption() {
		login.click();
	}
	public void selectregisteroption() {
		Register.click();
	}
}
