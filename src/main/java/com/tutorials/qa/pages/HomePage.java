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
	
	@FindBy(name="search")
	private WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchbutton;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public void clickonmyaccount() {
		myaccountdropmenu.click();
	}
	public LoginPage selectloginoption() {
		login.click();
		return new LoginPage(driver);
	}
	public RegisterPage selectregisteroption() {
		Register.click();
		return new RegisterPage(driver);
	}
	public void searchbox(String item) {
		search.sendKeys(item);
	}
	public SearchPage clicksearchbox() {
		searchbutton.click();
		return new SearchPage(driver);
	}
	
}
