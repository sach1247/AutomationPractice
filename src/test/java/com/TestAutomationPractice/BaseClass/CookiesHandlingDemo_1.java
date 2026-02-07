package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class CookiesHandlingDemo_1 {
    WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		// in order to retrieve and get all the cookies
		
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println("cookies on the webpage are:"+cookies.size());
		
		
		// in order to print the cookies and its name
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+":"+ cookie.getValue());
		}
		
		
		// in order to add the cookies
		
		Cookie Cobj=new Cookie("sachshel","3877");
		
		driver.manage().addCookie(Cobj);
		
		cookies=driver.manage().getCookies();
		
		System.out.println("cookies after adding new one:"+cookies.size());
		
		
		// to delete perticular cookie
		
		driver.manage().deleteCookie(Cobj);
		cookies=driver.manage().getCookies();
		System.out.println("cookies after deleting the new one are:"+cookies.size());
		
		// to delete all the cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		
		System.out.println("Cookies after deleting the all are:"+cookies.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
