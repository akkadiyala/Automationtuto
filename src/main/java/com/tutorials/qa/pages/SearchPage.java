package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	@FindBy(linkText= "HP LP3065")
	private WebElement validHPprtoduct;
	
	@FindBy(xpath= "//div[@id='content']/p[text()='There is no product that matches the search criteria.']")
	private WebElement invalidHPprtoductmessage;
	
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public Boolean DISPLAYSTATUSOFHP() {
	Boolean status=	validHPprtoduct.isDisplayed();
	return status;
	}
	public String invaliderrormessageforproduct() {
		String actual=	invalidHPprtoductmessage.getText();
		return actual;
		}
}
