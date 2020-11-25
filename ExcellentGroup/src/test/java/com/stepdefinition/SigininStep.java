package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigininStep extends Base{

SigninPage sp;
@Given("^user are on home page$")
public void user_are_on_home_page() throws Throwable {
	getDriver();
	sp=PageFactory.initElements(driver, SigninPage.class);
    
}

@When("^user can click siginin button$")
public void user_can_click_siginin_button() throws Throwable {
  sp.getsign();
    
}

@When("^user can enter email$")
public void user_can_enter_email() throws Throwable {
    sp.getemail();
    
}

@When("^user can click continue button$")
public void user_can_click_continue_button() throws Throwable {
    sp.getenter();
    
}

@When("^user enter password$")
public void user_enter_password() throws Throwable {
    
    
}

@When("^user click signin$")
public void user_click_signin() throws Throwable {
    
    
}

@Then("^user able to go signin page successfully$")
public void user_able_to_go_signin_page_successfully() throws Throwable {
    
    
}



}
