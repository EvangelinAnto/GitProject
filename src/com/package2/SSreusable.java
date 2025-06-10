package com.package2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSreusable {
	public static WebDriver driver;

		public static void getScreenShot(String name) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			File Destination = new File("F:\\Sample name");
			FileHandler.copy(screenshot, Destination);
			
	
		}
}
