package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesHandlingDemo_10 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// retrieve all the cookies and print it
		
		Set<Cookie>cookies=driver.manage().getCookies();
		
		System.out.println("total numbers of the cookies on the webpage are:"+cookies.size());
		
		// print cookies and its name
		for(Cookie c:cookies)
		{
			
			System.out.println(c.getName()+"    "+c.getValue());
		
		
		// add the cookies and then print it
		Cookie Cobj=new Cookie("sach","2748");
		
		driver.manage().addCookie(Cobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("cookies after adding new one are:"+cookies.size());
		
		
		// to delete the perticular cookie and then print all the cookies
		
		driver.manage().deleteCookie(Cobj);
		
		System.out.println("cookies after deleting one are:"+cookies.size());
		
		//to delete all the cookies 
		
		driver.manage().deleteAllCookies();
		
		System.out.println("cookies after deleting the all:"+cookies.size());

	}

}
}
