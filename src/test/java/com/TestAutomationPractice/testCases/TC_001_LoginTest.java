package com.TestAutomationPractice.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.LoginPage;
import com.TestAutomationPractice.pageObjects.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TC_001_LoginTest extends BaseClass {

public LoginPage lp;
public LogoutPage lg;




@Test
public void testLogin () {
	
	lp=new LoginPage(driver);
	lg=new LogoutPage(driver);
   
	lp.setUsername("practice");
	log.info("successfuly enter username as practice");
	lp.setPassword("SuperSecretPassword!");
	log.info("successfully enter password as SuperSecretPassword");
	lp.clickOnLogin();
	log.info("successully click on login");
	
	//Assert.assertEquals(lp.checkLogout(), "you logged out successfully");
	Assert.assertEquals(lg.checkLoggedSuccessMessage(), "You logged into a secure area!");
}



}
