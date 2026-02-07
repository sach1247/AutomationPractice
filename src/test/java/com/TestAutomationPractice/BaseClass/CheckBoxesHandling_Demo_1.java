package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesHandling_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement>check=driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
		System.out.println("total numbers of the checkbox on the webpage are:"+check.size());
		
		
		// to select the first two checkboxes
//		
//		for(int i=0;i<check.size()-1;i++)
//		{
//			check.get(i).click();
//		}
//		
		
		// to select the last two checkboxes
//		
//		for(int i=1;i<check.size();i++)
//		{
//			
//			check.get(i).click();
//		}
//	
		
		
		// to select the first and the last checkboxes
		
		for(int i=0;i<check.size();i++)
		{
			
			if(i==0 || i==2)
			{
				check.get(i).click();
			}
			
		}

	}

}
