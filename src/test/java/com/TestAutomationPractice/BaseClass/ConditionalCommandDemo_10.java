package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommandDemo_10 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(null));
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
		boolean value1=text.isDisplayed();
		
		if(text.isDisplayed())
		{
			
			System.out.println("text is visible on the webpage");
		}
		else {
			
			System.out.println("text is not visible on the webpage");
		}
		
		
		WebElement ene=driver.findElement(By.xpath("//button[text()='Home']"));
		
		boolean value2=ene.isEnabled();
		
		if(ene.isEnabled())
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
		
		
		WebElement sel=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		boolean value3=sel.isSelected();
		
		if(sel.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}

	}

}
