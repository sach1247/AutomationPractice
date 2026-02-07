package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/category_products/3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String Winid=driver.getWindowHandle();
		System.out.println("window id of the first window is:"+Winid);
		
	
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		Set<String> windIds=driver.getWindowHandles();
		System.out.println("total window ids of the webpage are:"+windIds);
		
		
		ArrayList<String>mylist=new ArrayList<>(windIds);
		
		String ParentId=mylist.get(0);
		
		System.out.println("parent window id is:"+ParentId);
		
		
		String childId=mylist.get(1);
		System.out.println("child window is:"+childId);
		
		
		
		driver.switchTo().window(ParentId);
		System.out.println("successfully has switched into the parent window:"+ParentId);
		
		
		
		driver.switchTo().window(childId);
		System.out.println("Successfully has switched into the child window:"+childId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
