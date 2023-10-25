package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id=	"input-email")
	private WebElement emailenterbox;
	
	@FindBy(id=	"input-password")
	private WebElement passwordenterbox;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement emailnotcorrectwaringmessage;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void enteremail(String email) {
	emailenterbox.sendKeys(email);
}
public void enterpassword(String password) {
	passwordenterbox.sendKeys(password);
}
public void clickonlogin() {
	loginbutton.click();
}
public String warningmessageforemail() {
String actualerrorforwrongemail=	emailnotcorrectwaringmessage.getText();
return actualerrorforwrongemail;
}


}
