package com.TestAutomationPractice.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Commands_Demo_1 {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.google.com/search?q=infosys+careers&oq=&gs_lcrp=EgZjaHJvbWUqCQgCECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQoxNzQ4MTNqMGo3qAIIsAIB8QV1Pkpa0ZAZyw&sourceid=chrome&ie=UTF-8&zx=1766235710030&no_sw_cr=1");
		
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("successfully closed the window which is currently opened");
		
		
		
		Thread.sleep(3000);
		
		//driver.quit();

	}

}
