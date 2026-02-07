package com.TestAutomationPractice.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.BaseClass.BaseClass1;
import com.TestAutomationPractice.pageObjects.OrangeHrmLoginPage1;



public class TC_001_OrangeHrmLoginTest1 extends BaseClass1 {

	
	public OrangeHrmLoginPage1 p;
	
	@Test
	public void loginPage() {
	
	p=new OrangeHrmLoginPage1(driver);
	
	p.usernameField("Admin");
	log.info("username has entered succesfully");
	p.passwordField("admin123");
	log.info("password has entered successfully");
	p.submitButton();
	log.info("clicked on login button");
	
	Assert.assertEquals(p.verifyLoginStatus(),"Dashboard");
	Assert.assertTrue(true);
	log.info("assertion checked and verified successfully");
	
	
	
	
	
}
}
