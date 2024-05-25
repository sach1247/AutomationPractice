package com.TestAutomationPractice.testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.AutomationExerciseLoginPage;

public class TC_001_AutomationExerciseLoginTest extends BaseClass {
     //WebDriver driver;
	 public AutomationExerciseLoginPage lp;
	 
	
	 
	 @Test
	 public void testLoginCredentials() throws FileNotFoundException {
		
		
		lp=new AutomationExerciseLoginPage(driver);
		
		lp.enterEmail("sachshelpat@gmail.com");
		lp.enterPass("Pass@&12345");
		
		
		lp.clickOnLogin();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
