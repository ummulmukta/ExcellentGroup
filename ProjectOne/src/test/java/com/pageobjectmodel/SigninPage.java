package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement siginin;
	
	public WebElement getSignin() {
		siginin.click();
		
		
		
		return siginin;
		
	}
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	public WebElement getEmail() {
		email.sendKeys("ummulmukta@gmail.com");
		
		
		return email;
		
	}
	
	
	
	
}
