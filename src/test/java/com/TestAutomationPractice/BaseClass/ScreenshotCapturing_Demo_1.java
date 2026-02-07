package com.TestAutomationPractice.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotCapturing_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		
		File Tfile=new File("C:\\Users\\a2z\\eclipse-workspace\\TestAutomationPractice\\Screenshots\\screenshot.jpg");
		
		Thread.sleep(3000);
		FileUtils.copyFile(sourceFile, Tfile);
		
		
		System.out.println("successfully has captured the screenshot of the webpage");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
