package com.tutorials.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMS {
	WebDriver driver;
	@FindBy(xpath=	"//input[@type='email']")
	private WebElement emailbox;
	
	@FindBy(xpath=	"//input[@type='password']")
	private WebElement passwordbox;
	
	@FindBy(xpath=	"//button[@id='login_button']")
	private WebElement submitbutton;

	@FindBy(xpath=	"//button[text()='CLOCK OUT']")
	private WebElement clockoutbutton;
	@FindBy(xpath=	"//button[text()='CLOCK IN']")
	private WebElement clockinbutton;

public HRMS(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void enteremail(String email) {
	emailbox.sendKeys(email);
}
public void enterpassword(String password) {
	passwordbox.sendKeys(password);
}
public void clockin() {
	clockinbutton.click();
}
public void clockout() {
	clockoutbutton.click();
}


public void submit() {
	submitbutton.click();
}
}