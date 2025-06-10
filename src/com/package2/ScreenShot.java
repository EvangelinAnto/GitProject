package com.package2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alice\\eclipse-workspace\\Selenium\\SeleniumLaunch\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("F:\\Sample\\facebook.jpeg");
		FileHandler.copy(screenshot, Destination);
}
}