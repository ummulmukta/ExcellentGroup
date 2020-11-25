package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps extends Base {
	
	SigninPage sp;
	
	
	@Given("^user on home page$")
	public void user_on_home_page() throws Throwable {
		getDriver();
		sp=PageFactory.initElements(driver, SigninPage.class);
		
		
	   
	}

	@When("^user able to click signinbutton$")
	public void user_able_to_click_signinbutton() throws Throwable {
	   
		
		sp.getSignin();
	   
	}

	@When("^user can enter email$")
	public void user_can_enter_email() throws Throwable {
	   sp.getEmail();
	   
	}

	@When("^user can click continue$")
	public void user_can_click_continue() throws Throwable {
	   
	   
	}

	@When("^user can enter password$")
	public void user_can_enter_password() throws Throwable {


	}

	@When("^user click signin$")
	public void user_click_signin() throws Throwable {
	   
	   
	}

	@Then("^user able to go home signin successfully$")
	public void user_able_to_go_home_signin_successfully() throws Throwable {
	Assert.assertEquals(driver, "
			          Create your Amazon account 
			        ");   
	   System.out.println(driver.getTitle());
	   driver.quit();
	}


}
