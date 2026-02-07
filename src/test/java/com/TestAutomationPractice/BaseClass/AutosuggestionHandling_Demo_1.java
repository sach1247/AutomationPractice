package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionHandling_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		   driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("salman");
		   
		    java.util.List<WebElement> autoSuggestion=driver.findElements(By.xpath("//ul[@class='G43f7e']//li[@data-view-type='1']"));
		    System.out.println("total number of the checkBoxes on the webpage are:"+autoSuggestion.size());
		    
		    
		    for(int i=0;i<=autoSuggestion.size();i++)
		    {
		    	
		    	if(i==3)
		    	{
		    		
		    		Thread.sleep(4000);
		    		autoSuggestion.get(i).click();
		    	}
		    }
		    System.out.println("successfully has performed the autosuggestion operation in the selenium");

	}

}
