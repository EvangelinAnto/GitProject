package com.package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0th4xg5stn6wjl6yew7c3blgs800130.node0");
		    WebElement click = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		    click.click();
		    WebElement iAMhere = driver.findElement(By.xpath("//span[text()='I am here']"));
		    iAMhere.click();
	}
}



