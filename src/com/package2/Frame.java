package com.package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	
		public static void main(String[] args) {
			//hello
			System.setProperty("webdriver.chrome.driver","C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			List<WebElement> framesCount = driver.findElements(By.tagName("frame"));
			System.out.println(framesCount.size());
			driver.switchTo().frame(0);
			WebElement customerId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
			customerId.sendKeys("123456");
		}
		}
	


