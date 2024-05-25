package com.TestAutomationPractice.BaseClass;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;  

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
    public Properties pf;
	public Logger log;
	@BeforeClass
//	@Parameters({"browser"})
	public void setUp() throws IOException {
		 FileReader file=new FileReader(".//src/test/resources/config.properties");
		 pf=new Properties();
		 pf.load(file);
		
		 
		 
		log=LogManager.getLogger(this.getClass());
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
//		switch(br.toLowerCase())
//		{
//		case "chrome":WebDriverManager.chromedriver().setup();
//					  driver=new ChromeDriver();
//					  break;
//					
//		case "edge":WebDriverManager.edgedriver().setup();
//					driver=new EdgeDriver();
//					break;
//					
//		default: System.out.println("No Matching browser found");
//					return;
//		
//		}
		
		
		//driver.get("https://practice.expandtesting.com/login");
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.get(pf.getProperty("url"));
		
        //driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}
	
	//WE CAN ADD HERE @DataProvider to achieve the data driven testing.


}
