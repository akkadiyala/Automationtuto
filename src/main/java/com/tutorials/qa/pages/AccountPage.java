package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	@FindBy(linkText="Edit your account information")
	private WebElement edityouraccountinfo;
	
public AccountPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
}
public Boolean accounteditinfromessage() {
Boolean status=	edityouraccountinfo.isDisplayed();
return status;
	
}
}
