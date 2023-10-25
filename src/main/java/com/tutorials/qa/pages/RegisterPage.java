package com.tutorials.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	private WebElement firstnamefield;
	@FindBy(id="input-lastname")
	private	WebElement lastnamefield;
	
	@FindBy(id="input-email")
	private	WebElement emailfield;
	
	@FindBy(id="input-telephone")
	private	WebElement telephonefield;
	
	@FindBy(id="input-password")
	private	WebElement inputpasswordfield;

	@FindBy(id="input-confirm")
	private	WebElement inputconfirmfield;
	
	@FindBy(name="agree")
	private	WebElement checkboxagreefield;
	
	@FindBy(xpath="//input[@value='Continue']")
	private	WebElement clickcontinuefield;
	
	@FindBy(xpath = "//input[@name='newsletter'][@value='1']")
	private WebElement subscriberadiobutton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible' and contains(text(),'E-Mail Address is already registered!')]")
	private WebElement existingemailerror;
	
	
	

	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterfistname(String firstname) {
		
		firstnamefield.sendKeys(firstname);
	}
public void enterlastname(String lastname) {
		
	lastnamefield.sendKeys(lastname);
	}
public void enteremailfield(String email) {
	
	emailfield.sendKeys(email);
	}
public void entertelephonefield(String telephone) {
	
	telephonefield.sendKeys(telephone);
	}
public void enterinputpasswordfield(String password) {
	
	inputpasswordfield.sendKeys(password);
	}
public void enterinputconfirmfield(String Cpassword) {
	
	inputconfirmfield.sendKeys(Cpassword);
	}
public void clickoncheckboxagreefield() {
	
	checkboxagreefield.click();
	}
public void clickonclickcontinuefield() {
	
	clickcontinuefield.click();
	}
public void clickonsubscriberadiobutton() {
	
	subscriberadiobutton.click();
	}
public String getexistingmailerror() {
	
	String errormessage=existingemailerror.getText();
	return errormessage;
	}

}
