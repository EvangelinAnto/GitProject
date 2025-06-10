package com.package2;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.get("https://letcode.in/dropdowns");
		    WebElement fruits = driver.findElement(By.id("fruits"));
		    Select s = new Select(fruits);
		    s.selectByIndex(5);
	}
	
}

