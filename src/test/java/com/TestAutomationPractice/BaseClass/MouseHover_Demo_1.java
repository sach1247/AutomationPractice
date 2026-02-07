package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement mouseHover=driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
		
		
		WebElement mouseHover1=driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement reload=driver.findElement(By.xpath("//a[text()='Reload']"));
		
		
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
	   act.moveToElement(mouseHover1).moveToElement(reload).click().perform();
		
		
		
		
		
	}
	

}
