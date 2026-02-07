package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Method_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("the title of the webpage is:"+driver.getTitle());
		System.out.println("the html code for this page is:"+driver.getPageSource());
		System.out.println("the current url of the page is:"+driver.getCurrentUrl());

	}

}
