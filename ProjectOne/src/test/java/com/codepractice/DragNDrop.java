package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement a=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='draggable']")));
				 
		//driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		//WebElement a=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement b=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='droppable']")));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(a, b).build().perform();
		// org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: 
		//OfBoundsException: (-9862, 206) is out of bounds of viewport width (1283) and height (699)
		/*
		 * driver.get("http://executeautomation.com/demosite/index.html"); WebDriverWait
		 * wait = new WebDriverWait(driver, 20); WebElement menu=
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("Automation Tools"))
		 * );
		 * 
		 * Actions action = new Actions(driver);
		 * action.moveToElement(menu).build().perform(); WebElement selenium
		 * =wait.until(ExpectedConditions.elementToBeClickable(By.id("Selenium")));
		 * action.moveToElement(selenium).build().perform(); WebElement
		 * seleniumWebDriver =wait.until(ExpectedConditions.elementToBeClickable(By.
		 * id("Selenium WebDriver")));
		 * action.moveToElement(seleniumWebDriver).click().build().perform();
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		//WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
	}

}
