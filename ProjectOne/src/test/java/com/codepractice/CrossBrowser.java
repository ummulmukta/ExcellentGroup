package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
WebDriver driver;
	@Test
	@Parameters("browser")
	public void getBrowser(String s) {
		
		
		if(s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		
		else if(s.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
	
	
	
	
	
}
