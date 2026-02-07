package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_Demo {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// css selector tag and id

		WebElement clickAlertBtn=driver.findElement(By.cssSelector("#alertbtn"));
		
		Thread.sleep(4000);
		clickAlertBtn.click();
		
		
		// to close the alert which is opened
		Alert myalert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		// tag and class
		
	//	WebElement blinkTextClick=driver.findElement(By.cssSelector(".blinkingText"));
		
	//	Thread.sleep(3000);
		//blinkTextClick.click();
		
		//  tag, class and attribute
		
		WebElement blinkTextClick=driver.findElement(By.cssSelector("a.blinkingText[class='blinkingText']"));
		
		Thread.sleep(3000);
		blinkTextClick.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// By.cssSelector("a.blinkingText[href='#']")
		
	}

}
