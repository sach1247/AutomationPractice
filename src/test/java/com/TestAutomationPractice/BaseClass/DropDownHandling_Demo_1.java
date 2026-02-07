package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_Demo_1 {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement dropBtn=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sl=new Select(dropBtn);
		
		Thread.sleep(3000);
		sl.selectByValue("option3"); 
		
		System.out.println("successfully has handled the dropdown and selected the third dripdown option from the webpage");
		
		
		
		
		
		
		
		

	}

}
