package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowserTest {
 public WebDriver driver;
 @Parameters("browser")
	@Test
	public void SampleCrossBrowser(String s) throws Throwable {
		if (s.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./BrowserFinal/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(s.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		Screenshot.screenShot(driver,"test");
		
		
		
		
		
		
	}
	
	
}
