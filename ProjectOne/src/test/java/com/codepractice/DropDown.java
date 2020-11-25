package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		s.selectByVisibleText("Alexa Skills");
		List<WebElement>l=s.getOptions();
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			//System.out.println(l.get(i).getText());
			System.out.println(l.get(i).getAttribute("text"));
		}

	}

}
