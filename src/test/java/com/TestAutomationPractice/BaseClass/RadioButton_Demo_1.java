package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(null));
//        
        List<WebElement>radBtns=driver.findElements(By.xpath("//div[@id='radio-btn-example']//input[@name='radioButton']"));
        System.out.println("total numbers of the radio buttons are:"+radBtns.size());
        
        
        // in order to select the perticular radio button we can select from the following logic
        
        for(int i=0;i<radBtns.size();i++)
        {
        	
        	if(i==1)
        	{
        		
        		radBtns.get(i).click();
        	}
        	
    
        	
        }
		
		
		
		
		
		
		
		
		//
	}

}
