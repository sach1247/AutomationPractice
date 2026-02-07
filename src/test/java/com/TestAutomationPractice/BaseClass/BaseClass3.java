package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass3 {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setupData() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
	@AfterClass
	public void tearDownBrowser()
	{
		driver.quit();
	}

}


