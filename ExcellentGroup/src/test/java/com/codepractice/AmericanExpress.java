package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanExpress {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.yahoo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  List<WebElement>l=driver.findElements(By.xpath("//ul[@class='_yb_10gke _yb_hujth']//li"));
	  System.out.println("The Options in the Dropdown are: "+ l.size());
	  
	  // Condition to get the WebElement for list and Click over "Angular" option
	  for(int i=0; i<l.size(); i++) { // Printing All the options from the dropdown
	  System.out.println(l.get(i).getText());
	  }
	  // Checking the condition whether option in text "Angular" is comming
	 // if(l.get(i).getText().contains("NEWS"))
	 // String x=l.get(i).getText();
	 // System.out.println(x);
	 // if(l.get(i).getText().contentEquals("NEWS")){
	 // l.get(i).click();}
	  
	  
	
}
}
