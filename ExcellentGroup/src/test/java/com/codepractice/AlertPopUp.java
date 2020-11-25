package com.codepractice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://card.americanexpress.com/");
		//driver.get("http://google.com");
		//driver.findElement(By.xpath("//button[@id='u_0_b']")).getCssValue("color");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//WebElement t=driver.findElement(By.xpath("//input[@name='q']"));
	//t.sendKeys("American express");
	//driver.findElement(By.xpath("//span[contains(text(),'American Express')]")).click();
	//driver.findElement(By.xpath("//div[contains(text(),'AmericanExpress.com - Official Site')]")).click();
	
	//t.click();
		//Actions a=new Actions(driver);
		//a.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		//driver.findElement(By.xpath("//input[@name='submit']")).submit();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//System.out.println(driver.switchTo().alert().getText());
		
		
		//String s=driver.switchTo().alert().getText();
		//Assert.assertEquals(driver.switchTo().alert().getText(), " really want to delete this Customer?");
		//Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
		//driver.findElement(By.xpath("//li[@id='js-dropdown-cash-back']")).click();
		//driver.findElement(By.xpath("(//li[@id='js-dropdown-cash-back']//a)[3]")).click();
		// Get the all WebElements inside the dropdown in List  
		//List<WebElement> dropdown_list =  driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		
		 // List<WebElement>l=driver.findElements(By.xpath("//li[@id='js-dropdown-cash-back']//a")); 
		  String mainWindow =driver.getWindowHandle();
		  
		   Set<String> openedWindows =driver.getWindowHandles();
		  if(openedWindows.size() > 1) {
		   for(String newWindow : openedWindows)
		  { 
			  driver.switchTo().window(newWindow); 
		  
		  
		  driver.close(); // Log.info("Closing the current Opened Window - Invoice");
		  driver.switchTo().window(mainWindow); // Printing the amount of WebElements
		  List<WebElement>l=driver.findElements(By.xpath("//li[@id='js-dropdown-cash-back']//a"));
				  
				  //for(int i=0;i<l.size();i++) {
				  //driver.findElement(By.xpath("(//li[@id='js-dropdown-cash-back']//a)[3]")). click(); //String s=l.get(i).getText();
				  //if(s.contentEquals("American Express Cash Magnet® Card")) {
				  //l.get(i).click(); //}
				 	//}}

		  //System.out.println("The Options in the Dropdown are: "+ l.size());
		  
		  // Condition to get the WebElement for list and Click over "Angular" option
		  for(int i=0; i<l.size(); i++) { // Printing All the options from the dropdown
		  System.out.println(l.get(i).getText());
		  
		  // Checking the condition whether option in text "Angular" is comming
		  if(l.get(i).getText().contains("American Express Cash Magnet® Card")) {
		  l.get(i).click();}
		  
		  // Breaking the condition if the condition get satisfied //break; } } }
		  
		  
		  //List<WebElement>l=driver.findElements(By.xpath(
		 // "//li[@id='js-dropdown-cash-back']//a"));
		  
		  //for(int i=0;i<l.size();i++) {
		  //driver.findElement(By.xpath("(//li[@id='js-dropdown-cash-back']//a)[3]")). click(); //String s=l.get(i).getText();
		  //if(s.contentEquals("American Express Cash Magnet® Card")) {
		  //l.get(i).click(); //}
		  }}}}}


