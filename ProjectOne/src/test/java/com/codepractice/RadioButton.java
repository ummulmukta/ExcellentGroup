package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
	WebElement female=	driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	female.click();
		//boolean a=female.isDisplayed();
		System.out.println(female.isDisplayed());
		
		boolean b=female.isEnabled();
		System.out.println(b);
		
		boolean c=female.isSelected();
		System.out.println(c);
		
		
		
		
		

	}

}
