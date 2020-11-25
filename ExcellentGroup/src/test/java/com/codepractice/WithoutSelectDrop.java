package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSelectDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//ul[@class='mega-espot-top'])[2]")));
		//driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();
		//driver.findElement(By.xpath("(//ul[@class='mega-espot-top'])[2]")).click();
		//List<WebElement>l=driver.findElements(By.xpath("//span[contains(text(),'All Categories')]//div"));
		//driver.switchTo().frame(0);
		//System.out.println(l.size());
		driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		//driver.findElement(By.xpath("(//span[contains(text(),'Holiday Shop')])[1]")).click();
		WebElement element1 `= wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Holiday Shop')])[1]")));
		element1.click();
		//System.out.println(l.size());
		/*
		 * for(int i=0;i<l.size();i++) { System.out.println(l.get(i).getText()); }
		 */
		//(//span[contains(text(),'Holiday Shop')])[1]
		/*
		 * for(WebElement ele:l) {
		 * 
		 * String date=ele.getText();
		 * 
		 * if(date.contentEquals("Holiday Shop")) { ele.click(); break; }
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
	}

}
