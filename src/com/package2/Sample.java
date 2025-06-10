package com.package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	WebElement fe =driver.findElement(By.tagName("a"));
	System.out.println(fe);
	List<WebElement> elements = driver.findElements(By.tagName("a"));

	System.out.println(elements.size());
	for(int i = 0;i<elements.size();i++) {
		System.out.println(elements.get(i));
	}
	
	}

}



