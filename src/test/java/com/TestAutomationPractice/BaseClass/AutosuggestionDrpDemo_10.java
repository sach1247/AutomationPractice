package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionDrpDemo_10 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement textEnter=driver.findElement(By.xpath("//textarea[@name='q']"));
		textEnter.sendKeys("sachin");
		
		
		List<WebElement>autoEles=driver.findElements(By.xpath("//div[@id='Alh6id']//ul//li[@role='presentation']"));
		System.out.println("total number  s of auto suggestion drps are:"+autoEles.size());
		
		
		  // Click on the first suggestion if available
        if (!autoEles.isEmpty()) {
            System.out.println("Clicking on: " + autoEles.get(0).getText());
            autoEles.get(0).click();
        } else {
            System.out.println("No auto-suggestions found.");
        }

	}

}
