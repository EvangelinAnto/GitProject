package com.package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		List<WebElement> framesCount = driver.findElements(By.tagName("iframe"));
		System.out.println(framesCount.size());
		WebElement singleFrame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleFrame);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("AiiTE");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	}
	}



