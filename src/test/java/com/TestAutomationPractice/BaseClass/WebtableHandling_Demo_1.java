package com.TestAutomationPractice.BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandling_Demo_1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// to get the total numbers of the element on the webpage are
		List<WebElement> webtableDemo=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		
		System.out.println("total elemnts on the webpage are:"+webtableDemo.size());
		
		// to get the specific element from the webTable 
		
		WebElement Sele=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[4]//td[4]"));
		
		String city=Sele.getText();
		System.out.println("The specific element name is:"+city);
		
		// to retrive the total specific column data
		
		List<WebElement>ThirdColumnData=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[3]"));
		 System.out.println("the elements which are in the third column:"+ThirdColumnData.size());

		
		
		
		

	}

}
