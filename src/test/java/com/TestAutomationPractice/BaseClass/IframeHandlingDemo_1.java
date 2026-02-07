package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandlingDemo_1 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement iframeWithFrameLinkClick=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", iframeWithFrameLinkClick);
		
		Thread.sleep(3000);
		iframeWithFrameLinkClick.click();
		
		
		// locate an element for the outer space 
		
		WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerFrame);
		
		// locate an element for the inner space
		
		WebElement innerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		
		
		WebElement textBox=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		
		
		Thread.sleep(4000);
		textBox.sendKeys("Welcome to the textbox handling demo");
		
		
		

	}

}
