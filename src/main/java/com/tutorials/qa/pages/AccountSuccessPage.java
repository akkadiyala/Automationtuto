package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
	WebDriver driver;
	
	@FindBy(xpath =" //h1[text()='Your Account Has Been Created!']")

	private WebElement accountsucesspage;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public String accountsucessmessage() {
		String accountsuccessstatusactual=	accountsucesspage.getText();
		return accountsuccessstatusactual;
			
		}
}
