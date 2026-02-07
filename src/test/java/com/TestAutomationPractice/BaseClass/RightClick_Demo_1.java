package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Buttons=driver.findElement(By.xpath("//h1[text()='Buttons']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Buttons);
		
		
		
		WebElement rightClick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		act.contextClick(rightClick).click().perform();
		
		System.out.println("successfully has performed the right click action on the button");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
