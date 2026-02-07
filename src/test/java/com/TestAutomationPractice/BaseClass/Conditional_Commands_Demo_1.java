package com.TestAutomationPractice.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_Commands_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement rad1=driver.findElement(By.xpath("//label//input[@value='radio1']"));
		
		boolean value1=rad1.isSelected();
		System.out.println(value1);
		
		if(rad1.isSelected())
		{
			System.out.println("the button is selected");
		}
		
		else
		{
			System.out.println("button is not selected");
		}
		
		WebElement scrollConfirmBtn=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", scrollConfirmBtn);
		
		
		boolean value2=scrollConfirmBtn.isEnabled();
		System.out.println(value2);		
		
		if(scrollConfirmBtn.isEnabled())
		{
			System.out.println("the button is enabled");
		}
		else
		{
			System.out.println("the button is not enabled and it is disabled");
		}
		
		
		WebElement textCheck=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
		boolean value3=textCheck.isDisplayed();
		System.out.println(value3);
		
		if(textCheck.isDisplayed())
		{
			System.out.println("the text is displying on the webpage of an application");
		}
		
		else
		{
			System.out.println("the text is not displaying on the webpage of an application");
		}
		
	}

}
