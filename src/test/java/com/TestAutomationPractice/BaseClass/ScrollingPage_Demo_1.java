package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage_Demo_1 {
  WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(null));
		
		
		
		// in order to scroll upto the perticular element the command is
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		WebElement textScroll=driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", textScroll);
		
		
		// to sroll upto bottom 
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		// to scroll by pixel
		
		js.executeScript("Window.scrollBy(0,500)");
		
		
		System.out.println("successfully has handled the scrolling page");
		

	}

}
