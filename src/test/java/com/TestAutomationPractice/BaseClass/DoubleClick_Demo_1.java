package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Buttons=driver.findElement(By.xpath("//h1[text()='Buttons']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Buttons);
		
		
		
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.doubleClick(doubleClick).click().perform();
		
		System.out.println("successfully has performed the double click action");

	}

}
