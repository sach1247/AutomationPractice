package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null));
//		
		WebElement scrollAlertText=driver.findElement(By.xpath("//h1[text()='Alerts']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollAlertText);
		
		
		
		WebElement alertPrompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		alertPrompt.click();
		
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("welcome to the alert handling demo");
		
		//driver.switchTo().alert().accept(); // to close the alert by clicking on the ok button
		
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss(); // to close the alert by clicking on the cancel button
		
		
		
		
		

	}

}
